
package interfaces;

import dominio.Habitacion;
import java.util.List;

/**
 * Interfaz IHabitacionDAO que define las operaciones CRUD (Crear, Leer, Actualizar, Eliminar)
 * para la entidad Habitacion. Establece los métodos necesarios para la gestión de habitaciones
 * en la base de datos, incluyendo su creación, consulta, actualización y eliminación.
 * 
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public interface IHabitacionDAO {
    
    /**
     * Crea una nueva habitación en la base de datos.
     * 
     * @param habitacion La habitación a ser creada.
     * @return La habitación creada, incluyendo cualquier dato generado como ID.
     */
    public Habitacion crearHabitacion(Habitacion habitacion);
    
    /**
     * Consulta una habitación específica en la base de datos.
     * 
     * @param habitacion La habitación con criterios específicos para la búsqueda.
     * @return La habitación encontrada o null si no existe una habitación con esos criterios.
     */
    public Habitacion consultarHabitacion(Habitacion habitacion);
    
    /**
     * Actualiza una habitación existente en la base de datos.
     * 
     * @param habitacion La habitación con la información a actualizar.
     * @return La habitación actualizada.
     */
    public Habitacion actualizarHabitacion(Habitacion habitacion);
    
    /**
     * Consulta todas las habitaciones existentes en la base de datos.
     * 
     * @return Una lista de todas las habitaciones disponibles.
     */
    public List<Habitacion> consultarTodoHabitacion();
    
    /**
     * Elimina una habitación específica de la base de datos.
     * 
     * @param habitacion La habitación a eliminar.
     * @return Verdadero si la eliminación fue exitosa, falso de lo contrario.
     */
    public boolean eliminarHabitacion(Habitacion habitacion);
}

