
package interfaces;

import dominio.Reservacion;
import java.util.List;

/**
 * Interfaz IReservacionDAO que define las operaciones CRUD (Crear, Leer, Actualizar, Eliminar)
 * para la entidad Reservacion. Establece los métodos necesarios para gestionar las reservaciones
 * en la base de datos, incluyendo su creación, consulta, actualización y eliminación.
 * 
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public interface IReservacionDAO {
    
    /**
     * Crea una nueva reservación en la base de datos.
     * 
     * @param reservacion La reservación a ser creada.
     * @return La reservación creada, incluyendo cualquier dato generado como ID.
     */
    public Reservacion crearReservacion(Reservacion reservacion);
    
    /**
     * Consulta una reservación específica en la base de datos.
     * 
     * @param reservacion La reservación con criterios específicos para la búsqueda.
     * @return La reservación encontrada o null si no existe una reservación con esos criterios.
     */
    public Reservacion consultarReservacion(Reservacion reservacion);
    
    /**
     * Actualiza una reservación existente en la base de datos.
     * 
     * @param reservacion La reservación con la información a actualizar.
     * @return La reservación actualizada.
     */
    public Reservacion actualizarReservacion(Reservacion reservacion);
    
    /**
     * Consulta todas las reservaciones existentes en la base de datos.
     * 
     * @return Una lista de todas las reservaciones disponibles.
     */
    public List<Reservacion> consultarTodoReservacion();
    
    /**
     * Elimina una reservación específica de la base de datos.
     * 
     * @param reservacion La reservación a eliminar.
     * @return Verdadero si la eliminación fue exitosa, falso de lo contrario.
     */
    public boolean eliminarReservacion(Reservacion reservacion);
}

