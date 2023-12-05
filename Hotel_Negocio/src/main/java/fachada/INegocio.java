
package fachada;

import dominio.AgenciaViajes;
import dominio.Habitacion;
import dominio.Hotel;
import dominio.Reservacion;
import dominio.Tarifa;
import dominio.Usuario;
import java.util.List;
/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public interface INegocio {
    
    //Agencia Viajes
    public AgenciaViajes crearAgenciaViajes(AgenciaViajes agenciaViajes);
    
    public AgenciaViajes consultarAgenciaViajes(AgenciaViajes agenciaViajes);
    
    public AgenciaViajes actualizarAgenciaViajes(AgenciaViajes agenciaViajes);
    
    public List<AgenciaViajes> consultarTodasAgenciaViajes();
    
    public boolean eliminarAgenciaViajes(AgenciaViajes agenciaViajes);
    
    //Habitacion
    public Habitacion crearHabitacion(Habitacion habitacion);
    
    public Habitacion consultarHabitacion(Habitacion habitacion);
    
    public Habitacion actualizarHabitacion(Habitacion habitacion);
    
    public List<Habitacion> consultarTodoHabitacion();
    
    public boolean eliminarHabitacion(Habitacion habitacion);
    
    //Hotel
    public Hotel crearHotel(Hotel hotel);
    
    public Hotel consultarHotel(Hotel hotel);
    
    public Hotel actualizarHotel(Hotel hotel);
    
    public List<Hotel> consultarTodoHotel();
    
    public boolean eliminarHotel(Hotel hotel);
    
    //Reservacion
    public Reservacion crearReservacion(Reservacion reservacion);
    
    public Reservacion consultarReservacion(Reservacion reservacion);
    
    public Reservacion actualizarReservacion(Reservacion reservacion);
    
    public List<Reservacion> consultarTodoReservacion();
    
    public boolean eliminarReservacion(Reservacion reservacion);
    
    //Tarifa
    public Tarifa crearTarifa(Tarifa tarifa);
    
    public Tarifa consultarTarifa(Tarifa tarifa);
    
    public Tarifa actualizarTarifa(Tarifa tarifa);
    
    public List<Tarifa> consultarTodoTarifa();
    
    public boolean eliminarTarifa(Tarifa tarifa);
    
    //Usuario
    public Usuario crearUsuario(Usuario usuario);
    
    public Usuario consultarUsuario(Usuario usuario);
    
    public Usuario actualizarUsuario(Usuario usuario);
    
    public List<Usuario> consultarTodoUsuario();
    
    public Usuario eliminarUsuario(Usuario usuario);
    
}
