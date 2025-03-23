/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import EstructurasDeDatos.*;
/**
 * Clase encargada de visualizar un árbol dicotómico utilizando la librería
 * GraphStream.
 *
 * @author Luis, Zadkiel Avendano
 */
import org.graphstream.ui.view.Viewer;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;

public class VisualizadorArbol {

    private Graph graph;
    public String styleSheet
            = "node.especie { fill-color: green; } "
            + // Estilo para nodos de especie
            "node.pregunta { fill-color: brown; } "
            + // Estilo para nodos de pregunta
            "node { text-size: 18; }"; // Estilo común para todos los nodos

    /**
     * Constructor de la clase VisualizadorArbol. Inicializa el gráfico para la
     * visualización del árbol.
     */
    public VisualizadorArbol() {
        // Inicializar el gráfico
        graph = new SingleGraph("Árbol Dicotómico");
    }

    /**
     * Muestra el árbol dicotómico en una ventana gráfica.
     *
     * @param raiz El nodo raíz del árbol que se desea visualizar.
     */
    public void mostrarArbol(Nodo raiz) {
        System.setProperty("org.graphstream.ui", "swing");

        // Limpiar el gráfico si ya tiene nodos
        graph.clear();

        // Agregar nodos y aristas recursivamente
        agregarNodosYAristas(raiz, null);

        // Aplicar la hoja de estilos al gráfico
        graph.setAttribute("ui.stylesheet", styleSheet);

        // Mostrar el gráfico en una ventana
        Viewer viewer = graph.display();
        viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);
    }

    /**
     * Método recursivo para agregar nodos y aristas al gráfico.
     *
     * @param nodoActual El nodo actual que se está procesando.
     * @param idPadre El ID del nodo padre, o null si es la raíz.
     */
    private void agregarNodosYAristas(Nodo nodoActual, String idPadre) {
        if (nodoActual == null) {
            return;
        }

        // Crear un ID único para el nodo actual
        String idActual;
        if (nodoActual.especie != null) {
            // Si es una especie, usamos el nombre de la especie como ID
            idActual = nodoActual.especie;
        } else {
            // Si es una pregunta, usamos la pregunta como ID, pero le agregamos un sufijo único
            idActual = nodoActual.pregunta + "_" + System.identityHashCode(nodoActual);
        }

        // Agregar el nodo actual al gráfico (si no existe)
        if (graph.getNode(idActual) == null) {
            Node node = graph.addNode(idActual);
            node.setAttribute("ui.label", nodoActual.pregunta != null ? nodoActual.pregunta : nodoActual.especie);

            // Asignar clase CSS según el tipo de nodo
            if (nodoActual.especie != null) {
                node.setAttribute("ui.class", "especie"); // Especie → Verde
            } else {
                node.setAttribute("ui.class", "pregunta"); // Pregunta → Marrón
            }
        }

        // Si hay un nodo padre, agregar una arista entre el padre y el nodo actual
        if (idPadre != null) {
            String idArista = idPadre + "-" + idActual;
            if (graph.getEdge(idArista) == null) {
                graph.addEdge(idArista, idPadre, idActual);
            }
        }

        // Recursivamente agregar los nodos hijos
        agregarNodosYAristas(nodoActual.si, idActual);
        agregarNodosYAristas(nodoActual.no, idActual);
    }
}
