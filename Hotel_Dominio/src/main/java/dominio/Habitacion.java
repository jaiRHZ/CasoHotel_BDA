
package dominio;

import java.util.Objects;
import org.bson.types.ObjectId;

/**
 * Clase Habitacion que representa una habitación en un hotel.
 * Cada habitación tiene un identificador único, un número de habitación, una planta, 
 * una tarifa asociada y el hotel al que pertenece.
 * La clase proporciona métodos para gestionar estos atributos.
 * Incluye también métodos sobreescritos para hashCode, equals y toString.
 * 
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class Habitacion {
    // Atributos de la clase
    private ObjectId id;
    private String noHabitacion;
    private String planta;
    
    private Tarifa tarifa;
    private Hotel hotel;

    /**
     * Constructor por defecto para crear una instancia de Habitacion sin parámetros.
     */
    public Habitacion() {
    }

    public Habitacion(String noHabitacion, String planta, Tarifa tarifa) {
        this.noHabitacion = noHabitacion;
        this.planta = planta;
        this.tarifa = tarifa;
    }
    
    

    /**
     * Constructor para crear una instancia de Habitacion con número de habitación, planta, tarifa y hotel.
     *
     * @param noHabitacion El número de la habitación.
     * @param planta       La planta en la que se encuentra la habitación.
     * @param tarifa       La tarifa aplicable a la habitación.
     * @param hotel        El hotel al que pertenece la habitación.
     */
    public Habitacion(String noHabitacion, String planta, Tarifa tarifa, Hotel hotel) {
        this.noHabitacion = noHabitacion;
        this.planta = planta;
        this.tarifa = tarifa;
        this.hotel = hotel;
    }

    /**
     * Constructor para crear una instancia de Habitacion con identificador, número de habitación, planta, tarifa y hotel.
     *
     * @param id           El identificador único de la habitación.
     * @param noHabitacion El número de la habitación.
     * @param planta       La planta en la que se encuentra la habitación.
     * @param tarifa       La tarifa aplicable a la habitación.
     * @param hotel        El hotel al que pertenece la habitación.
     */
    public Habitacion(ObjectId id, String noHabitacion, String planta, Tarifa tarifa, Hotel hotel) {
        this.id = id;
        this.noHabitacion = noHabitacion;
        this.planta = planta;
        this.tarifa = tarifa;
        this.hotel = hotel;
    }

    /**
     * Obtiene el identificador de la habitación.
     *
     * @return El identificador de la habitación.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece el identificador de la habitación.
     *
     * @param id El identificador a establecer.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Obtiene el número de la habitación.
     *
     * @return El número de la habitación.
     */
    public String getNoHabitacion() {
        return noHabitacion;
    }

    /**
     * Establece el número de la habitación.
     *
     * @param noHabitacion El número de la habitación a establecer.
     */
    public void setNoHabitacion(String noHabitacion) {
        this.noHabitacion = noHabitacion;
    }

    /**
     * Obtiene la planta en la que se encuentra la habitación.
     *
     * @return La planta de la habitación.
     */
    public String getPlanta() {
        return planta;
    }

    /**
     * Establece la planta en la que se encuentra la habitación.
     *
     * @param planta La planta a establecer para la habitación.
     */
    public void setPlanta(String planta) {
        this.planta = planta;
    }

    /**
     * Obtiene la tarifa aplicable a la habitación.
     *
     * @return La tarifa de la habitación.
     */
    public Tarifa getTarifa() {
        return tarifa;
    }

    /**
     * Establece la tarifa aplicable a la habitación.
     *
     * @param tarifa La tarifa a establecer para la habitación.
     */
    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }

    /**
     * Obtiene el hotel al que pertenece la habitación.
     *
     * @return El hotel de la habitación.
     */
    public Hotel getHotel() {
        return hotel;
    }

    /**
     * Establece el hotel al que pertenece la habitación.
     *
     * @param hotel El hotel a establecer para la habitación.
     */
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    /**
     * Método sobreescrito para calcular el código hash del objeto Habitacion.
     *
     * @return Un entero representando el código hash del objeto.
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
        return hash;
    }

    /**
     * Método sobreescrito para comparar la igualdad de dos objetos Habitacion.
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
        final Habitacion other = (Habitacion) obj;
        return Objects.equals(this.id, other.id);
    }

    /**
     * Método sobreescrito para obtener la representación en cadena de un objeto Habitacion.
     *
     * @return Una cadena que representa al objeto Habitacion.
     */
    @Override
    public String toString() {
        return "Habitacion{" + "id=" + id + ", noHabitacion=" + noHabitacion + ", planta=" + planta + ", tarifa=" + tarifa + ", hotel=" + hotel + '}';
    }
}
