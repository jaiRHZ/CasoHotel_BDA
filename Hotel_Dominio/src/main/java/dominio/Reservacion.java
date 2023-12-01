
package dominio;

import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class Reservacion {
    
    //Atributos
    private ObjectId id;
    
    private Calendar fechaInicio;
    private Calendar fechaFin;
    private Cliente cliente;
    private List<Habitacion> habitaciones;
    
    public Reservacion() {
    }

    public Reservacion(Calendar fechaInicio, Calendar fechaFin, Cliente cliente, List<Habitacion> habitaciones) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cliente = cliente;
        this.habitaciones = habitaciones;
    }

    public Reservacion(ObjectId id, Calendar fechaInicio, Calendar fechaFin, Cliente cliente, List<Habitacion> habitaciones) {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cliente = cliente;
        this.habitaciones = habitaciones;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Calendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Calendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Calendar getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Calendar fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
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
        final Reservacion other = (Reservacion) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Reservacion{" + "id=" + id + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", cliente=" + cliente + ", habitaciones=" + habitaciones + '}';
    }
    
    public float costoTotal(){
        Float costoTotal = 0.0f;
        for (int i = 0; i < habitaciones.size(); i++) {
            costoTotal += habitaciones.get(i).getTarifa().getCosto();
        }
        return costoTotal;  
    }
}
