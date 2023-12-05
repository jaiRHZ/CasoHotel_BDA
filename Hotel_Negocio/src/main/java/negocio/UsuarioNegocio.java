
package negocio;

import dominio.Usuario;
import fachada.IDatos;
import java.util.List;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class UsuarioNegocio {
    
    IDatos datos;

    public UsuarioNegocio(IDatos datos) {
        this.datos = datos;
    }
    
    
    public Usuario crearUsuario(Usuario usuario){
        return datos.crearUsuario(usuario);
    }
    
    public Usuario consultarUsuario(Usuario usuario) {
        return datos.consultarUsuario(usuario);
    }
    
    public List<Usuario> consultarTodoUsuario() {
        return datos.consultarTodoUsuario();
    }
}
