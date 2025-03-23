/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructurasDeDatos;

/**
 * La clase Hash representa un nodo en una estructura de datos de tipo hash.
 * Cada nodo contiene una clave, un valor y una referencia al siguiente nodo en
 * la lista.
 *
 * @author Zadkiel
 */
public class Hash {

    String clave;
    String valor;
    Hash siguiente;

    /**
     * Constructor de la clase Hash.
     *
     * @param especie La clave del nodo, que representa una especie.
     * @param pasos El valor asociado a la clave, que representa los pasos.
     */
    public Hash(String especie, String pasos) {
        this.clave = especie;
        this.valor = pasos;
        this.siguiente = null;
    }

    /**
     * Obtiene la clave del nodo.
     *
     * @return La clave del nodo.
     */
    public String getClave() {
        return clave;
    }

    /**
     * Establece la clave del nodo.
     *
     * @param clave La nueva clave para el nodo.
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * Obtiene el valor asociado al nodo.
     *
     * @return El valor del nodo.
     */
    public String getValor() {
        return valor;
    }

    /**
     * Establece el valor asociado al nodo.
     *
     * @param valor El nuevo valor para el nodo.
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

    /**
     * Obtiene el siguiente nodo en la lista.
     *
     * @return El siguiente nodo en la lista.
     */
    public Hash getSiguiente() {
        return siguiente;
    }

    /**
     * Establece el siguiente nodo en la lista.
     *
     * @param siguiente El nuevo nodo siguiente en la lista.
     */
    public void setSiguiente(Hash siguiente) {
        this.siguiente = siguiente;
    }
}
