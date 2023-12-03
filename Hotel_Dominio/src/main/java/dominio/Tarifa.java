
package dominio;

import java.util.Objects;
import org.bson.types.ObjectId;

/**
 * Clase Tarifa que representa la tarifa de una habitación en un sistema de gestión hotelera.
 * Cada tarifa tiene un identificador único y un costo asociado.
 * La clase proporciona métodos para gestionar estos atributos.
 * Incluye también métodos sobreescritos para hashCode, equals y toString.
 * 
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class Tarifa {
    
    // Atributos de la clase
    private ObjectId id;
    private Float costo;

    /**
     * Constructor por defecto para crear una instancia de Tarifa sin parámetros.
     */
    public Tarifa() {
    }

    /**
     * Constructor para crear una instancia de Tarifa con un costo.
     *
     * @param costo El costo de la tarifa.
     */
    public Tarifa(Float costo) {
        this.costo = costo;
    }

    /**
     * Constructor para crear una instancia de Tarifa con un identificador y un costo.
     *
     * @param id    El identificador único de la tarifa.
     * @param costo El costo de la tarifa.
     */
    public Tarifa(ObjectId id, Float costo) {
        this.id = id;
        this.costo = costo;
    }

    /**
     * Obtiene el identificador de la tarifa.
     *
     * @return El identificador de la tarifa.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece el identificador de la tarifa.
     *
     * @param id El identificador a establecer.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Obtiene el costo de la tarifa.
     *
     * @return El costo de la tarifa.
     */
    public Float getCosto() {
        return costo;
    }

    /**
     * Establece el costo de la tarifa.
     *
     * @param costo El costo a establecer para la tarifa.
     */
    public void setCosto(Float costo) {
        this.costo = costo;
    }

    /**
     * Método sobreescrito para calcular el código hash del objeto Tarifa.
     *
     * @return Un entero representando el código hash del objeto.
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.id);
        return hash;
    }

    /**
     * Método sobreescrito para comparar la igualdad de dos objetos Tarifa.
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
        final Tarifa other = (Tarifa) obj;
        return Objects.equals(this.id, other.id);
    }

    /**
     * Método sobreescrito para obtener la representación en cadena de un objeto Tarifa.
     *
     * @return Una cadena que representa al objeto Tarifa.
     */
    @Override
    public String toString() {
        return "Tarifa{" + "id=" + id + ", costo=" + costo + '}';
    }
}
