
package interfaces;

import dominio.Tarifa;
import java.util.List;

/**
 * Interfaz ITarifaDAO que define las operaciones CRUD (Crear, Leer, Actualizar, Eliminar)
 * para la entidad Tarifa. Esta interfaz establece los métodos necesarios para manejar
 * las tarifas en la base de datos, abarcando su creación, consulta, actualización y eliminación.
 * 
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public interface ITarifaDAO {
    
    /**
     * Crea una nueva tarifa en la base de datos.
     * 
     * @param tarifa La tarifa a ser creada.
     * @return La tarifa creada, incluyendo cualquier dato generado como ID.
     */
    public Tarifa crearTarifa(Tarifa tarifa);
    
    /**
     * Consulta una tarifa específica en la base de datos.
     * 
     * @param tarifa La tarifa con criterios específicos para la búsqueda.
     * @return La tarifa encontrada o null si no existe una tarifa con esos criterios.
     */
    public Tarifa consultarTarifa(Tarifa tarifa);
    
    /**
     * Actualiza una tarifa existente en la base de datos.
     * 
     * @param tarifa La tarifa con la información a actualizar.
     * @return La tarifa actualizada.
     */
    public Tarifa actualizarTarifa(Tarifa tarifa);
    
    /**
     * Consulta todas las tarifas existentes en la base de datos.
     * 
     * @return Una lista de todas las tarifas disponibles.
     */
    public List<Tarifa> consultarTodoTarifa();
    
    /**
     * Elimina una tarifa específica de la base de datos.
     * 
     * @param tarifa La tarifa a eliminar.
     * @return Verdadero si la eliminación fue exitosa, falso de lo contrario.
     */
    public boolean eliminarTarifa(Tarifa tarifa);
}
