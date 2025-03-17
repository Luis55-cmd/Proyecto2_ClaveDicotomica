/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Luis
 */
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileReader;
import java.io.IOException;
import EstructurasDeDatos.*;


public class CargadorJSON {

    public static Arbol cargarArbol(String rutaArchivo) throws IOException {

        
        Arbol arbol = new Arbol();
        FileReader reader = new FileReader(rutaArchivo);
        StringBuilder jsonText = new StringBuilder();
        int character;
        while ((character = reader.read()) != -1) {
            jsonText.append((char) character);
        }
        reader.close();

        JSONObject jsonObject = new JSONObject(jsonText.toString());

        // Obtener la primera clave del JSON (la clave raíz)
        String claveRaiz = jsonObject.keys().next();

        // Verificar si la clave raíz tiene un array asociado
        if (!(jsonObject.get(claveRaiz) instanceof JSONArray)) {
            throw new IOException("El archivo JSON no tiene un array en la clave raíz.");
        }

        JSONArray arboles = jsonObject.getJSONArray(claveRaiz);

        // Crear un array para almacenar los nodos por pregunta
        Nodo[] nodos = new Nodo[100]; // Tamaño inicial arbitrario
        int numNodos = 0;

        // Crear la raíz del árbol (la primera pregunta del JSON)
        String primeraPregunta = obtenerPrimeraPregunta(arboles);
        Nodo raiz = new Nodo(primeraPregunta);
        nodos[numNodos++] = raiz;
        arbol.setRaiz(raiz);

        // Recorrer cada especie en el JSON
        for (int i = 0; i < arboles.length(); i++) {
            JSONObject especieObject = arboles.getJSONObject(i);
            String nombreEspecie = especieObject.keys().next(); // Obtiene el nombre de la especie
            JSONArray preguntas = especieObject.getJSONArray(nombreEspecie);

            Nodo actual = raiz; // Comenzar desde la raíz

            // Recorrer las preguntas para esta especie
            for (int j = 0; j < preguntas.length(); j++) {
                JSONObject pregunta = preguntas.getJSONObject(j);
                String textoPregunta = pregunta.keys().next(); // Obtiene la pregunta
                boolean respuesta = pregunta.getBoolean(textoPregunta);

                // Buscar el nodo en el array
                Nodo nodoActual = buscarNodo(nodos, numNodos, textoPregunta);

                // Si el nodo no existe, lo creamos y lo agregamos al array
                if (nodoActual == null) {
                    nodoActual = new Nodo(textoPregunta);
                    nodos[numNodos++] = nodoActual;
                }

                // Si es la última pregunta, asignamos la especie a un nodo hijo
                if (j == preguntas.length() - 1) {
                    // Crear un nodo hijo para la especie
                    Nodo nodoEspecie = new Nodo(nombreEspecie);
                    nodoEspecie.especie = nombreEspecie; // Asignar la especie al nodo hijo

                    // Enlazar el nodo actual con el nodo hijo según la respuesta
                    if (respuesta) {
                        nodoActual.si = nodoEspecie; // Asignar hijo "Sí"
                    } else {
                        nodoActual.no = nodoEspecie; // Asignar hijo "No"
                    }
                } else {
                    // Obtenemos la siguiente pregunta
                    JSONObject siguientePregunta = preguntas.getJSONObject(j + 1);
                    String siguienteTextoPregunta = siguientePregunta.keys().next();

                    // Buscar el nodo de la siguiente pregunta
                    Nodo siguienteNodo = buscarNodo(nodos, numNodos, siguienteTextoPregunta);

                    // Si no existe, lo creamos y lo agregamos al array
                    if (siguienteNodo == null) {
                        siguienteNodo = new Nodo(siguienteTextoPregunta);
                        nodos[numNodos++] = siguienteNodo;
                    }

                    // Enlazamos el nodo actual con el siguiente según la respuesta
                    if (respuesta) {
                        nodoActual.si = siguienteNodo; // Asignar hijo "Sí"
                    } else {
                        nodoActual.no = siguienteNodo; // Asignar hijo "No"
                    }
                }
            }
        }

        return arbol;

    }

    private static String obtenerPrimeraPregunta(JSONArray arboles) {
        // Obtener la primera pregunta del primer elemento del JSON
        JSONObject primeraEspecie = arboles.getJSONObject(0);
        String nombreEspecie = primeraEspecie.keys().next();
        JSONArray preguntas = primeraEspecie.getJSONArray(nombreEspecie);
        JSONObject primeraPregunta = preguntas.getJSONObject(0);
        return primeraPregunta.keys().next();
    }

    private static Nodo buscarNodo(Nodo[] nodos, int numNodos, String textoPregunta) {
        for (int i = 0; i < numNodos; i++) {
            if (nodos[i].pregunta.equals(textoPregunta)) {
                return nodos[i];
            }
        }
        return null;
    }
}
