/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import org.bson.types.ObjectId;

/**
 * Clase Usuario que extiende de Cliente, representando un usuario en un sistema de gestión hotelera.
 * Cada usuario tiene, además de los atributos de Cliente, nombres, apellido paterno y apellido materno.
 * La clase proporciona métodos para gestionar estos atributos y obtener el nombre completo del usuario.
 * Incluye también un método sobreescrito para toString.
 * 
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class Usuario extends Cliente{
    
    // Atributos de la clase
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;

    /**
     * Constructor por defecto para crear una instancia de Usuario sin parámetros.
     */
    public Usuario() {
    }

    /**
     * Constructor para crear una instancia de Usuario con nombres, apellidos y teléfono.
     *
     * @param nombres          Los nombres del usuario.
     * @param apellidoPaterno  El apellido paterno del usuario.
     * @param apellidoMaterno  El apellido materno del usuario.
     * @param telefono         El teléfono del usuario.
     */
    public Usuario(String nombres, String apellidoPaterno, String apellidoMaterno, String telefono) {
        super(telefono);
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    /**
     * Constructor para crear una instancia de Usuario con identificador, nombres, apellidos y teléfono.
     *
     * @param nombres          Los nombres del usuario.
     * @param apellidoPaterno  El apellido paterno del usuario.
     * @param apellidoMaterno  El apellido materno del usuario.
     * @param id               El identificador único del usuario.
     * @param telefono         El teléfono del usuario.
     */
    public Usuario(String nombres, String apellidoPaterno, String apellidoMaterno, ObjectId id, String telefono) {
        super(id, telefono);
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    /**
     * Obtiene los nombres del usuario.
     *
     * @return Los nombres del usuario.
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Establece los nombres del usuario.
     *
     * @param nombres Los nombres a establecer para el usuario.
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * Obtiene el apellido paterno del usuario.
     *
     * @return El apellido paterno del usuario.
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * Establece el apellido paterno del usuario.
     *
     * @param apellidoPaterno El apellido paterno a establecer para el usuario.
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    /**
     * Obtiene el apellido materno del usuario.
     *
     * @return El apellido materno del usuario.
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     * Establece el apellido materno del usuario.
     *
     * @param apellidoMaterno El apellido materno a establecer para el usuario.
     */
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    /**
     * Método sobreescrito para obtener la representación en cadena de un objeto Usuario.
     *
     * @return Una cadena que representa al objeto Usuario.
     */
    @Override
    public String toString() {
        return "Usuario{" + "nombres=" + nombres + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + '}';
    }
    
    /**
     * Obtiene el nombre completo del usuario, concatenando sus nombres y apellidos.
     *
     * @return El nombre completo del usuario.
     */
    public String getNombreCompleto() {
        return nombres + " " + apellidoPaterno + " " + apellidoMaterno;
    }
}
