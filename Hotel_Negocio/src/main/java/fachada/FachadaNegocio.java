
package fachada;

import dominio.AgenciaViajes;
import dominio.Habitacion;
import dominio.Hotel;
import dominio.Reservacion;
import dominio.Tarifa;
import dominio.Usuario;
import factory.FabricaNegocio;
import java.util.List;
import negocio.AgenciaViajeNegocio;
import negocio.HabitacionNegocio;
import negocio.HotelNegocio;
import negocio.ReservacionNegocio;
import negocio.TarifaNegocio;
import negocio.UsuarioNegocio;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class FachadaNegocio implements INegocio{

    AgenciaViajeNegocio agenciaViajeNegocio;
    HabitacionNegocio habitacionNegocio;
    HotelNegocio hotelNegocio;
    ReservacionNegocio reservacionNegocio;
    TarifaNegocio tarifaNegocio;
    UsuarioNegocio usuarioNegocio;

    public FachadaNegocio() {
        FabricaNegocio fabrica = new FabricaNegocio();
        
        this.agenciaViajeNegocio = fabrica.crearAgenciaViajeNegocio();
        this.habitacionNegocio = fabrica.crearHabitacionNegocio();
        this.hotelNegocio = fabrica.crearHotelNegocio();
        this.reservacionNegocio = fabrica.crearReservacionNegocio();
        this.tarifaNegocio = fabrica.crearTarifaNegocio();
        this.usuarioNegocio = fabrica.crearUsuarioNegocio();
    }
    
    
    @Override
    public AgenciaViajes crearAgenciaViajes(AgenciaViajes agenciaViajes) {
        return agenciaViajeNegocio.crearAgenciaViajes(agenciaViajes);
    }

    @Override
    public AgenciaViajes consultarAgenciaViajes(AgenciaViajes agenciaViajes) {
        return agenciaViajeNegocio.consultarAgenciaViajes(agenciaViajes);
    }

    @Override
    public AgenciaViajes actualizarAgenciaViajes(AgenciaViajes agenciaViajes) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<AgenciaViajes> consultarTodasAgenciaViajes() {
        return agenciaViajeNegocio.consultarTodasAgenciaViajes();
    }

    @Override
    public boolean eliminarAgenciaViajes(AgenciaViajes agenciaViajes) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    //Habitacion
    @Override
    public Habitacion crearHabitacion(Habitacion habitacion) {
        return habitacionNegocio.crearHabitacion(habitacion);
    }

    @Override
    public Habitacion consultarHabitacion(Habitacion habitacion) {
        return habitacionNegocio.consultarHabitacion(habitacion);
    }

    @Override
    public Habitacion actualizarHabitacion(Habitacion habitacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Habitacion> consultarTodoHabitacion() {
        return habitacionNegocio.consultarTodoHabitacion();
    }

    @Override
    public boolean eliminarHabitacion(Habitacion habitacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    //Hotel
    @Override
    public Hotel crearHotel(Hotel hotel) {
        return hotelNegocio.crearHotel(hotel);
    }

    @Override
    public Hotel consultarHotel(Hotel hotel) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Hotel actualizarHotel(Hotel hotel) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Hotel> consultarTodoHotel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminarHotel(Hotel hotel) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    //Reservacion
    @Override
    public Reservacion crearReservacion(Reservacion reservacion) {
        return reservacionNegocio.crearReservacion(reservacion);
    }

    @Override
    public Reservacion consultarReservacion(Reservacion reservacion) {
        return reservacionNegocio.consultarReservacion(reservacion);
    }

    @Override
    public Reservacion actualizarReservacion(Reservacion reservacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Reservacion> consultarTodoReservacion() {
        return (List<Reservacion>) reservacionNegocio.consultarTodoReservacion();
    }

    @Override
    public boolean eliminarReservacion(Reservacion reservacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    //Tarifa
    @Override
    public Tarifa crearTarifa(Tarifa tarifa) {
        return tarifaNegocio.crearTarifa(tarifa);
    }

    @Override
    public Tarifa consultarTarifa(Tarifa tarifa) {
        return tarifaNegocio.consultarTarifa(tarifa);
    }

    @Override
    public Tarifa actualizarTarifa(Tarifa tarifa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Tarifa> consultarTodoTarifa() {
        return (List<Tarifa>) tarifaNegocio.consultarTodoTarifa();
    }

    @Override
    public boolean eliminarTarifa(Tarifa tarifa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    //Usuario
    @Override
    public Usuario crearUsuario(Usuario usuario) {
        return usuarioNegocio.crearUsuario(usuario);
    }

    @Override
    public Usuario consultarUsuario(Usuario usuario) {
        return usuarioNegocio.consultarUsuario(usuario);
    }

    @Override
    public Usuario actualizarUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Usuario> consultarTodoUsuario() {
        return usuarioNegocio.consultarTodoUsuario();
    }

    @Override
    public Usuario eliminarUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
