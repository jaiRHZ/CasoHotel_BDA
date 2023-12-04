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
 *
 * @author HP
 */
public class HabitacionDAO implements IHabitacionDAO{

    private final IConexionBD CONEXION;
    private final MongoDatabase BASE_DATOS;
    private final MongoCollection<Habitacion> COLECCION;
    
    public HabitacionDAO(IConexionBD CONEXION) {
        this.CONEXION = CONEXION;
        this.BASE_DATOS = CONEXION.getBaseDatos();
        this.COLECCION = BASE_DATOS.getCollection("habitaciones", Habitacion.class);
    }
    
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

    @Override
    public Habitacion actualizarHabitacion(Habitacion habitacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

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

    @Override
    public boolean eliminarHabitacion(Habitacion habitacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
