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
 *
 * @author HP
 */
public class HotelDAO implements IHotelDAO{

    private final IConexionBD CONEXION;
    private final MongoDatabase BASE_DATOS;
    private final MongoCollection<Hotel> COLECCION;
    
    public HotelDAO(IConexionBD CONEXION) {
        this.CONEXION = CONEXION;
        this.BASE_DATOS = CONEXION.getBaseDatos();
        this.COLECCION = BASE_DATOS.getCollection("hoteles", Hotel.class);
    }

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
            // Insertar el administrador en la colección
            this.COLECCION.insertOne(hotel);

            return hotel;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Hotel consultarHotel(Hotel hotel) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Hotel actualizarHotel(Hotel hotel) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Hotel> consultarTodoHotel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminarHotel(Hotel hotel) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
