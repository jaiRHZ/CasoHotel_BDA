
package factory;

import negocio.AgenciaViajeNegocio;
import negocio.HabitacionNegocio;
import negocio.HotelNegocio;
import negocio.ReservacionNegocio;
import negocio.TarifaNegocio;
import negocio.UsuarioNegocio;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public interface IFabricaNegocio {
    
    public AgenciaViajeNegocio crearAgenciaViajeNegocio();
    
    public HabitacionNegocio crearHabitacionNegocio();
    
    public HotelNegocio crearHotelNegocio();
    
    public ReservacionNegocio crearReservacionNegocio();
    
    public TarifaNegocio crearTarifaNegocio();
    
    public UsuarioNegocio crearUsuarioNegocio();
}
