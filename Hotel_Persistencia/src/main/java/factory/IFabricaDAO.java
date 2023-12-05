
package factory;

import daos.AgenciaViajeDAO;
import daos.HabitacionDAO;
import daos.HotelDAO;
import daos.ReservacionDAO;
import daos.TarifaDAO;
import daos.UsuarioDAO;


/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public interface IFabricaDAO {
    
    public AgenciaViajeDAO crearAgenciaViajeDAO();
    
    public HabitacionDAO crearHabitacionDAO();
    
    public HotelDAO crearHotelDAO();
    
    public ReservacionDAO crearReservacionDAO();
    
    public TarifaDAO crearTarifaDAO();
    
    public UsuarioDAO crearUsuarioDAO();
    
}
