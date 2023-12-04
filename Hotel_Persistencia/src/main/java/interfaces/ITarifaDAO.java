
package interfaces;

import dominio.Tarifa;
import java.util.List;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public interface ITarifaDAO {
    
    public Tarifa crearTarifa(Tarifa tarifa);
    
    public Tarifa consultarTarifa(Tarifa tarifa);
    
    public Tarifa actualizarTarifa(Tarifa tarifa);
    
    public List<Tarifa> consultarTodoTarifa();
    
    public boolean eliminarTarifa(Tarifa tarifa);
    
}
