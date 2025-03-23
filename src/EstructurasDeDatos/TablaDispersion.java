/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructurasDeDatos;

/**
 *
 * @author Luis, Zadkiel Avendano
 */
public class TablaDispersion {
    private final Hash[] tabla;
    private final int capacidad;

    public TablaDispersion(int capacidad) {
        this.tabla = new Hash[capacidad];
        this.capacidad = capacidad;
    }
    
    public int hash(String clave){
        return Math.abs(clave.toUpperCase().hashCode()) % capacidad;
    }
    
    public void insertar(String clave, String valor){
        clave = clave.toUpperCase();
        int indice = hash(clave);
        Hash nuevaEntrada = new Hash(clave, valor);
        
        if (tabla[indice] == null) {
            tabla[indice] = nuevaEntrada;
        } else {
            Hash actual = tabla[indice];
            while (actual.siguiente != null){
                actual = actual.siguiente;
            }
            actual.siguiente = nuevaEntrada;
        }
    }
    
    public String buscar(String clave){
        int indice = hash(clave);
        Hash actual = tabla[indice];
        
        while (actual != null){
            if (actual.clave.equals(clave.toUpperCase())) {
                return actual.valor;
            }
            actual = actual.siguiente;
        }
        return null;
    }
}
