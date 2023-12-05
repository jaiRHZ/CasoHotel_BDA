
package negocio;

import dominio.AgenciaViajes;
import fachada.IDatos;
import java.util.List;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class AgenciaViajeNegocio {
    
    IDatos datos;

    public AgenciaViajeNegocio(IDatos datos) {
        this.datos = datos;
    }

    public AgenciaViajes crearAgenciaViajes(AgenciaViajes agenciaViajes){
        return datos.crearAgenciaViajes(agenciaViajes);
    }
    
    public AgenciaViajes consultarAgenciaViajes(AgenciaViajes agenciaViajes){
        return datos.consultarAgenciaViajes(agenciaViajes);
    }
    
    public List<AgenciaViajes> consultarTodasAgenciaViajes(){
        return datos.consultarTodasAgenciaViajes();
    }
}

