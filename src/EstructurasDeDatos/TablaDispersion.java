/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructurasDeDatos;

/**
 * Clase que representa una tabla de dispersión (hash table) para almacenar y
 * buscar valores asociados a claves.
 *
 * @author Luis, Zadkiel Avendano
 */
public class TablaDispersion {

    private final Hash[] tabla;
    private final int capacidad;

    /**
     * Constructor de la clase TablaDispersion.
     *
     * @param capacidad La capacidad inicial de la tabla de dispersión.
     */
    public TablaDispersion(int capacidad) {
        this.tabla = new Hash[capacidad];
        this.capacidad = capacidad;
    }

    /**
     * Calcula el índice hash para una clave dada.
     *
     * @param clave La clave para la cual se calculará el índice hash.
     * @return El índice hash correspondiente a la clave.
     */
    public int hash(String clave) {
        return Math.abs(clave.toUpperCase().hashCode()) % capacidad;
    }

    /**
     * Inserta un valor en la tabla de dispersión asociado a una clave. Si la
     * clave ya existe, se maneja mediante una lista enlazada.
     *
     * @param clave La clave asociada al valor.
     * @param valor El valor que se desea insertar.
     */
    public void insertar(String clave, String valor) {
        clave = clave.toUpperCase();
        int indice = hash(clave);
        Hash nuevaEntrada = new Hash(clave, valor);

        if (tabla[indice] == null) {
            tabla[indice] = nuevaEntrada;
        } else {
            Hash actual = tabla[indice];
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevaEntrada;
        }
    }

    /**
     * Busca un valor en la tabla de dispersión asociado a una clave.
     *
     * @param clave La clave asociada al valor que se desea buscar.
     * @return El valor asociado a la clave, o null si la clave no existe en la
     * tabla.
     */
    public String buscar(String clave) {
        int indice = hash(clave);
        Hash actual = tabla[indice];

        while (actual != null) {
            if (actual.clave.equals(clave.toUpperCase())) {
                return actual.valor;
            }
            actual = actual.siguiente;
        }
        return null;
    }
}
