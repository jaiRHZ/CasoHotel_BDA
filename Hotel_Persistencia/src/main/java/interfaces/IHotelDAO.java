
package interfaces;

import dominio.Hotel;
import java.util.List;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public interface IHotelDAO {
    
    public Hotel crearHotel(Hotel hotel);
    
    public Hotel consultarHotel(Hotel hotel);
    
    public Hotel actualizarHotel(Hotel hotel);
    
    public List<Hotel> consultarTodoHotel();
    
    public boolean eliminarHotel(Hotel hotel);
}
