/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructurasDeDatos;

/**
 *
 * @author Luis, Zadkiel Avendano
 */
public class Nodo {

    public String pregunta;  // La pregunta asociada al nodo (si es un nodo intermedio)
    public String especie;   // La especie asociada al nodo (si es un nodo hoja)
    public Nodo si;         // Referencia al nodo hijo para la respuesta "Sí"
    public Nodo no;         // Referencia al nodo hijo para la respuesta "No"

    // Constructor para nodos intermedios (con pregunta)
    public Nodo(String pregunta) {
        this.pregunta = pregunta;
        this.especie = null;
        this.si = null;
        this.no = null;
    }

    // Constructor para nodos hoja (con especie)
    public Nodo(String especie, boolean esEspecie) {
        this.especie = especie;
        this.pregunta = null;
        this.si = null;
        this.no = null;
    }

    // Método para verificar si el nodo es una hoja (especie)
    public boolean esHoja() {
        return especie != null;
    }
}
