
package factory;

import fachada.FachadaDAO;
import fachada.IDatos;
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
public class FabricaNegocio implements IFabricaNegocio{

    IDatos datos;

    public FabricaNegocio() {
        this.datos = new FachadaDAO();
    }
    
    
    @Override
    public AgenciaViajeNegocio crearAgenciaViajeNegocio() {
        return new AgenciaViajeNegocio(datos);
    }

    @Override
    public HabitacionNegocio crearHabitacionNegocio() {
        return new HabitacionNegocio(datos);
    }

    @Override
    public HotelNegocio crearHotelNegocio() {
        return new HotelNegocio(datos);
    }

    @Override
    public ReservacionNegocio crearReservacionNegocio() {
        return new ReservacionNegocio(datos);
    }

    @Override
    public TarifaNegocio crearTarifaNegocio() {
        return new TarifaNegocio(datos);
    }

    @Override
    public UsuarioNegocio crearUsuarioNegocio() {
        return new UsuarioNegocio(datos);
    }
    
}
