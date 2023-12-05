
package interfaces;

import dominio.AgenciaViajes;
import java.util.List;

/**
 * Interfaz IAgenciaViajeDAO que define las operaciones CRUD (Crear, Leer, Actualizar, Eliminar)
 * para la entidad AgenciaViajes. Establece los métodos necesarios para interactuar con la base de datos
 * en lo que respecta a las agencias de viajes.
 * 
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public interface IAgenciaViajeDAO {
   
    /**
     * Crea una nueva agencia de viajes en la base de datos.
     * 
     * @param agenciaViajes La agencia de viajes a crear.
     * @return La agencia de viajes creada, incluyendo cualquier dato generado como ID.
     */
    public AgenciaViajes crearAgenciaViajes(AgenciaViajes agenciaViajes);
    
    /**
     * Consulta una agencia de viajes específica en la base de datos.
     * 
     * @param agenciaViajes La agencia de viajes con criterios específicos para la búsqueda.
     * @return La agencia de viajes encontrada o null si no existe una agencia con esos criterios.
     */
    public AgenciaViajes consultarAgenciaViajes(AgenciaViajes agenciaViajes);
    
    /**
     * Actualiza una agencia de viajes existente en la base de datos.
     * 
     * @param agenciaViajes La agencia de viajes con la información a actualizar.
     * @return La agencia de viajes actualizada.
     */
    public AgenciaViajes actualizarAgenciaViajes(AgenciaViajes agenciaViajes);
    
    /**
     * Consulta todas las agencias de viajes existentes en la base de datos.
     * 
     * @return Una lista de todas las agencias de viajes disponibles.
     */
    public List<AgenciaViajes> consultarTodasAgenciaViajes();
    
    /**
     * Elimina una agencia de viajes específica de la base de datos.
     * 
     * @param agenciaViajes La agencia de viajes a eliminar.
     * @return Verdadero si la eliminación fue exitosa, falso de lo contrario.
     */
    public boolean eliminarAgenciaViajes(AgenciaViajes agenciaViajes);
}

