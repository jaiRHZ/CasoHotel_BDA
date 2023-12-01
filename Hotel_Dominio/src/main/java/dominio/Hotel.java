
package dominio;

import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class Hotel {
    
    //Atributos de clase
    private ObjectId id;
    
    private String nombre;
    private String ciudad;
    private String numero;
    private String calle;
    private String codigoPostal;
    private CategoriaHotel categoria;
    
    private List<Habitacion> habitacion;

    public Hotel() {
    }

    public Hotel(String nombre, String ciudad, String numero, String calle, String codigoPostal, CategoriaHotel categoria) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.numero = numero;
        this.calle = calle;
        this.codigoPostal = codigoPostal;
        this.categoria = categoria;
    }

    public Hotel(ObjectId id, String nombre, String ciudad, String numero, String calle, String codigoPostal, CategoriaHotel categoria) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.numero = numero;
        this.calle = calle;
        this.codigoPostal = codigoPostal;
        this.categoria = categoria;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public CategoriaHotel getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaHotel categoria) {
        this.categoria = categoria;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    public List<Habitacion> getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(List<Habitacion> habitacion) {
        this.habitacion = habitacion;
    }

    //--------------------------------------------------------------------------
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
        final Hotel other = (Hotel) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Hotel{" + "id=" + id + ", nombre=" + nombre + ", ciudad=" + ciudad + ", numero=" + numero + ", calle=" + calle + ", codigoPostal=" + codigoPostal + ", categoria=" + categoria + ", habitacion=" + habitacion + '}';
    }

    
    
}
