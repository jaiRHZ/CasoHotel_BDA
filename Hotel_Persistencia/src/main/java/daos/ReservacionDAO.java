
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
 *
 * @author HP
 */
public class ReservacionDAO implements IReservacionDAO{

    private final IConexionBD CONEXION;
    private final MongoDatabase BASE_DATOS;
    private final MongoCollection<Reservacion> COLECCION;
    
    public ReservacionDAO(IConexionBD CONEXION) {
        this.CONEXION = CONEXION;
        this.BASE_DATOS = CONEXION.getBaseDatos();
        this.COLECCION = BASE_DATOS.getCollection("reservaciones", Reservacion.class);
    }
    

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

    @Override
    public Reservacion actualizarReservacion(Reservacion reservacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

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

    @Override
    public boolean eliminarReservacion(Reservacion reservacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
