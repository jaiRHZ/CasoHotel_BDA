
package dominio;

import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 * Clase Hotel que representa un hotel en un sistema de gestión hotelera.
 * Cada hotel tiene un identificador único, nombre, ciudad, dirección (número y calle), código postal, 
 * una categoría (basada en estrellas) y una lista de habitaciones.
 * La clase proporciona métodos para gestionar estos atributos.
 * Incluye también métodos sobreescritos para hashCode, equals y toString.
 * 
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class Hotel {
    
    // Atributos de clase
    private ObjectId id;
    
    private String nombre;
    private String ciudad;
    private String numero;
    private String calle;
    private String codigoPostal;
    private CategoriaHotel categoria;
    
    private List<Habitacion> habitacion;

    /**
     * Constructor por defecto para crear una instancia de Hotel sin parámetros.
     */
    public Hotel() {
    }

    /**
     * Constructor para crear una instancia de Hotel con nombre, ciudad, dirección, código postal y categoría.
     *
     * @param nombre       El nombre del hotel.
     * @param ciudad       La ciudad donde se encuentra el hotel.
     * @param numero       El número de la dirección del hotel.
     * @param calle        La calle de la dirección del hotel.
     * @param codigoPostal El código postal de la dirección del hotel.
     * @param categoria    La categoría del hotel (basada en estrellas).
     */
    public Hotel(String nombre, String ciudad, String numero, String calle, String codigoPostal, CategoriaHotel categoria) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.numero = numero;
        this.calle = calle;
        this.codigoPostal = codigoPostal;
        this.categoria = categoria;
    }

    /**
     * Constructor para crear una instancia de Hotel con identificador, nombre, ciudad, dirección, código postal y categoría.
     *
     * @param id           El identificador único del hotel.
     * @param nombre       El nombre del hotel.
     * @param ciudad       La ciudad donde se encuentra el hotel.
     * @param numero       El número de la dirección del hotel.
     * @param calle        La calle de la dirección del hotel.
     * @param codigoPostal El código postal de la dirección del hotel.
     * @param categoria    La categoría del hotel (basada en estrellas).
     */
    public Hotel(ObjectId id, String nombre, String ciudad, String numero, String calle, String codigoPostal, CategoriaHotel categoria) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.numero = numero;
        this.calle = calle;
        this.codigoPostal = codigoPostal;
        this.categoria = categoria;
    }

    /**
     * Obtiene el identificador del hotel.
     *
     * @return El identificador del hotel.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece el identificador del hotel.
     *
     * @param id El identificador a establecer.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del hotel.
     *
     * @return El nombre del hotel.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del hotel.
     *
     * @param nombre El nombre a establecer para el hotel.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la ciudad donde se encuentra el hotel.
     *
     * @return La ciudad del hotel.
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Establece la ciudad donde se encuentra el hotel.
     *
     * @param ciudad La ciudad a establecer para el hotel.
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Obtiene el número de la dirección del hotel.
     *
     * @return El número de la dirección del hotel.
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Establece el número de la dirección del hotel.
     *
     * @param numero El número de la dirección a establecer para el hotel.
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Obtiene la calle de la dirección del hotel.
     *
     * @return La calle de la dirección del hotel.
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Establece la calle de la dirección del hotel.
     *
     * @param calle La calle de la dirección a establecer para el hotel.
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * Obtiene el código postal de la dirección del hotel.
     *
     * @return El código postal de la dirección del hotel.
     */
    public String getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Establece el código postal de la dirección del hotel.
     *
     * @param codigoPostal El código postal a establecer para la dirección del hotel.
     */
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    /**
     * Obtiene la categoría del hotel.
     *
     * @return La categoría del hotel.
     */
    public CategoriaHotel getCategoria() {
        return categoria;
    }

    /**
     * Establece la categoría del hotel.
     *
     * @param categoria La categoría a establecer para el hotel.
     */
    public void setCategoria(CategoriaHotel categoria) {
        this.categoria = categoria;
    }

    /**
     * Método sobreescrito para calcular el código hash del objeto Hotel.
     *
     * @return Un entero representando el código hash del objeto.
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    /**
     * Obtiene la lista de habitaciones del hotel.
     *
     * @return La lista de habitaciones del hotel.
     */
    public List<Habitacion> getHabitacion() {
        return habitacion;
    }

    /**
     * Establece la lista de habitaciones del hotel.
     *
     * @param habitacion La lista de habitaciones a establecer para el hotel.
     */
    public void setHabitacion(List<Habitacion> habitacion) {
        this.habitacion = habitacion;
    }

    /**
     * Método sobreescrito para comparar la igualdad de dos objetos Hotel.
     *
     * @param obj El objeto con el que se compara.
     * @return Verdadero si ambos objetos son iguales, falso en caso contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hotel other = (Hotel) obj;
        return Objects.equals(this.id, other.id);
    }

    /**
     * Método sobreescrito para obtener la representación en cadena de un objeto Hotel.
     *
     * @return Una cadena que representa al objeto Hotel.
     */
    @Override
    public String toString() {
        return "Hotel{" + "id=" + id + ", nombre=" + nombre + ", ciudad=" + ciudad + ", numero=" + numero + ", calle=" + calle + ", codigoPostal=" + codigoPostal + ", categoria=" + categoria + ", habitacion=" + habitacion + '}';
    }
}
