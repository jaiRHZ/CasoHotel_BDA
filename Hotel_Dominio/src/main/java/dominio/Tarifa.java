
package dominio;

import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class Tarifa {
    
    //Atributos de la clase
    private ObjectId id;
    private Float costo;

    public Tarifa() {
    }

    public Tarifa(Float costo) {
        this.costo = costo;
    }

    public Tarifa(ObjectId id, Float costo) {
        this.id = id;
        this.costo = costo;
    }

    
    
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.id);
        return hash;
    }

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

    @Override
    public String toString() {
        return "Tarifa{" + "id=" + id + ", costo=" + costo + '}';
    }
    
}
