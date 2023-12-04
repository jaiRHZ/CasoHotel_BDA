
package interfaces;

import dominio.Cliente;
import java.util.List;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public interface IClienteDAO {
    
    public Cliente crearCliente(Cliente cliente);
    
    public Cliente consultarCliente(Cliente cliente);
    
    public Cliente actualizarCliente(Cliente cliente);
    
    public List<Cliente> consultarTodoCliente();
    
    public boolean eliminarCliente(Cliente cliente); 
}
