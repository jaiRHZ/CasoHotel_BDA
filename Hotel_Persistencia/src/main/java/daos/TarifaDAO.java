package daos;

import baseDatos.IConexionBD;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import dominio.Tarifa;
import interfaces.ITarifaDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author HP
 */
public class TarifaDAO implements ITarifaDAO{

    private final IConexionBD CONEXION;
    private final MongoDatabase BASE_DATOS;
    private final MongoCollection<Tarifa> COLECCION;
    
    public TarifaDAO(IConexionBD CONEXION) {
        this.CONEXION = CONEXION;
        this.BASE_DATOS = CONEXION.getBaseDatos();
        this.COLECCION = BASE_DATOS.getCollection("tarifas", Tarifa.class);
    }
    
    @Override
    public Tarifa crearTarifa(Tarifa tarifa) {
    
        try {
            // Verificar si ya existe una tarifa con el mismo tipo
            Document queryRfc = new Document("tipo", tarifa.getTipo());
            long countRfc = this.COLECCION.countDocuments(queryRfc);
            if (countRfc > 0) {
                JOptionPane.showMessageDialog(null, "Ya existe una tarifa con "
                        + "el mismo Tipo", "Error", JOptionPane.ERROR_MESSAGE);
                throw new Exception("Ya existe una tarifa con el mismo Tipo");
            }
            // Insertar la reservacion en la colección
            this.COLECCION.insertOne(tarifa);

            return tarifa;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Tarifa consultarTarifa(Tarifa tarifa) {
    
        try {
            // Construir el filtro para buscar la reservacion por su numero de orden, fecha que se hizo y fecha en que finaliza
            Document filtro = new Document();
            filtro.append("tipo", tarifa.getTipo());

            // Realizar la búsqueda del usuario en la base de datos
            Tarifa tarifaConsultado = this.COLECCION.find(filtro).first();
            if (tarifaConsultado != null) {

                return tarifaConsultado;
            }
            // Devolver el usuario encontrado (puede ser null si no se encuentra)
            JOptionPane.showMessageDialog(null, "tarifa no encontrada", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Tarifa actualizarTarifa(Tarifa tarifa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Tarifa> consultarTodoTarifa() {
    
        List<Tarifa> tarifas = new ArrayList<>();

        // Realizar la búsqueda de todas las tarifas en la base de datos
        try (MongoCursor<Tarifa> cursor = this.COLECCION.find().iterator()) {
            while (cursor.hasNext()) {
                
                Tarifa tarifa = cursor.next();

                tarifas.add(tarifa);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        return tarifas;
    }

    @Override
    public boolean eliminarTarifa(Tarifa tarifa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
