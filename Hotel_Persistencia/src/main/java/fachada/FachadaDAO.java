
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
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class FachadaDAO implements IDatos{

    private AgenciaViajeDAO agenciaViajeDAO;
    private HabitacionDAO habitacionDAO;
    private HotelDAO hotelDAO;
    private ReservacionDAO reservacionDAO;
    private TarifaDAO tarifaDAO;
    private UsuarioDAO usuarioDAO;

    public FachadaDAO() {
        FabricaDAO fabrica = new FabricaDAO();
        
        this.agenciaViajeDAO = fabrica.crearAgenciaViajeDAO();
        this.habitacionDAO = fabrica.crearHabitacionDAO();
        this.hotelDAO = fabrica.crearHotelDAO();
        this.reservacionDAO = fabrica.crearReservacionDAO();
        this.tarifaDAO = fabrica.crearTarifaDAO();
        this.usuarioDAO = fabrica.crearUsuarioDAO();
    }
    
    
    //AgenciaViajes
    @Override
    public AgenciaViajes crearAgenciaViajes(AgenciaViajes agenciaViajes) {
        return agenciaViajeDAO.crearAgenciaViajes(agenciaViajes);
    }

    @Override
    public AgenciaViajes consultarAgenciaViajes(AgenciaViajes agenciaViajes) {
        return agenciaViajeDAO.consultarAgenciaViajes(agenciaViajes);
    }

    @Override
    public AgenciaViajes actualizarAgenciaViajes(AgenciaViajes agenciaViajes) {
        return agenciaViajeDAO.actualizarAgenciaViajes(agenciaViajes);
    }

    @Override
    public List<AgenciaViajes> consultarTodasAgenciaViajes() {
        return agenciaViajeDAO.consultarTodasAgenciaViajes();
    }

    @Override
    public boolean eliminarAgenciaViajes(AgenciaViajes agenciaViajes) {
        return agenciaViajeDAO.eliminarAgenciaViajes(agenciaViajes);
    }

    //Habitacion
    @Override
    public Habitacion crearHabitacion(Habitacion habitacion) {
        return habitacionDAO.crearHabitacion(habitacion);
    }

    @Override
    public Habitacion consultarHabitacion(Habitacion habitacion) {
        return habitacionDAO.consultarHabitacion(habitacion);
    }

    @Override
    public Habitacion actualizarHabitacion(Habitacion habitacion) {
        return habitacionDAO.actualizarHabitacion(habitacion);
    }

    @Override
    public List<Habitacion> consultarTodoHabitacion() {
        return habitacionDAO.consultarTodoHabitacion();
    }

    @Override
    public boolean eliminarHabitacion(Habitacion habitacion) {
        return habitacionDAO.eliminarHabitacion(habitacion);
    }

    //Hotel
    @Override
    public Hotel crearHotel(Hotel hotel) {
        return hotelDAO.crearHotel(hotel);
    }

    @Override
    public Hotel consultarHotel(Hotel hotel) {
        return hotelDAO.consultarHotel(hotel);
    }

    @Override
    public Hotel actualizarHotel(Hotel hotel) {
        return hotelDAO.actualizarHotel(hotel);
    }

    @Override
    public List<Hotel> consultarTodoHotel() {
        return hotelDAO.consultarTodoHotel();
    }

    @Override
    public boolean eliminarHotel(Hotel hotel) {
        return hotelDAO.eliminarHotel(hotel);
    }

    //Reservacion
    @Override
    public Reservacion crearReservacion(Reservacion reservacion) {
        return reservacionDAO.crearReservacion(reservacion);
    }

    @Override
    public Reservacion consultarReservacion(Reservacion reservacion) {
        return reservacionDAO.consultarReservacion(reservacion);
    }

    @Override
    public Reservacion actualizarReservacion(Reservacion reservacion) {
        return reservacionDAO.actualizarReservacion(reservacion);
    }

    @Override
    public List<Reservacion> consultarTodoReservacion() {
        return reservacionDAO.consultarTodoReservacion();
    }

    @Override
    public boolean eliminarReservacion(Reservacion reservacion) {
        return reservacionDAO.eliminarReservacion(reservacion);
    }

    //Tarifa
    @Override
    public Tarifa crearTarifa(Tarifa tarifa) {
        return tarifaDAO.crearTarifa(tarifa);
    }

    @Override
    public Tarifa consultarTarifa(Tarifa tarifa) {
        return tarifaDAO.consultarTarifa(tarifa);
    }

    @Override
    public Tarifa actualizarTarifa(Tarifa tarifa) {
        return tarifaDAO.actualizarTarifa(tarifa);
    }

    @Override
    public List<Tarifa> consultarTodoTarifa() {
        return tarifaDAO.consultarTodoTarifa();
    }

    @Override
    public boolean eliminarTarifa(Tarifa tarifa) {
        return tarifaDAO.eliminarTarifa(tarifa);
    }

    //Usuario
    @Override
    public Usuario crearUsuario(Usuario usuario) {
        return usuarioDAO.crearUsuario(usuario);
    }

    @Override
    public Usuario consultarUsuario(Usuario usuario) {
        return usuarioDAO.consultarUsuario(usuario);
    }

    @Override
    public Usuario actualizarUsuario(Usuario usuario) {
        return usuarioDAO.actualizarUsuario(usuario);
    }

    @Override
    public List<Usuario> consultarTodoUsuario() {
        return usuarioDAO.consultarTodoUsuario();
    }

    @Override
    public Usuario eliminarUsuario(Usuario usuario) {
        return usuarioDAO.eliminarUsuario(usuario);
    }
    
}
