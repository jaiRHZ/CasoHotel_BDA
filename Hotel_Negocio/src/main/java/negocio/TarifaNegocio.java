
package negocio;

import dominio.Tarifa;
import fachada.IDatos;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class TarifaNegocio {
    
    IDatos datos;

    public TarifaNegocio(IDatos datos) {
        this.datos = datos;
    }
    
    public Tarifa crearTarifa(Tarifa tarifa){
        return datos.crearTarifa(tarifa);
    }
    
    public Tarifa consultarTarifa(Tarifa tarifa){
        return datos.consultarTarifa(tarifa);
    }
    
    public Tarifa consultarTodoTarifa(){
        return (Tarifa) datos.consultarTodoTarifa();
    }
}
