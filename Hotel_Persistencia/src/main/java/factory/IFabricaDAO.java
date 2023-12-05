
package factory;

import daos.AgenciaViajeDAO;
import daos.HabitacionDAO;
import daos.HotelDAO;
import daos.ReservacionDAO;
import daos.TarifaDAO;
import daos.UsuarioDAO;


/**
 * Interfaz IFabricaDAO que define los métodos para crear instancias de objetos DAO.
 * Esta interfaz sigue el patrón de diseño fábrica y se utiliza para abstraer la creación
 * de objetos DAO específicos para diferentes entidades como AgenciaViajes, Habitacion,
 * Hotel, Reservacion, Tarifa y Usuario.
 * 
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public interface IFabricaDAO {

    /**
     * Crea y devuelve una nueva instancia de AgenciaViajeDAO.
     * Este método se utiliza para obtener un objeto DAO que maneja las operaciones
     * de base de datos relacionadas con las agencias de viajes.
     *
     * @return Una nueva instancia de AgenciaViajeDAO.
     */
    public AgenciaViajeDAO crearAgenciaViajeDAO();
    
    /**
     * Crea y devuelve una nueva instancia de HabitacionDAO.
     * Este método se utiliza para obtener un objeto DAO que maneja las operaciones
     * de base de datos relacionadas con las habitaciones.
     *
     * @return Una nueva instancia de HabitacionDAO.
     */
    public HabitacionDAO crearHabitacionDAO();
    
    /**
     * Crea y devuelve una nueva instancia de HotelDAO.
     * Este método se utiliza para obtener un objeto DAO que maneja las operaciones
     * de base de datos relacionadas con los hoteles.
     *
     * @return Una nueva instancia de HotelDAO.
     */
    public HotelDAO crearHotelDAO();
    
    /**
     * Crea y devuelve una nueva instancia de ReservacionDAO.
     * Este método se utiliza para obtener un objeto DAO que maneja las operaciones
     * de base de datos relacionadas con las reservaciones.
     *
     * @return Una nueva instancia de ReservacionDAO.
     */
    public ReservacionDAO crearReservacionDAO();
    
    /**
     * Crea y devuelve una nueva instancia de TarifaDAO.
     * Este método se utiliza para obtener un objeto DAO que maneja las operaciones
     * de base de datos relacionadas con las tarifas.
     *
     * @return Una nueva instancia de TarifaDAO.
     */
    public TarifaDAO crearTarifaDAO();
    
    /**
     * Crea y devuelve una nueva instancia de UsuarioDAO.
     * Este método se utiliza para obtener un objeto DAO que maneja las operaciones
     * de base de datos relacionadas con los usuarios.
     *
     * @return Una nueva instancia de UsuarioDAO.
     */
    public UsuarioDAO crearUsuarioDAO();
    
}

