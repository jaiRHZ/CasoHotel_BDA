
package interfaces;

import dominio.Reservacion;
import java.util.List;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public interface IReservacionDAO {
    
    public Reservacion crearReservacion(Reservacion reservacion);
    
    public Reservacion consultarReservacion(Reservacion reservacion);
    
    public Reservacion actualizarReservacion(Reservacion reservacion);
    
    public List<Reservacion> consultarTodoReservacion();
    
    public boolean eliminarReservacion(Reservacion reservacion);
}
