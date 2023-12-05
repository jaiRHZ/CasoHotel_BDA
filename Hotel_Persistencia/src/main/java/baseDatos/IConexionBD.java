package baseDatos;

import com.mongodb.client.MongoDatabase;

/**
 * Interfaz IConexionBD para definir un contrato común de conexión a bases de datos.
 * Esta interfaz garantiza que cualquier clase que la implemente proveerá un método
 * para obtener una conexión a una base de datos.
 * Diseñada principalmente para ser utilizada en sistemas que requieren interacción
 * con bases de datos, facilitando la implementación de diferentes tipos de conexiones
 * de base de datos bajo un estándar unificado
 * 
 * @author HP
 */
public interface IConexionBD {
    
    /**
     * Método para obtener la instancia de una base de datos.
     *
     * @return Una instancia de MongoDatabase, que representa la conexión a la base de datos.
     */
    public MongoDatabase getBaseDatos();
    
}

