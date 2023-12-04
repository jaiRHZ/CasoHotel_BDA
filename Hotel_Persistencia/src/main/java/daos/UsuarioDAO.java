
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
 *
 * @author HP
 */
public class UsuarioDAO implements IUsuarioDAO{

    private final IConexionBD CONEXION;
    private final MongoDatabase BASE_DATOS;
    private final MongoCollection<Cliente> COLECCION;
    
    public UsuarioDAO(IConexionBD CONEXION) {
        this.CONEXION = CONEXION;
        this.BASE_DATOS = CONEXION.getBaseDatos();
        this.COLECCION = BASE_DATOS.getCollection("clientes", Cliente.class);
    }
    
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

    @Override
    public Usuario actualizarUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

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

    @Override
    public Usuario eliminarUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
