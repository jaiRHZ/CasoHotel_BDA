
package daos;

import baseDatos.IConexionBD;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import dominio.AgenciaViajes;
import dominio.Cliente;
import dominio.Usuario;
import interfaces.IUsuarioDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 * Clase UsuarioDAO que implementa la interfaz IUsuarioDAO.
 * Se encarga de las operaciones de base de datos para los usuarios,
 * proporcionando funcionalidades CRUD (Crear, Leer, Actualizar, Eliminar).
 * Utiliza una conexión a MongoDB para almacenar y recuperar datos de usuarios.
 */
public class UsuarioDAO implements IUsuarioDAO {

    /**
     * Conexión a la base de datos MongoDB.
     */
    private final IConexionBD CONEXION;

    /**
     * Instancia de la base de datos MongoDB.
     */
    private final MongoDatabase BASE_DATOS;

    /**
     * Colección de MongoDB donde se almacenan los datos de los usuarios.
     */
    private final MongoCollection<Cliente> COLECCION;
    
    /**
     * Constructor de UsuarioDAO.
     * Inicializa la conexión con la base de datos MongoDB y configura la colección
     * para almacenar y gestionar los datos de los usuarios.
     *
     * @param CONEXION La conexión a la base de datos MongoDB.
     */
    public UsuarioDAO(IConexionBD CONEXION) {
        this.CONEXION = CONEXION;
        this.BASE_DATOS = CONEXION.getBaseDatos();
        this.COLECCION = BASE_DATOS.getCollection("clientes", Cliente.class);
    }
    
    /**
     * Crea un nuevo usuario en la base de datos.
     * Antes de la inserción, verifica si ya existe un usuario con el mismo RFC.
     * Muestra un mensaje de error si el usuario ya existe.
     *
     * @param usuario El usuario a crear.
     * @return El usuario creado o null en caso de error.
     */
    @Override
    public Usuario crearUsuario(Usuario usuario) {
        try {
            // Verificar si ya existe un administrador con el mismo RFC
            Document queryRfc = new Document("rfc", usuario.getRfc());
            long countRfc = this.COLECCION.countDocuments(queryRfc);
            if (countRfc > 0) {
                JOptionPane.showMessageDialog(null, "Ya existe un usuario con "
                        + "el mismo RFC", "Error", JOptionPane.ERROR_MESSAGE);
                throw new Exception("Ya existe un usuario con el mismo RFC");
            }
            // Insertar el administrador en la colección
            this.COLECCION.insertOne(usuario);

            return usuario;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Consulta un usuario en la base de datos.
     * Realiza la búsqueda basándose en el nombre completo y apellidos.
     * Muestra un mensaje de error si el usuario no se encuentra.
     *
     * @param usuario El usuario a consultar.
     * @return El usuario consultado o null si no se encuentra.
     */
    @Override
    public Usuario consultarUsuario(Usuario usuario) {
        try {
            // Construir el filtro para buscar el usuario por el nombre de usuario y contraseña
            Document filtro = new Document();
            filtro.append("nombreCompleto", usuario.getNombreCompleto());
            filtro.append("apellidoPaterno", usuario.getApellidoPaterno());
            filtro.append("apellidoMaterno", usuario.getApellidoMaterno());

            // Realizar la búsqueda del usuario en la base de datos
            Usuario usuarioConsultado = (Usuario) this.COLECCION.find(filtro).first();
            if (usuarioConsultado != null) {

                return usuarioConsultado;
            }
            // Devolver el usuario encontrado (puede ser null si no se encuentra)
            JOptionPane.showMessageDialog(null, "Usuario no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Actualiza la información de un usuario existente en la base de datos.
     * Esta implementación aún no está soportada y lanzará una excepción si se intenta usar.
     * 
     * @param usuario El usuario a actualizar.
     * @return El usuario actualizado.
     */
    @Override
    public Usuario actualizarUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Consulta y devuelve todos los usuarios existentes en la base de datos.
     * Retorna una lista de todos los usuarios encontrados.
     * 
     * @return Una lista de todos los usuarios.
     */
    @Override
    public List<Usuario> consultarTodoUsuario() {
        List<Usuario> usuarios = new ArrayList<>();

        // Realizar la búsqueda de todos las agencias en la base de datos
        try (MongoCursor<Cliente> cursor = this.COLECCION.find().iterator()) {
            while (cursor.hasNext()) {
                
                Usuario usuario = (Usuario) cursor.next();

                usuarios.add(usuario);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return usuarios;
    }

    /**
     * Elimina un usuario de la base de datos.
     * Esta implementación aún no está soportada y lanzará una excepción si se intenta usar.
     *
     * @param usuario El usuario a eliminar.
     * @return El usuario eliminado o null si la eliminación falla.
     */
    @Override
    public Usuario eliminarUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
