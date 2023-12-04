
package interfaces;

import dominio.Habitacion;
import java.util.List;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public interface IHabitacionDAO {
    
    public Habitacion crearHabitacion(Habitacion habitacion);
    
    public Habitacion consultarHabitacion(Habitacion habitacion);
    
    public Habitacion actualizarHabitacion(Habitacion habitacion);
    
    public List<Habitacion> consultarTodoHabitacion();
    
    public boolean eliminarHabitacion(Habitacion habitacion);
}
