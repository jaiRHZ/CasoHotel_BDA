/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class Cliente {
    //Atributos
    private ObjectId id;
    
    private String telefono;
    private List<Reservacion> reservaciones;

    public Cliente() {
    }

    public Cliente(String telefono) {
        this.telefono = telefono;
    }

    public Cliente(ObjectId id, String telefono) {
        this.id = id;
        this.telefono = telefono;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Reservacion> getReservaciones() {
        return reservaciones;
    }

    public void setReservaciones(List<Reservacion> reservaciones) {
        this.reservaciones = reservaciones;
    }

    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.id);
        return hash;
    }

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

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", telefono=" + telefono + '}';
    }
    
    
}
