/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructurasDeDatos;

/**
 * La clase Nodo representa un nodo en una estructura de datos de árbol binario.
 * Cada nodo puede ser un nodo intermedio (con una pregunta) o un nodo hoja (con
 * una especie).
 *
 * @author Luis, Zadkiel Avendano
 */
public class Nodo {

    /**
     * La pregunta asociada al nodo (si es un nodo intermedio).
     */
    public String pregunta;

    /**
     * La especie asociada al nodo (si es un nodo hoja).
     */
    public String especie;

    /**
     * Referencia al nodo hijo para la respuesta "Sí".
     */
    public Nodo si;

    /**
     * Referencia al nodo hijo para la respuesta "No".
     */
    public Nodo no;

    /**
     * Constructor para nodos intermedios (con pregunta).
     *
     * @param pregunta La pregunta asociada al nodo intermedio.
     */
    public Nodo(String pregunta) {
        this.pregunta = pregunta;
        this.especie = null;
        this.si = null;
        this.no = null;
    }

    /**
     * Constructor para nodos hoja (con especie).
     *
     * @param especie La especie asociada al nodo hoja.
     * @param esEspecie Un indicador booleano para diferenciar este constructor
     * del de nodos intermedios. No se utiliza directamente en la lógica del
     * nodo.
     */
    public Nodo(String especie, boolean esEspecie) {
        this.especie = especie;
        this.pregunta = null;
        this.si = null;
        this.no = null;
    }

    /**
     * Verifica si el nodo es una hoja (es decir, si tiene una especie
     * asociada).
     *
     * @return `true` si el nodo es una hoja (tiene una especie), `false` en
     * caso contrario.
     */
    public boolean esHoja() {
        return especie != null;
    }
}
