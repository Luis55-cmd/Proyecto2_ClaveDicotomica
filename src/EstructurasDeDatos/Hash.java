/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructurasDeDatos;

/**
 *
 * @author Zadkiel
 */
public class Hash {
    String clave;
    String valor;
    Hash siguiente;

    public Hash(String especie, String pasos) {
        this.clave = especie;
        this.valor = pasos;
        this.siguiente = null;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Hash getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Hash siguiente) {
        this.siguiente = siguiente;
    }
}
