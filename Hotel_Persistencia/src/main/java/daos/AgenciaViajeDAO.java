
package daos;

import baseDatos.IConexionBD;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import dominio.AgenciaViajes;
import dominio.Cliente;
import dominio.Usuario;
import interfaces.IAgenciaViajeDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author HP
 */
public class AgenciaViajeDAO implements IAgenciaViajeDAO{

    private final IConexionBD CONEXION;
    private final MongoDatabase BASE_DATOS;
    private final MongoCollection<Cliente> COLECCION;
    
    public AgenciaViajeDAO(IConexionBD CONEXION) {
        this.CONEXION = CONEXION;
        this.BASE_DATOS = CONEXION.getBaseDatos();
        this.COLECCION = BASE_DATOS.getCollection("clientes", Cliente.class);
    }
    
    //Metodos CRUD
    
    @Override
    public AgenciaViajes crearAgenciaViajes(AgenciaViajes agenciaViajes) {

        try {
            // Verificar si ya existe un administrador con el mismo RFC
            Document queryRfc = new Document("rfc", agenciaViajes.getRfc());
            long countRfc = this.COLECCION.countDocuments(queryRfc);
            if (countRfc > 0) {
                JOptionPane.showMessageDialog(null, "Ya existe una agencia de viajes con "
                        + "el mismo RFC", "Error", JOptionPane.ERROR_MESSAGE);
                throw new Exception("Ya existe una agencia de viajes con el mismo RFC");
            }
            // Insertar el administrador en la colección
            this.COLECCION.insertOne(agenciaViajes);

            return agenciaViajes;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public AgenciaViajes consultarAgenciaViajes(AgenciaViajes agenciaViajes) {
        try {
            // Construir el filtro para buscar el usuario por el nombre de usuario y contraseña
            Document filtro = new Document();
            filtro.append("nombre", agenciaViajes.getNombre());

            // Realizar la búsqueda del usuario en la base de datos
            AgenciaViajes agenciaViajeConsultado = (AgenciaViajes) this.COLECCION.find(filtro).first();
            if (agenciaViajeConsultado != null) {

                return agenciaViajeConsultado;
            }
            // Devolver el usuario encontrado (puede ser null si no se encuentra)
            JOptionPane.showMessageDialog(null, "Agencia no encontrada", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public AgenciaViajes actualizarAgenciaViajes(AgenciaViajes agenciaViajes) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<AgenciaViajes> consultarTodasAgenciaViajes() {
        List<AgenciaViajes> agencias = new ArrayList<>();

        // Realizar la búsqueda de todos las agencias en la base de datos
        try (MongoCursor<Cliente> cursor = this.COLECCION.find().iterator()) {
            while (cursor.hasNext()) {
                
                AgenciaViajes agenciaViajes = (AgenciaViajes) cursor.next();
      

                agencias.add(agenciaViajes);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        return agencias;
        
    }

    @Override
    public boolean eliminarAgenciaViajes(AgenciaViajes agenciaViajes) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
