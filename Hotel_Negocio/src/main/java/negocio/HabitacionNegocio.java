
package negocio;

import dominio.Habitacion;
import fachada.IDatos;
import java.util.List;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class HabitacionNegocio {
    
    IDatos datos;

    public HabitacionNegocio(IDatos datos) {
        this.datos = datos;
    }
   
    
    public Habitacion crearHabitacion(Habitacion habitacion){
        return datos.crearHabitacion(habitacion);
    }
    
    public Habitacion consultarHabitacion(Habitacion habitacion){
        return datos.consultarHabitacion(habitacion);
    }
    
    public List<Habitacion> consultarTodoHabitacion(){
        return datos.consultarTodoHabitacion();
    }
}
