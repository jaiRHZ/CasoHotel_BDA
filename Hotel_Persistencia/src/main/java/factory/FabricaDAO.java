
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
 * Clase FabricaDAO que implementa la interfaz IFabricaDAO.
 * Esta clase se utiliza para crear instancias de objetos DAO (Data Access Object) específicos
 * para cada entidad como AgenciaViajes, Habitacion, Hotel, Reservacion, Tarifa y Usuario.
 * Utiliza el patrón de diseño de fábrica para abstraer la creación de los objetos DAO.
 * 
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class FabricaDAO implements IFabricaDAO {

    private IConexionBD conexion;

    /**
     * Constructor de FabricaDAO.
     * Inicializa la conexión a la base de datos, que será utilizada por los DAOs.
     */
    public FabricaDAO() {
        this.conexion = new ConexionMongoDB();
    }
    
    /**
     * Crea y devuelve una nueva instancia de AgenciaViajeDAO.
     *
     * @return Una instancia de AgenciaViajeDAO.
     */
    @Override
    public AgenciaViajeDAO crearAgenciaViajeDAO() {
        return new AgenciaViajeDAO(conexion);
    }

    /**
     * Crea y devuelve una nueva instancia de HabitacionDAO.
     *
     * @return Una instancia de HabitacionDAO.
     */
    @Override
    public HabitacionDAO crearHabitacionDAO() {
        return new HabitacionDAO(conexion);
    }

    /**
     * Crea y devuelve una nueva instancia de HotelDAO.
     *
     * @return Una instancia de HotelDAO.
     */
    @Override
    public HotelDAO crearHotelDAO() {
        return new HotelDAO(conexion);
    }

    /**
     * Crea y devuelve una nueva instancia de ReservacionDAO.
     *
     * @return Una instancia de ReservacionDAO.
     */
    @Override
    public ReservacionDAO crearReservacionDAO() {
        return new ReservacionDAO(conexion);
    }

    /**
     * Crea y devuelve una nueva instancia de TarifaDAO.
     *
     * @return Una instancia de TarifaDAO.
     */
    @Override
    public TarifaDAO crearTarifaDAO() {
        return new TarifaDAO(conexion);
    }

    /**
     * Crea y devuelve una nueva instancia de UsuarioDAO.
     *
     * @return Una instancia de UsuarioDAO.
     */
    @Override
    public UsuarioDAO crearUsuarioDAO() {
        return new UsuarioDAO(conexion);
    }
    
}
