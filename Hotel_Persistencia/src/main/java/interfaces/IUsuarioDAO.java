
package interfaces;

import dominio.Usuario;
import java.util.List;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public interface IUsuarioDAO {
    
    public Usuario crearUsuario(Usuario usuario);
    
    public Usuario consultarUsuario(Usuario usuario);
    
    public Usuario actualizarUsuario(Usuario usuario);
    
    public List<Usuario> consultarTodoUsuario();
    
    public Usuario eliminarUsuario(Usuario usuario);
}
