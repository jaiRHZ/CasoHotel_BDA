
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
 * Clase AgenciaViajeDAO que implementa la interfaz IAgenciaViajeDAO.
 * Esta clase maneja las operaciones de base de datos para las agencias de viajes,
 * proporcionando funcionalidades CRUD (Crear, Leer, Actualizar, Eliminar).
 * Utiliza una conexión a MongoDB para almacenar y recuperar datos de agencias de viajes.
 * 
 * @author HP
 */
public class AgenciaViajeDAO implements IAgenciaViajeDAO{

    /**
     * Conexión a la base de datos MongoDB.
     */
    private final IConexionBD CONEXION;

    /**
     * Instancia de la base de datos MongoDB.
     */
    private final MongoDatabase BASE_DATOS;

    /**
     * Colección de MongoDB donde se almacenan los datos de las agencias de viajes.
     */
    private final MongoCollection<Cliente> COLECCION;
    
    /**
     * Constructor de AgenciaViajeDAO.
     * Inicializa la conexión con la base de datos MongoDB y configura la colección
     * para almacenar y gestionar los datos de las agencias de viajes.
     *
     * @param CONEXION La conexión a la base de datos MongoDB.
     */
    public AgenciaViajeDAO(IConexionBD CONEXION) {
        this.CONEXION = CONEXION;
        this.BASE_DATOS = CONEXION.getBaseDatos();
        this.COLECCION = BASE_DATOS.getCollection("clientes", Cliente.class);
    }
    
    /**
     * Crea una nueva agencia de viajes en la base de datos.
     * Antes de la inserción, verifica si ya existe una agencia con el mismo RFC.
     * Muestra un mensaje de error si la agencia ya existe.
     *
     * @param agenciaViajes La agencia de viajes a crear.
     * @return La agencia de viajes creada o null en caso de error.
     */
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

    /**
     * Consulta una agencia de viajes en la base de datos basándose en su nombre.
     * Si no se encuentra la agencia, muestra un mensaje de error.
     *
     * @param agenciaViajes La agencia de viajes con la información para la consulta.
     * @return La agencia de viajes encontrada o null si no se encuentra.
     */
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

    /**
     * Actualiza la información de una agencia de viajes existente en la base de datos.
     * Esta implementación aún no está soportada y lanzará una excepción si se intenta usar.
     * 
     * @param agenciaViajes La agencia de viajes con la información actualizada.
     * @return La agencia de viajes actualizada.
     */
    @Override
    public AgenciaViajes actualizarAgenciaViajes(AgenciaViajes agenciaViajes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Consulta y devuelve todas las agencias de viajes existentes en la base de datos.
     * Retorna una lista de todas las agencias encontradas.
     * 
     * @return Una lista de todas las agencias de viajes.
     */
    @Override
    public List<AgenciaViajes> consultarTodasAgenciaViajes() {
        List<AgenciaViajes> agencias = new ArrayList<>();
        try {
            // Implementación detallada del método...
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return agencias;
    }

    /**
     * Elimina una agencia de viajes de la base de datos.
     * Esta implementación aún no está soportada y lanzará una excepción si se intenta usar.
     *
     * @param agenciaViajes La agencia de viajes a eliminar.
     * @return Verdadero si la eliminación fue exitosa, falso de lo contrario.
     */
    @Override
    public boolean eliminarAgenciaViajes(AgenciaViajes agenciaViajes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
