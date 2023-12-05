
package negocio;

import dominio.Reservacion;
import fachada.IDatos;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class ReservacionNegocio {
    
    IDatos datos;

    public ReservacionNegocio(IDatos datos) {
        this.datos = datos;
    }
    
    public Reservacion crearReservacion(Reservacion reervacion){
        return datos.crearReservacion(reervacion);
    }
    
    public Reservacion consultarReservacion(Reservacion reservacion){
        return datos.consultarReservacion(reservacion);
    }
    
    public Reservacion consultarTodoReservacion(){
        return (Reservacion) datos.consultarTodoReservacion();
    }
}
