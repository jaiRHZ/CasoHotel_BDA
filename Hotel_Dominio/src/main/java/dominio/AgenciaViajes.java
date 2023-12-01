/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import org.bson.types.ObjectId;


/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class AgenciaViajes extends Cliente{
    
    //Atributos de la clase
    private String nombre;
    private Usuario usuario;

    public AgenciaViajes() {
    }

    public AgenciaViajes(String nombre, Usuario usuario, String telefono) {
        super(telefono);
        this.nombre = nombre;
        this.usuario = usuario;
    }

    public AgenciaViajes(String nombre, Usuario usuario, ObjectId id, String telefono) {
        super(id, telefono);
        this.nombre = nombre;
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "AgenciaViajes{" + "nombre=" + nombre + ", usuario=" + usuario + '}';
    }
    
    
}
