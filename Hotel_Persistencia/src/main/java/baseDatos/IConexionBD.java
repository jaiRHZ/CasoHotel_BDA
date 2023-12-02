package baseDatos;

import com.mongodb.client.MongoDatabase;

/**
 *
 * @author HP
 */
public interface IConexionBD {
    
    public MongoDatabase getBaseDatos();
    
}
