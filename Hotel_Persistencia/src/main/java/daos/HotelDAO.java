package daos;

import baseDatos.IConexionBD;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import dominio.Habitacion;
import dominio.Hotel;
import interfaces.IHotelDAO;
import java.util.List;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 * Clase HotelDAO que implementa la interfaz IHotelDAO. Esta clase se encarga de
 * las operaciones de base de datos para los hoteles, incluyendo funcionalidades
 * CRUD (Crear, Leer, Actualizar, Eliminar). Utiliza una conexión a MongoDB para
 * almacenar y recuperar datos de los hoteles.
 *
 * @autor HP
 */
public class HotelDAO implements IHotelDAO {

    /**
     * Conexión a la base de datos MongoDB.
     */
    private final IConexionBD CONEXION;

    /**
     * Instancia de la base de datos MongoDB.
     */
    private final MongoDatabase BASE_DATOS;

    /**
     * Colección de MongoDB donde se almacenan los datos de los hoteles.
     */
    private final MongoCollection<Hotel> COLECCION;

    /**
     * Constructor de HotelDAO. Inicializa la conexión con la base de datos
     * MongoDB y configura la colección para almacenar y gestionar los datos de
     * los hoteles.
     *
     * @param CONEXION La conexión a la base de datos MongoDB.
     */
    public HotelDAO(IConexionBD CONEXION) {
        this.CONEXION = CONEXION;
        this.BASE_DATOS = CONEXION.getBaseDatos();
        this.COLECCION = BASE_DATOS.getCollection("hoteles", Hotel.class);
    }

    /**
     * Crea un nuevo hotel en la base de datos. Antes de la inserción, verifica
     * si ya existe un hotel con el mismo nombre. Muestra un mensaje de error si
     * el hotel ya existe.
     *
     * @param hotel El hotel a crear.
     * @return El hotel creado o null en caso de error.
     */
    @Override
    public Hotel crearHotel(Hotel hotel) {
        try {
            // Verificar si ya existe una habitacion con el mismo numero
            Document queryRfc = new Document("nombre", hotel.getNombre());
            long countRfc = this.COLECCION.countDocuments(queryRfc);
            if (countRfc > 0) {
                JOptionPane.showMessageDialog(null, "Ya existe un hotel"
                        + "el mismo nombre de hotel", "Error", JOptionPane.ERROR_MESSAGE);
                throw new Exception("Ya existe un hotel con el mismo nombre");
            }

            return hotel;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Hotel consultarHotel(Hotel hotel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Actualiza la información de un hotel existente en la base de datos. Esta
     * implementación aún no está soportada y lanzará una excepción si se
     * intenta usar.
     *
     * @param hotel El hotel con la información actualizada.
     * @return El hotel actualizado.
     */
    @Override
    public Hotel actualizarHotel(Hotel hotel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Consulta y devuelve todos los hoteles existentes en la base de datos.
     * Esta implementación aún no está soportada y lanzará una excepción si se
     * intenta usar.
     *
     * @return Una lista de todos los hoteles.
     */
    @Override
    public List<Hotel> consultarTodoHotel() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Elimina un hotel de la base de datos. Esta implementación aún no está
     * soportada y lanzará una excepción si se intenta usar.
     *
     * @param hotel El hotel a eliminar.
     * @return Verdadero si la eliminación fue exitosa, falso de lo contrario.
     */
    @Override
    public boolean eliminarHotel(Hotel hotel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
