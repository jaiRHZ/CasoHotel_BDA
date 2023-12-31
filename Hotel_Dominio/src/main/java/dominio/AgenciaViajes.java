/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import org.bson.types.ObjectId;


/**
 * Clase AgenciaViajes que extiende de Cliente.
 * Esta clase representa una agencia de viajes con un nombre y un usuario asociado.
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class AgenciaViajes extends Cliente {
    
    // Atributos de la clase
    private String nombre;
    private Usuario usuario;

    /**
     * Constructor por defecto para crear una instancia de AgenciaViajes sin parámetros.
     */
    public AgenciaViajes() {
    }

    public AgenciaViajes(String nombre, String telefono, String rfc) {
        super(telefono, rfc);
        this.nombre = nombre;
    }
    
    public AgenciaViajes(String nombre, Usuario usuario, String telefono, String rfc) {
        super(telefono, rfc);
        this.nombre = nombre;
        this.usuario = usuario;
    }

    public AgenciaViajes(String nombre, Usuario usuario, ObjectId id, String telefono, String rfc) {
        super(id, telefono, rfc);
        this.nombre = nombre;
        this.usuario = usuario;
    }

    /**
     * Obtiene el nombre de la agencia de viajes.
     *
     * @return El nombre de la agencia de viajes.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la agencia de viajes.
     *
     * @param nombre El nombre a establecer para la agencia de viajes.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el usuario asociado a la agencia de viajes.
     *
     * @return El usuario asociado a la agencia de viajes.
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Establece el usuario asociado a la agencia de viajes.
     *
     * @param usuario El usuario a establecer para la agencia de viajes.
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * Representación en cadena de la instancia de AgenciaViajes.
     *
     * @return Una cadena que representa los datos de la agencia de viajes.
     */
    @Override
    public String toString() {
        return "AgenciaViajes{" + "nombre=" + nombre + ", usuario=" + usuario + '}';
    }
}
