
package dominio;

import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 * Clase Reservacion que representa una reservación en un sistema de gestión hotelera.
 * Cada reservación tiene un identificador único, fechas de inicio y fin, un cliente asociado,
 * y una lista de habitaciones reservadas.
 * La clase proporciona métodos para gestionar estos atributos y calcular el costo total de la reservación.
 * Incluye también métodos sobreescritos para hashCode, equals y toString.
 * 
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class Reservacion {
    
    // Atributos
    private ObjectId id;
    
    private Calendar fechaInicio;
    private Calendar fechaFin;
    private Cliente cliente;
    private List<Habitacion> habitaciones;
    private int noReservacion;
    
    /**
     * Constructor por defecto para crear una instancia de Reservacion sin parámetros.
     */
    public Reservacion() {
    }

    /**
     * Constructor para crear una instancia de Reservacion con fechas de inicio y fin, cliente y lista de habitaciones.
     *
     * @param fechaInicio   La fecha de inicio de la reservación.
     * @param fechaFin      La fecha de fin de la reservación.
     * @param cliente       El cliente que realiza la reservación.
     * @param habitaciones  La lista de habitaciones reservadas.
     * @param noReservacion Numero de reservacion
     */
    public Reservacion(Calendar fechaInicio, Calendar fechaFin, Cliente cliente, List<Habitacion> habitaciones, int noReservacion) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cliente = cliente;
        this.habitaciones = habitaciones;
        this.noReservacion = noReservacion;
    }

    /**
     * Constructor para crear una instancia de Reservacion con identificador, fechas de inicio y fin, cliente y lista de habitaciones.
     *
     * @param id            El identificador único de la reservación.
     * @param fechaInicio   La fecha de inicio de la reservación.
     * @param fechaFin      La fecha de fin de la reservación.
     * @param cliente       El cliente que realiza la reservación.
     * @param habitaciones  La lista de habitaciones reservadas.
     * @param noReservacion Numero de reservacion
     */
    public Reservacion(ObjectId id, Calendar fechaInicio, Calendar fechaFin, Cliente cliente, List<Habitacion> habitaciones, int noReservacion) {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cliente = cliente;
        this.habitaciones = habitaciones;
        this.noReservacion = noReservacion;
    }

    /**
     * Obtiene el identificador de la reservación.
     *
     * @return El identificador de la reservación.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece el identificador de la reservación.
     *
     * @param id El identificador a establecer.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Obtiene la fecha de inicio de la reservación.
     *
     * @return La fecha de inicio de la reservación.
     */
    public Calendar getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Establece la fecha de inicio de la reservación.
     *
     * @param fechaInicio La fecha de inicio a establecer.
     */
    public void setFechaInicio(Calendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * Obtiene la fecha de fin de la reservación.
     *
     * @return La fecha de fin de la reservación.
     */
    public Calendar getFechaFin() {
        return fechaFin;
    }

    /**
     * Establece la fecha de fin de la reservación.
     *
     * @param fechaFin La fecha de fin a establecer.
     */
    public void setFechaFin(Calendar fechaFin) {
        this.fechaFin = fechaFin;
    }

    /**
     * Obtiene el cliente que realiza la reservación.
     *
     * @return El cliente de la reservación.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Establece el cliente que realiza la reservación.
     *
     * @param cliente El cliente a establecer para la reservación.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Obtiene la lista de habitaciones reservadas.
     *
     * @return La lista de habitaciones de la reservación.
     */
    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    /**
     * Establece la lista de habitaciones reservadas.
     *
     * @param habitaciones La lista de habitaciones a establecer para la reservación.
     */
    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getNoReservacion() {
        return noReservacion;
    }

    public void setNoReservacion(int noReservacion) {
        this.noReservacion = noReservacion;
    }
    
    /**
     * Método sobreescrito para calcular el código hash del objeto Reservacion.
     *
     * @return Un entero representando el código hash del objeto.
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    /**
     * Método sobreescrito para comparar la igualdad de dos objetos Reservacion.
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
        final Reservacion other = (Reservacion) obj;
        return Objects.equals(this.id, other.id);
    }

    /**
     * Método sobreescrito para obtener la representación en cadena de un objeto Reservacion.
     *
     * @return Una cadena que representa al objeto Reservacion.
     */
    @Override
    public String toString() {
        return "Reservacion{" + "id=" + id + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", cliente=" + cliente + ", habitaciones=" + habitaciones + '}';
    }

    /**
     * Calcula el costo total de la reservación basado en las tarifas de las habitaciones reservadas.
     *
     * @return El costo total de la reservación.
     */
    public float costoTotal() {
        Float costoTotal = 0.0f;
        for (Habitacion habitacion : habitaciones) {
            costoTotal += habitacion.getTarifa().getCosto();
        }
        return costoTotal;  
    }
}
