/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructurasDeDatos;

/**
 * Clase que representa un árbol dicotómico utilizado para almacenar y buscar
 * especies.
 *
 * @author Luis, Zadkiel Avendano
 */
public class Arbol {

    private Nodo raiz;

    /**
     * Constructor de la clase Arbol. Inicializa el árbol con una raíz nula.
     */
    public Arbol() {
        raiz = null;
    }

    /**
     * Obtiene la raíz del árbol.
     *
     * @return El nodo raíz del árbol.
     */
    public Nodo getRaiz() {
        return raiz;
    }

    /**
     * Establece la raíz del árbol.
     *
     * @param raiz El nodo que se establecerá como raíz del árbol.
     */
    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    /**
     * Realiza un recorrido In-Order en el árbol para buscar una especie.
     *
     * @param nombre El nombre de la especie que se desea buscar.
     * @return Una cadena que representa la ruta de la especie encontrada.
     */
    public String InOrder(String nombre) {

        return InOrderRec(raiz, "", nombre);
    }

    /**
     * Método recursivo para realizar el recorrido In-Order.
     *
     * @param root El nodo actual en el recorrido.
     * @param route La ruta acumulada hasta el momento.
     * @param nombre El nombre de la especie que se desea buscar.
     * @return Una cadena que representa la ruta de la especie encontrada.
     */
    private String InOrderRec(Nodo root, String route, String nombre) {
        if (root.si != null) {
            route = InOrderRec(root.si, route, nombre);
        }

        if (root.especie != null) {
            if (root.especie.toUpperCase().equals(nombre)) {

                route += root.especie;
            }

        }

        if (root.no != null) {
            route = InOrderRec(root.no, route, nombre);

        }
        return route;
    }

    /**
     * Busca una especie en el árbol y devuelve la ruta de preguntas y
     * respuestas para encontrarla.
     *
     * @param nombre El nombre de la especie que se desea buscar.
     * @return Una cadena que describe la ruta para encontrar la especie.
     */
    public String buscarEspecie(String nombre) {
        return buscarEspecieRec(raiz, nombre.toUpperCase(), "");
    }

    /**
     * Método recursivo para buscar una especie en el árbol.
     *
     * @param root El nodo actual en la búsqueda.
     * @param nombre El nombre de la especie que se desea buscar.
     * @param pasos La ruta acumulada de preguntas y respuestas.
     * @return Una cadena que describe la ruta para encontrar la especie.
     */
    private String buscarEspecieRec(Nodo root, String nombre, String pasos) {
        if (root == null) {
            return "Especie no encontrada";
        }
        if (root.especie != null && root.especie.toUpperCase().equals(nombre)) {
            return pasos + "Especie encontrada: " + root.especie;
        }
        if (root.pregunta != null) {
            String rutaSi = buscarEspecieRec(root.si, nombre, pasos + "Pregunta: " + root.pregunta + "\nRespuesta: Sí\n");
            if (!rutaSi.contains("no encontrada")) {
                return rutaSi;
            }

            String rutaNo = buscarEspecieRec(root.no, nombre, pasos + "Pregunta: " + root.pregunta + "\nRespuesta: No\n");
            return rutaNo;
        }

        return "Especie no encontrada";
    }

    /**
     * Muestra el árbol en la consola, incluyendo preguntas, respuestas y
     * especies.
     */
    public void mostrarArbol() {
        if (raiz != null) {
            mostrarNodo(raiz, 0); // Comenzar el recorrido desde la raíz
        } else {
            System.out.println("El árbol está vacío.");
        }
    }

    /**
     * Método recursivo para mostrar un nodo y sus subárboles.
     *
     * @param nodo El nodo actual que se está mostrando.
     * @param nivel El nivel de profundidad del nodo en el árbol.
     */
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
