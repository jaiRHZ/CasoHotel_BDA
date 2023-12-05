
package daos;

import baseDatos.IConexionBD;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import dominio.Habitacion;
import dominio.Reservacion;
import dominio.Usuario;
import interfaces.IReservacionDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 * Clase ReservacionDAO que implementa la interfaz IReservacionDAO.
 * Esta clase se encarga de las operaciones de base de datos para las reservaciones,
 * incluyendo funcionalidades CRUD (Crear, Leer, Actualizar, Eliminar).
 * Utiliza una conexión a MongoDB para almacenar y recuperar datos de las reservaciones.
 * 
 * @author HP
 */
public class ReservacionDAO implements IReservacionDAO{
    
    /**
     * Conexión a la base de datos MongoDB.
     */
    private final IConexionBD CONEXION;

    /**
     * Instancia de la base de datos MongoDB.
     */
    private final MongoDatabase BASE_DATOS;

    /**
     * Colección de MongoDB donde se almacenan los datos de las reservaciones.
     */
    private final MongoCollection<Reservacion> COLECCION;
    
    /**
     * Constructor de ReservacionDAO.
     * Inicializa la conexión con la base de datos MongoDB y configura la colección
     * para almacenar y gestionar los datos de las reservaciones.
     *
     * @param CONEXION La conexión a la base de datos MongoDB.
     */
    public ReservacionDAO(IConexionBD CONEXION) {
        this.CONEXION = CONEXION;
        this.BASE_DATOS = CONEXION.getBaseDatos();
        this.COLECCION = BASE_DATOS.getCollection("reservaciones", Reservacion.class);
    }
    
    /**
     * Crea una nueva reservación en la base de datos.
     * Antes de la inserción, verifica si ya existe una reservación con el mismo número.
     * Muestra un mensaje de error si la reservación ya existe.
     *
     * @param reservacion La reservación a crear.
     * @return La reservación creada o null en caso de error.
     */
    @Override
    public Reservacion crearReservacion(Reservacion reservacion) {
    
        try {
            // Verificar si ya existe una reservacion con el mismo numero
            Document queryRfc = new Document("noReservacion", reservacion.getNoReservacion());
            long countRfc = this.COLECCION.countDocuments(queryRfc);
            if (countRfc > 0) {
                JOptionPane.showMessageDialog(null, "Ya existe una reservacion con "
                        + "el mismo Numero de reservacion", "Error", JOptionPane.ERROR_MESSAGE);
                throw new Exception("Ya existe una reservacion con el mismo NUmero");
            }
            // Insertar la reservacion en la colección
            this.COLECCION.insertOne(reservacion);

            return reservacion;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
    
    /**
     * Consulta una reservación en la base de datos.
     * Realiza la búsqueda basándose en el número de reservación y las fechas de inicio y fin.
     * Muestra un mensaje de error si la reservación no se encuentra.
     *
     * @param reservacion La reservación con la información para la consulta.
     * @return La reservación encontrada o null si no se encuentra.
     */
    @Override
    public Reservacion consultarReservacion(Reservacion reservacion) {
    
        try {
            // Construir el filtro para buscar la reservacion por su numero de orden, fecha que se hizo y fecha en que finaliza
            Document filtro = new Document();
            filtro.append("noReservacion", reservacion.getNoReservacion());
            filtro.append("fechaInicio", reservacion.getFechaInicio());
            filtro.append("fechaFin", reservacion.getFechaFin());

            // Realizar la búsqueda del usuario en la base de datos
            Reservacion reservacionConsultado = this.COLECCION.find(filtro).first();
            if (reservacionConsultado != null) {

                return reservacionConsultado;
            }
            // Devolver el usuario encontrado (puede ser null si no se encuentra)
            JOptionPane.showMessageDialog(null, "Reservacion no encontrada", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
        
    }
    
    /**
     * Actualiza la información de una reservación existente en la base de datos.
     * Esta implementación aún no está soportada y lanzará una excepción si se intenta usar.
     * 
     * @param reservacion La reservación con la información actualizada.
     * @return La reservación actualizada.
     */
    @Override
    public Reservacion actualizarReservacion(Reservacion reservacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    /**
     * Consulta y devuelve todas las reservaciones existentes en la base de datos.
     * Retorna una lista de todas las reservaciones encontradas.
     * 
     * @return Una lista de todas las reservaciones.
     */
    @Override
    public List<Reservacion> consultarTodoReservacion() {
    
        List<Reservacion> reservaciones = new ArrayList<>();

        // Realizar la búsqueda de todas las rservaciones en la base de datos
        try (MongoCursor<Reservacion> cursor = this.COLECCION.find().iterator()) {
            while (cursor.hasNext()) {
                
                Reservacion reservacion = cursor.next();

                reservaciones.add(reservacion);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        return reservaciones;
        
    }
    
    /**
     * Elimina una reservación de la base de datos.
     * Esta implementación aún no está soportada y lanzará una excepción si se intenta usar.
     *
     * @param reservacion La reservación a eliminar.
     * @return Verdadero si la eliminación fue exitosa, falso de lo contrario.
     */
    @Override
    public boolean eliminarReservacion(Reservacion reservacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
