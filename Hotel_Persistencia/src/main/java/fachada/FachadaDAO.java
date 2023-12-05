package fachada;

import daos.AgenciaViajeDAO;
import daos.HabitacionDAO;
import daos.HotelDAO;
import daos.ReservacionDAO;
import daos.TarifaDAO;
import daos.UsuarioDAO;
import dominio.AgenciaViajes;
import dominio.Habitacion;
import dominio.Hotel;
import dominio.Reservacion;
import dominio.Tarifa;
import dominio.Usuario;
import factory.FabricaDAO;
import java.util.List;

/**
 * Clase FachadaDAO que implementa la interfaz IDatos. Actúa como una fachada
 * para los diversos DAOs (Data Access Objects), proporcionando una interfaz
 * unificada para interactuar con distintos tipos de entidades como
 * AgenciaViajes, Habitacion, Hotel, Reservacion, Tarifa y Usuario. Utiliza el
 * patrón de diseño Fachada para simplificar la interacción entre la lógica de
 * negocio y las operaciones de acceso a datos.
 * 
 * @autor HP
 */
public class FachadaDAO implements IDatos {

    private AgenciaViajeDAO agenciaViajeDAO;
    private HabitacionDAO habitacionDAO;
    private HotelDAO hotelDAO;
    private ReservacionDAO reservacionDAO;
    private TarifaDAO tarifaDAO;
    private UsuarioDAO usuarioDAO;

    /**
     * Constructor de FachadaDAO. Inicializa los DAOs necesarios para las
     * operaciones de acceso a datos.
     */
    public FachadaDAO() {
        FabricaDAO fabrica = new FabricaDAO();

        this.agenciaViajeDAO = fabrica.crearAgenciaViajeDAO();
        this.habitacionDAO = fabrica.crearHabitacionDAO();
        this.hotelDAO = fabrica.crearHotelDAO();
        this.reservacionDAO = fabrica.crearReservacionDAO();
        this.tarifaDAO = fabrica.crearTarifaDAO();
        this.usuarioDAO = fabrica.crearUsuarioDAO();
    }

    // Métodos para AgenciaViajes
    /**
     * Crea una nueva agencia de viajes. Delega la creación de la agencia de
     * viajes al agenciaViajeDAO.
     *
     * @param agenciaViajes La agencia de viajes a crear.
     * @return La agencia de viajes creada.
     */
    @Override
    public AgenciaViajes crearAgenciaViajes(AgenciaViajes agenciaViajes) {
        return agenciaViajeDAO.crearAgenciaViajes(agenciaViajes);
    }

    /**
     * Consulta una agencia de viajes. Delega la consulta de la agencia de
     * viajes al agenciaViajeDAO.
     *
     * @param agenciaViajes La agencia de viajes a consultar.
     * @return La agencia de viajes consultada.
     */
    @Override
    public AgenciaViajes consultarAgenciaViajes(AgenciaViajes agenciaViajes) {
        return agenciaViajeDAO.consultarAgenciaViajes(agenciaViajes);
    }

    /**
     * Actualiza una agencia de viajes. Delega la actualización de la agencia de
     * viajes al agenciaViajeDAO.
     *
     * @param agenciaViajes La agencia de viajes a actualizar.
     * @return La agencia de viajes actualizada.
     */
    @Override
    public AgenciaViajes actualizarAgenciaViajes(AgenciaViajes agenciaViajes) {
        return agenciaViajeDAO.actualizarAgenciaViajes(agenciaViajes);
    }

    /**
     * Consulta todas las agencias de viajes. Delega la consulta de todas las
     * agencias de viajes al agenciaViajeDAO.
     *
     * @return Lista de todas las agencias de viajes.
     */
    @Override
    public List<AgenciaViajes> consultarTodasAgenciaViajes() {
        return agenciaViajeDAO.consultarTodasAgenciaViajes();
    }

    /**
     * Elimina una agencia de viajes. Delega la eliminación de la agencia de
     * viajes al agenciaViajeDAO.
     *
     * @param agenciaViajes La agencia de viajes a eliminar.
     * @return Verdadero si la eliminación fue exitosa, falso de lo contrario.
     */
    @Override
    public boolean eliminarAgenciaViajes(AgenciaViajes agenciaViajes) {
        return agenciaViajeDAO.eliminarAgenciaViajes(agenciaViajes);
    }

    // Métodos para Habitación
    /**
     * Crea una nueva habitación. Delega la creación de la habitación al
     * habitacionDAO.
     *
     * @param habitacion La habitación a crear.
     * @return La habitación creada o null si no pudo ser creada.
     */
    @Override
    public Habitacion crearHabitacion(Habitacion habitacion) {
        return habitacionDAO.crearHabitacion(habitacion);
    }

    /**
     * Consulta una habitación específica. Delega la consulta de la habitación
     * al habitacionDAO.
     *
     * @param habitacion La habitación con los criterios de búsqueda.
     * @return La habitación encontrada o null si no se encuentra.
     */
    @Override
    public Habitacion consultarHabitacion(Habitacion habitacion) {
        return habitacionDAO.consultarHabitacion(habitacion);
    }

    /**
     * Actualiza una habitación existente. Delega la actualización de la
     * habitación al habitacionDAO.
     *
     * @param habitacion La habitación con la información actualizada.
     * @return La habitación actualizada o null si no pudo ser actualizada.
     */
    @Override
    public Habitacion actualizarHabitacion(Habitacion habitacion) {
        return habitacionDAO.actualizarHabitacion(habitacion);
    }

    /**
     * Consulta todas las habitaciones. Delega la consulta de todas las
     * habitaciones al habitacionDAO.
     *
     * @return Una lista de todas las habitaciones disponibles.
     */
    @Override
    public List<Habitacion> consultarTodoHabitacion() {
        return habitacionDAO.consultarTodoHabitacion();
    }

    /**
     * Elimina una habitación. Delega la eliminación de la habitación al
     * habitacionDAO.
     *
     * @param habitacion La habitación a eliminar.
     * @return Verdadero si la eliminación fue exitosa, falso de lo contrario.
     */
    @Override
    public boolean eliminarHabitacion(Habitacion habitacion) {
        return habitacionDAO.eliminarHabitacion(habitacion);
    }

    // Métodos para Hotel
    /**
     * Crea un nuevo hotel. Delega la creación del hotel al hotelDAO.
     *
     * @param hotel El hotel a crear.
     * @return El hotel creado o null si no pudo ser creado debido a un
     * conflicto o error.
     */
    @Override
    public Hotel crearHotel(Hotel hotel) {
        return hotelDAO.crearHotel(hotel);
    }

    /**
     * Consulta un hotel específico. Delega la consulta del hotel al hotelDAO.
     *
     * @param hotel El hotel con los criterios de búsqueda.
     * @return El hotel encontrado o null si no se encuentra.
     */
    @Override
    public Hotel consultarHotel(Hotel hotel) {
        return hotelDAO.consultarHotel(hotel);
    }

    /**
     * Actualiza un hotel existente. Delega la actualización del hotel al
     * hotelDAO.
     *
     * @param hotel El hotel con la información actualizada.
     * @return El hotel actualizado o null si no pudo ser actualizado.
     */
    @Override
    public Hotel actualizarHotel(Hotel hotel) {
        return hotelDAO.actualizarHotel(hotel);
    }

    /**
     * Consulta todos los hoteles. Delega la consulta de todos los hoteles al
     * hotelDAO.
     *
     * @return Una lista de todos los hoteles disponibles.
     */
    @Override
    public List<Hotel> consultarTodoHotel() {
        return hotelDAO.consultarTodoHotel();
    }

    /**
     * Elimina un hotel. Delega la eliminación del hotel al hotelDAO.
     *
     * @param hotel El hotel a eliminar.
     * @return Verdadero si la eliminación fue exitosa, falso de lo contrario.
     */
    @Override
    public boolean eliminarHotel(Hotel hotel) {
        return hotelDAO.eliminarHotel(hotel);
    }

// Métodos para Reservación
    /**
     * Crea una nueva reservación. Delega la creación de la reservación al
     * reservacionDAO.
     *
     * @param reservacion La reservación a crear.
     * @return La reservación creada o null si no pudo ser creada.
     */
    @Override
    public Reservacion crearReservacion(Reservacion reservacion) {
        return reservacionDAO.crearReservacion(reservacion);
    }

    /**
     * Consulta una reservación específica. Delega la consulta de la reservación
     * al reservacionDAO.
     *
     * @param reservacion La reservación con los criterios de búsqueda.
     * @return La reservación encontrada o null si no se encuentra.
     */
    @Override
    public Reservacion consultarReservacion(Reservacion reservacion) {
        return reservacionDAO.consultarReservacion(reservacion);
    }

    /**
     * Actualiza una reservación existente. Delega la actualización de la
     * reservación al reservacionDAO.
     *
     * @param reservacion La reservación con la información actualizada.
     * @return La reservación actualizada o null si no pudo ser actualizada.
     */
    @Override
    public Reservacion actualizarReservacion(Reservacion reservacion) {
        return reservacionDAO.actualizarReservacion(reservacion);
    }

    /**
     * Consulta todas las reservaciones. Delega la consulta de todas las
     * reservaciones al reservacionDAO.
     *
     * @return Una lista de todas las reservaciones disponibles.
     */
    @Override
    public List<Reservacion> consultarTodoReservacion() {
        return reservacionDAO.consultarTodoReservacion();
    }

    /**
     * Elimina una reservación. Delega la eliminación de la reservación al
     * reservacionDAO.
     *
     * @param reservacion La reservación a eliminar.
     * @return Verdadero si la eliminación fue exitosa, falso de lo contrario.
     */
    @Override
    public boolean eliminarReservacion(Reservacion reservacion) {
        return reservacionDAO.eliminarReservacion(reservacion);
    }

// Métodos para Tarifa
    /**
     * Crea una nueva tarifa. Delega la creación de la tarifa al tarifaDAO.
     *
     * @param tarifa La tarifa a crear.
     * @return La tarifa creada o null si no pudo ser creada.
     */
    @Override
    public Tarifa crearTarifa(Tarifa tarifa) {
        return tarifaDAO.crearTarifa(tarifa);
    }

    /**
     * Consulta una tarifa específica. Delega la consulta de la tarifa al
     * tarifaDAO.
     *
     * @param tarifa La tarifa con los criterios de búsqueda.
     * @return La tarifa encontrada o null si no se encuentra.
     */
    @Override
    public Tarifa consultarTarifa(Tarifa tarifa) {
        return tarifaDAO.consultarTarifa(tarifa);
    }

    /**
     * Actualiza una tarifa existente. Delega la actualización de la tarifa al
     * tarifaDAO.
     *
     * @param tarifa La tarifa con la información actualizada.
     * @return La tarifa actualizada o null si no pudo ser actualizada.
     */
    @Override
    public Tarifa actualizarTarifa(Tarifa tarifa) {
        return tarifaDAO.actualizarTarifa(tarifa);
    }

    /**
     * Consulta todas las tarifas. Delega la consulta de todas las tarifas al
     * tarifaDAO.
     *
     * @return Una lista de todas las tarifas disponibles.
     */
    @Override
    public List<Tarifa> consultarTodoTarifa() {
        return tarifaDAO.consultarTodoTarifa();
    }

    /**
     * Elimina una tarifa. Delega la eliminación de la tarifa al tarifaDAO.
     *
     * @param tarifa La tarifa a eliminar.
     * @return Verdadero si la eliminación fue exitosa, falso de lo contrario.
     */
    @Override
    public boolean eliminarTarifa(Tarifa tarifa) {
        return tarifaDAO.eliminarTarifa(tarifa);
    }

// Métodos para Usuario
    /**
     * Crea un nuevo usuario. Delega la creación del usuario al usuarioDAO.
     *
     * @param usuario El usuario a crear.
     * @return El usuario creado o null si no pudo ser creado.
     */
    @Override
    public Usuario crearUsuario(Usuario usuario) {
        return usuarioDAO.crearUsuario(usuario);
    }

    /**
     * Consulta un usuario específico. Delega la consulta del usuario al
     * usuarioDAO.
     *
     * @param usuario El usuario con los criterios de búsqueda.
     * @return El usuario encontrado o null si no se encuentra.
     */
    @Override
    public Usuario consultarUsuario(Usuario usuario) {
        return usuarioDAO.consultarUsuario(usuario);
    }

    /**
     * Actualiza un usuario existente. Delega la actualización del usuario al
     * usuarioDAO.
     *
     * @param usuario El usuario con la información actualizada.
     * @return El usuario actualizado o null si no pudo ser actualizado.
     */
    @Override
    public Usuario actualizarUsuario(Usuario usuario) {
        return usuarioDAO.actualizarUsuario(usuario);
    }

    /**
     * Consulta todos los usuarios. Delega la consulta de todos los usuarios al
     * usuarioDAO.
     *
     * @return Una lista de todos los usuarios disponibles.
     */
    @Override
    public List<Usuario> consultarTodoUsuario() {
        return usuarioDAO.consultarTodoUsuario();
    }

    /**
     * Elimina un usuario. Delega la eliminación del usuario al usuarioDAO.
     *
     * @param usuario El usuario a eliminar.
     * @return El usuario eliminado o null si la eliminación falla.
     */
    @Override
    public Usuario eliminarUsuario(Usuario usuario) {
        return usuarioDAO.eliminarUsuario(usuario);
    }
}
