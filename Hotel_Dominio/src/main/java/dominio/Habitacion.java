
package dominio;

import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class Habitacion {
    //Atributos de la clase
    private ObjectId id;
    private String noHabitacion;
    private String planta;
    
    private Tarifa tarifa;
    private Hotel hotel;

    public Habitacion() {
    }

    public Habitacion(String noHabitacion, String planta, Tarifa tarifa, Hotel hotel) {
        this.noHabitacion = noHabitacion;
        this.planta = planta;
        this.tarifa = tarifa;
        this.hotel = hotel;
    }

    public Habitacion(ObjectId id, String noHabitacion, String planta, Tarifa tarifa, Hotel hotel) {
        this.id = id;
        this.noHabitacion = noHabitacion;
        this.planta = planta;
        this.tarifa = tarifa;
        this.hotel = hotel;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNoHabitacion() {
        return noHabitacion;
    }

    public void setNoHabitacion(String noHabitacion) {
        this.noHabitacion = noHabitacion;
    }

    public String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
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
        final Habitacion other = (Habitacion) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Habitacion{" + "id=" + id + ", noHabitacion=" + noHabitacion + ", planta=" + planta + ", tarifa=" + tarifa + ", hotel=" + hotel + '}';
    }
    
}
