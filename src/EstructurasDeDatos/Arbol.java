/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructurasDeDatos;

/**
 *
 * @author Luis, Zadkiel Avendano
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

    public String InOrder(String nombre) {

        return InOrderRec(raiz, "", nombre);
    }

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
