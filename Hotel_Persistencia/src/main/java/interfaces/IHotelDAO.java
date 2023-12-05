
package interfaces;

import dominio.Hotel;
import java.util.List;

/**
 * Interfaz IHotelDAO que define las operaciones CRUD (Crear, Leer, Actualizar, Eliminar)
 * para la entidad Hotel. Establece los métodos necesarios para la gestión de hoteles
 * en la base de datos, abarcando su creación, consulta, actualización y eliminación.
 * 
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public interface IHotelDAO {
    
    /**
     * Crea un nuevo hotel en la base de datos.
     * 
     * @param hotel El hotel a ser creado.
     * @return El hotel creado, incluyendo cualquier dato generado como ID.
     */
    public Hotel crearHotel(Hotel hotel);
    
    /**
     * Consulta un hotel específico en la base de datos.
     * 
     * @param hotel El hotel con criterios específicos para la búsqueda.
     * @return El hotel encontrado o null si no existe un hotel con esos criterios.
     */
    public Hotel consultarHotel(Hotel hotel);
    
    /**
     * Actualiza un hotel existente en la base de datos.
     * 
     * @param hotel El hotel con la información a actualizar.
     * @return El hotel actualizado.
     */
    public Hotel actualizarHotel(Hotel hotel);
    
    /**
     * Consulta todos los hoteles existentes en la base de datos.
     * 
     * @return Una lista de todos los hoteles disponibles.
     */
    public List<Hotel> consultarTodoHotel();
    
    /**
     * Elimina un hotel específico de la base de datos.
     * 
     * @param hotel El hotel a eliminar.
     * @return Verdadero si la eliminación fue exitosa, falso de lo contrario.
     */
    public boolean eliminarHotel(Hotel hotel);
}

