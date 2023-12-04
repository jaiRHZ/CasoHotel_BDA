
package interfaces;

import dominio.AgenciaViajes;
import java.util.List;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public interface IAgenciaViajeDAO {
   
    public AgenciaViajes crearAgenciaViajes(AgenciaViajes agenciaViajes);
    
    public AgenciaViajes consultarAgenciaViajes(AgenciaViajes agenciaViajes);
    
    public AgenciaViajes actualizarAgenciaViajes(AgenciaViajes agenciaViajes);
    
    public List<AgenciaViajes> consultarTodasAgenciaViajes();
    
    public boolean eliminarAgenciaViajes(AgenciaViajes agenciaViajes);
}
