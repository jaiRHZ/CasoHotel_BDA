
package fachada;

import dominio.AgenciaViajes;
import dominio.Habitacion;
import dominio.Hotel;
import dominio.Reservacion;
import dominio.Tarifa;
import dominio.Usuario;
import java.util.List;

/**
 * Interfaz IDatos que define las operaciones CRUD (Crear, Leer, Actualizar, Eliminar) 
 * para diferentes entidades como AgenciaViajes, Habitacion, Hotel, Reservacion, Tarifa y Usuario.
 * 
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public interface IDatos {
    
    // Métodos para Agencia de Viajes

    /**
     * Crea una nueva agencia de viajes.
     *
     * @param agenciaViajes La agencia de viajes a crear.
     * @return La agencia de viajes creada.
     */
    public AgenciaViajes crearAgenciaViajes(AgenciaViajes agenciaViajes);
    
    /**
     * Consulta una agencia de viajes específica.
     *
     * @param agenciaViajes La agencia de viajes a consultar.
     * @return La agencia de viajes consultada.
     */
    public AgenciaViajes consultarAgenciaViajes(AgenciaViajes agenciaViajes);
    
    /**
     * Actualiza una agencia de viajes existente.
     *
     * @param agenciaViajes La agencia de viajes con información actualizada.
     * @return La agencia de viajes actualizada.
     */
    public AgenciaViajes actualizarAgenciaViajes(AgenciaViajes agenciaViajes);
    
    /**
     * Consulta todas las agencias de viajes disponibles.
     *
     * @return Una lista de todas las agencias de viajes.
     */
    public List<AgenciaViajes> consultarTodasAgenciaViajes();
    
    /**
     * Elimina una agencia de viajes específica.
     *
     * @param agenciaViajes La agencia de viajes a eliminar.
     * @return Verdadero si la agencia fue eliminada exitosamente, falso de lo contrario.
     */
    public boolean eliminarAgenciaViajes(AgenciaViajes agenciaViajes);
    
    // Métodos para Habitación

/**
 * Crea una nueva habitación.
 *
 * @param habitacion La habitación a crear.
 * @return La habitación creada o null si la creación falla por cualquier razón.
 */
public Habitacion crearHabitacion(Habitacion habitacion);

/**
 * Consulta una habitación específica basada en sus atributos.
 *
 * @param habitacion La habitación con criterios específicos para la consulta.
 * @return La habitación consultada o null si no se encuentra.
 */
public Habitacion consultarHabitacion(Habitacion habitacion);

/**
 * Actualiza una habitación existente.
 *
 * @param habitacion La habitación con los datos actualizados.
 * @return La habitación actualizada o null si la actualización no es exitosa.
 */
public Habitacion actualizarHabitacion(Habitacion habitacion);

/**
 * Consulta todas las habitaciones disponibles.
 *
 * @return Una lista de todas las habitaciones disponibles.
 */
public List<Habitacion> consultarTodoHabitacion();

/**
 * Elimina una habitación específica.
 *
 * @param habitacion La habitación a eliminar.
 * @return Verdadero si la eliminación fue exitosa, falso de lo contrario.
 */
public boolean eliminarHabitacion(Habitacion habitacion);

// Métodos para Hotel

/**
 * Crea un nuevo hotel.
 *
 * @param hotel El hotel a crear.
 * @return El hotel creado o null si la creación falla por cualquier razón.
 */
public Hotel crearHotel(Hotel hotel);

/**
 * Consulta un hotel específico basado en sus atributos.
 *
 * @param hotel El hotel con criterios específicos para la consulta.
 * @return El hotel consultado o null si no se encuentra.
 */
public Hotel consultarHotel(Hotel hotel);

/**
 * Actualiza un hotel existente.
 *
 * @param hotel El hotel con los datos actualizados.
 * @return El hotel actualizado o null si la actualización no es exitosa.
 */
public Hotel actualizarHotel(Hotel hotel);

/**
 * Consulta todos los hoteles disponibles.
 *
 * @return Una lista de todos los hoteles disponibles.
 */
public List<Hotel> consultarTodoHotel();

/**
 * Elimina un hotel específico.
 *
 * @param hotel El hotel a eliminar.
 * @return Verdadero si la eliminación fue exitosa, falso de lo contrario.
 */
public boolean eliminarHotel(Hotel hotel);

// Métodos para Reservación

/**
 * Crea una nueva reservación.
 *
 * @param reservacion La reservación a crear.
 * @return La reservación creada o null si la creación falla por cualquier razón.
 */
public Reservacion crearReservacion(Reservacion reservacion);

/**
 * Consulta una reservación específica basada en sus atributos.
 *
 * @param reservacion La reservación con criterios específicos para la consulta.
 * @return La reservación consultada o null si no se encuentra.
 */
public Reservacion consultarReservacion(Reservacion reservacion);

/**
 * Actualiza una reservación existente.
 *
 * @param reservacion La reservación con los datos actualizados.
 * @return La reservación actualizada o null si la actualización no es exitosa.
 */
public Reservacion actualizarReservacion(Reservacion reservacion);

/**
 * Consulta todas las reservaciones disponibles.
 *
 * @return Una lista de todas las reservaciones disponibles.
 */
public List<Reservacion> consultarTodoReservacion();

/**
 * Elimina una reservación específica.
 *
 * @param reservacion La reservación a eliminar.
 * @return Verdadero si la eliminación fue exitosa, falso de lo contrario.
 */
public boolean eliminarReservacion(Reservacion reservacion);

// Métodos para Tarifa

/**
 * Crea una nueva tarifa.
 *
 * @param tarifa La tarifa a crear.
 * @return La tarifa creada o null si la creación falla por cualquier razón.
 */
public Tarifa crearTarifa(Tarifa tarifa);

/**
 * Consulta una tarifa específica basada en sus atributos.
 *
 * @param tarifa La tarifa con criterios específicos para la consulta.
 * @return La tarifa consultada o null si no se encuentra.
 */
public Tarifa consultarTarifa(Tarifa tarifa);

/**
 * Actualiza una tarifa existente.
 *
 * @param tarifa La tarifa con los datos actualizados.
 * @return La tarifa actualizada o null si la actualización no es exitosa.
 */
public Tarifa actualizarTarifa(Tarifa tarifa);

/**
 * Consulta todas las tarifas disponibles.
 *
 * @return Una lista de todas las tarifas disponibles.
 */
public List<Tarifa> consultarTodoTarifa();

/**
 * Elimina una tarifa específica.
 *
 * @param tarifa La tarifa a eliminar.
 * @return Verdadero si la eliminación fue exitosa, falso de lo contrario.
 */
public boolean eliminarTarifa(Tarifa tarifa);

// Métodos para Usuario

/**
 * Crea un nuevo usuario.
 *
 * @param usuario El usuario a crear.
 * @return El usuario creado o null si la creación falla por cualquier razón.
 */
public Usuario crearUsuario(Usuario usuario);

/**
 * Consulta un usuario específico basado en sus atributos.
 *
 * @param usuario El usuario con criterios específicos para la consulta.
 * @return El usuario consultado o null si no se encuentra.
 */
public Usuario consultarUsuario(Usuario usuario);

/**
 * Actualiza un usuario existente.
 *
 * @param usuario El usuario con los datos actualizados.
 * @return El usuario actualizado o null si la actualización no es exitosa.
 */
public Usuario actualizarUsuario(Usuario usuario);

/**
 * Consulta todos los usuarios disponibles.
 *
 * @return Una lista de todos los usuarios disponibles.
 */
public List<Usuario> consultarTodoUsuario();

/**
 * Elimina un usuario específico.
 *
 * @param usuario El usuario a eliminar.
 * @return El usuario eliminado o null si la eliminación falla.
 */
public Usuario eliminarUsuario(Usuario usuario);
}