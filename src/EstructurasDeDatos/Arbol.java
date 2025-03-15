/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructurasDeDatos;

/**
 *
 * @author Luis
 */
public class Arbol {

    private Nodo raiz;

    public Arbol() {
        raiz = null;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public String buscarPorArbol(String especie, Nodo nodo) {
        if (nodo == null) {
            return null;
        }

        if (nodo.especie != null && nodo.especie.equals(especie)) {
            return obtenerCamino(nodo);
        }

        String resultado = buscarPorArbol(especie, nodo.si);
        if (resultado != null) {
            return resultado;
        }

        return buscarPorArbol(especie, nodo.no);
    }

    private String obtenerCamino(Nodo nodo) {
        StringBuilder camino = new StringBuilder();
        while (nodo != null) {
            if (nodo.pregunta != null) {
                camino.insert(0, nodo.pregunta + " -> ");
            }
            nodo = nodo.no != null ? nodo.no : nodo.si; // Retroceder en el árbol
        }
        return camino.toString();
    }

    public void mostrarArbol() {
        if (raiz != null) {
            mostrarNodo(raiz, 0); // Comenzar el recorrido desde la raíz
        } else {
            System.out.println("El árbol está vacío.");
        }
    }

    private void mostrarNodo(Nodo nodo, int nivel) {
        if (nodo == null) {
            return;
        }

        // Mostrar la pregunta del nodo actual
        for (int i = 0; i < nivel; i++) {
            System.out.print("  "); // Indentación para mostrar la jerarquía
        }
        System.out.println("Pregunta: " + nodo.pregunta);

        // Si el nodo tiene una especie asignada, mostrarla
        if (nodo.especie != null) {
            for (int i = 0; i < nivel + 1; i++) {
                System.out.print("  ");
            }
            System.out.println("Especie: " + nodo.especie);
        }

        // Recorrer el subárbol "Sí" (si existe)
        if (nodo.si != null) {
            for (int i = 0; i < nivel + 1; i++) {
                System.out.print("  ");
            }
            System.out.println("Respuesta: Sí");
            mostrarNodo(nodo.si, nivel + 1); // Recursión para el subárbol "Sí"
        }

        // Recorrer el subárbol "No" (si existe)
        if (nodo.no != null) {
            for (int i = 0; i < nivel + 1; i++) {
                System.out.print("  ");
            }
            System.out.println("Respuesta: No");
            mostrarNodo(nodo.no, nivel + 1); // Recursión para el subárbol "No"
        }
    }
}
