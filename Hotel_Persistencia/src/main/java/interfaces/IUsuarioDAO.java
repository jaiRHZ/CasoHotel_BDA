
package interfaces;

import dominio.Usuario;
import java.util.List;

/**
 * Interfaz IUsuarioDAO que define las operaciones CRUD (Crear, Leer, Actualizar, Eliminar)
 * para la entidad Usuario. Esta interfaz establece los métodos necesarios para manejar
 * los usuarios en la base de datos, incluyendo su creación, consulta, actualización y eliminación.
 * 
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public interface IUsuarioDAO {
    
    /**
     * Crea un nuevo usuario en la base de datos.
     * 
     * @param usuario El usuario a ser creado.
     * @return El usuario creado, incluyendo cualquier dato generado como ID.
     */
    public Usuario crearUsuario(Usuario usuario);
    
    /**
     * Consulta un usuario específico en la base de datos.
     * 
     * @param usuario El usuario con criterios específicos para la búsqueda.
     * @return El usuario encontrado o null si no existe un usuario con esos criterios.
     */
    public Usuario consultarUsuario(Usuario usuario);
    
    /**
     * Actualiza un usuario existente en la base de datos.
     * 
     * @param usuario El usuario con la información a actualizar.
     * @return El usuario actualizado.
     */
    public Usuario actualizarUsuario(Usuario usuario);
    
    /**
     * Consulta todos los usuarios existentes en la base de datos.
     * 
     * @return Una lista de todos los usuarios disponibles.
     */
    public List<Usuario> consultarTodoUsuario();
    
    /**
     * Elimina un usuario específico de la base de datos.
     * Nota: A diferencia de otros métodos de eliminación, este método devuelve el usuario eliminado
     * en lugar de un valor booleano.
     * 
     * @param usuario El usuario a eliminar.
     * @return El usuario eliminado o null si la eliminación no es exitosa.
     */
    public Usuario eliminarUsuario(Usuario usuario);
}

