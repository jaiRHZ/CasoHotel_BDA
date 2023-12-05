package daos;

import baseDatos.IConexionBD;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import dominio.Cliente;
import dominio.Habitacion;
import dominio.Usuario;
import interfaces.IHabitacionDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 * Clase HabitacionDAO que implementa la interfaz IHabitacionDAO.
 * Esta clase se encarga de las operaciones de base de datos para las habitaciones,
 * incluyendo funcionalidades CRUD (Crear, Leer, Actualizar, Eliminar).
 * Utiliza una conexión a MongoDB para almacenar y recuperar datos de las habitaciones.
 * 
 * @author HP
 */
public class HabitacionDAO implements IHabitacionDAO{

    /**
     * Conexión a la base de datos MongoDB.
     */
    private final IConexionBD CONEXION;

    /**
     * Instancia de la base de datos MongoDB.
     */
    private final MongoDatabase BASE_DATOS;

    /**
     * Colección de MongoDB donde se almacenan los datos de las habitaciones.
     */
    private final MongoCollection<Habitacion> COLECCION;
    
    /**
     * Constructor de HabitacionDAO.
     * Inicializa la conexión con la base de datos MongoDB y configura la colección
     * para almacenar y gestionar los datos de las habitaciones.
     *
     * @param CONEXION La conexión a la base de datos MongoDB.
     */
    public HabitacionDAO(IConexionBD CONEXION) {
        this.CONEXION = CONEXION;
        this.BASE_DATOS = CONEXION.getBaseDatos();
        this.COLECCION = BASE_DATOS.getCollection("habitaciones", Habitacion.class);
    }
    
    /**
     * Crea una nueva habitación en la base de datos.
     * Antes de la inserción, verifica si ya existe una habitación con el mismo número.
     * Muestra un mensaje de error si la habitación ya existe.
     *
     * @param habitacion La habitación a crear.
     * @return La habitación creada o null en caso de error.
     */
    @Override
    public Habitacion crearHabitacion(Habitacion habitacion) {
    
        try {
            // Verificar si ya existe una habitacion con el mismo numero
            Document queryRfc = new Document("noHabitacion", habitacion.getNoHabitacion());
            long countRfc = this.COLECCION.countDocuments(queryRfc);
            if (countRfc > 0) {
                JOptionPane.showMessageDialog(null, "Ya existe una habitación con "
                        + "el mismo Numero Habitación", "Error", JOptionPane.ERROR_MESSAGE);
                throw new Exception("Ya existe una habitación con el mismo NUmero");
            }
            // Insertar el administrador en la colección
            this.COLECCION.insertOne(habitacion);

            return habitacion;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
    
    /**
     * Consulta una habitación en la base de datos basándose en su número y planta.
     * Si no se encuentra la habitación, muestra un mensaje de error.
     *
     * @param habitacion La habitación con la información para la consulta.
     * @return La habitación encontrada o null si no se encuentra.
     */
    @Override
    public Habitacion consultarHabitacion(Habitacion habitacion) {
        try {
            // Construir el filtro para buscar la habitacion por el numero de cuarto
            Document filtro = new Document();
            filtro.append("noHabitacion", habitacion.getNoHabitacion());
            filtro.append("planta", habitacion.getPlanta());


            // Realizar la búsqueda del usuario en la base de datos
            Habitacion habitacionConsultado = this.COLECCION.find(filtro).first();
            if (habitacionConsultado != null) {

                return habitacion;
            }
            // Devolver el usuario encontrado (puede ser null si no se encuentra)
            JOptionPane.showMessageDialog(null, "Habitacion no encontrada", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }   
    }
    
    /**
     * Actualiza la información de una habitación existente en la base de datos.
     * Esta implementación aún no está soportada y lanzará una excepción si se intenta usar.
     * 
     * @param habitacion La habitación con la información actualizada.
     * @return La habitación actualizada.
     */
    @Override
    public Habitacion actualizarHabitacion(Habitacion habitacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    /**
     * Consulta y devuelve todas las habitaciones existentes en la base de datos.
     * Retorna una lista de todas las habitaciones encontradas.
     * 
     * @return Una lista de todas las habitaciones.
     */
    @Override
    public List<Habitacion> consultarTodoHabitacion() {
        List<Habitacion> habitaciones = new ArrayList<>();

        // Realizar la búsqueda de todas las habitaciones en la base de datos
        try (MongoCursor<Habitacion> cursor = this.COLECCION.find().iterator()) {
            while (cursor.hasNext()) {
                
                Habitacion habitacion = cursor.next();

                habitaciones.add(habitacion);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        return habitaciones;
        
    }
    
    /**
     * Elimina una habitación de la base de datos.
     * Esta implementación aún no está soportada y lanzará una excepción si se intenta usar.
     *
     * @param habitacion La habitación a eliminar.
     * @return Verdadero si la eliminación fue exitosa, falso de lo contrario.
     */
    @Override
    public boolean eliminarHabitacion(Habitacion habitacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
