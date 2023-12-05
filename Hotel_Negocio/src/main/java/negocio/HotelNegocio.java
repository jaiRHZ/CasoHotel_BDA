
package negocio;

import dominio.Hotel;
import fachada.IDatos;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class HotelNegocio {
    
    IDatos datos;

    public HotelNegocio(IDatos datos) {
        this.datos = datos;
    }
    
    public Hotel crearHotel(Hotel hotel){
        return datos.crearHotel(hotel);
    }
    
}
