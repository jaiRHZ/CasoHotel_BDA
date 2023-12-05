
package factory;

import baseDatos.ConexionMongoDB;
import baseDatos.IConexionBD;
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
public class FabricaDAO implements IFabricaDAO{

    private IConexionBD conexion;

    public FabricaDAO() {
        this.conexion = new ConexionMongoDB();
    }
    
    @Override
    public AgenciaViajeDAO crearAgenciaViajeDAO() {
        return new AgenciaViajeDAO(conexion);
    }

    @Override
    public HabitacionDAO crearHabitacionDAO() {
        return new HabitacionDAO(conexion);
    }

    @Override
    public HotelDAO crearHotelDAO() {
        return new HotelDAO(conexion);
    }

    @Override
    public ReservacionDAO crearReservacionDAO() {
        return new ReservacionDAO(conexion);
    }

    @Override
    public TarifaDAO crearTarifaDAO() {
        return new TarifaDAO(conexion);
    }

    @Override
    public UsuarioDAO crearUsuarioDAO() {
        return new UsuarioDAO(conexion);
    }
    
}
