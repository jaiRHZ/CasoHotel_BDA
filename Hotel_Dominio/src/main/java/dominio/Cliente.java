/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 * Clase Cliente que representa a un cliente en un sistema de reservaciones.
 * Cada cliente tiene un identificador único, un número de teléfono y una lista de reservaciones.
 * La clase proporciona métodos para gestionar estos atributos.
 * Incluye también métodos sobreescritos para hashCode, equals y toString.
 * 
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class Cliente {
    // Atributos
    private ObjectId id;
    private String telefono;
    private List<Reservacion> reservaciones;

    /**
     * Constructor por defecto para crear una instancia de Cliente sin parámetros.
     */
    public Cliente() {
    }

    /**
     * Constructor para crear una instancia de Cliente con un número de teléfono.
     *
     * @param telefono El teléfono del cliente.
     */
    public Cliente(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Constructor para crear una instancia de Cliente con un identificador y un número de teléfono.
     *
     * @param id       El identificador único del cliente.
     * @param telefono El teléfono del cliente.
     */
    public Cliente(ObjectId id, String telefono) {
        this.id = id;
        this.telefono = telefono;
    }

    /**
     * Obtiene el identificador del cliente.
     *
     * @return El identificador del cliente.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece el identificador del cliente.
     *
     * @param id El identificador a establecer.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Obtiene el número de teléfono del cliente.
     *
     * @return El número de teléfono del cliente.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el número de teléfono del cliente.
     *
     * @param telefono El número de teléfono a establecer.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene la lista de reservaciones del cliente.
     *
     * @return La lista de reservaciones del cliente.
     */
    public List<Reservacion> getReservaciones() {
        return reservaciones;
    }

    /**
     * Establece la lista de reservaciones del cliente.
     *
     * @param reservaciones La lista de reservaciones a establecer.
     */
    public void setReservaciones(List<Reservacion> reservaciones) {
        this.reservaciones = reservaciones;
    }

    /**
     * Método sobreescrito para calcular el código hash del objeto Cliente.
     *
     * @return Un entero representando el código hash del objeto.
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.id);
        return hash;
    }

    /**
     * Método sobreescrito para comparar la igualdad de dos objetos Cliente.
     *
     * @param obj El objeto con el que se compara.
     * @return Verdadero si ambos objetos son iguales, falso en caso contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        return Objects.equals(this.id, other.id);
    }

    /**
     * Método sobreescrito para obtener la representación en cadena de un objeto Cliente.
     *
     * @return Una cadena que representa al objeto Cliente.
     */
    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", telefono=" + telefono + '}';
    }
}
