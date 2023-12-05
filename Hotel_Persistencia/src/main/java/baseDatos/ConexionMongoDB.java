package baseDatos;

import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

/**
 * Clase ConexionMongoDB para gestionar la conexión a una base de datos MongoDB.
 * Esta clase implementa la interfaz IConexionBD y se utiliza específicamente
 * para conectar con una base de datos MongoDB para un proyecto de hoteles.
 * Utiliza el patrón Singleton para asegurar que solo se crea una instancia de 
 * la base de datos MongoDB durante la ejecución del programa.
 * 
 * @author HP
 */
public class ConexionMongoDB implements IConexionBD {

    /**
     * Nombre constante de la base de datos a la cual esta clase se conectará.
     */
    public final String NOMBRE_BASE_DATOS = "proyecto_hoteles";

    /**
     * Instancia de MongoDatabase utilizada para interactuar con la base de datos.
     * Esta instancia es privada para prevenir su acceso directo desde fuera de la clase.
     */
    private MongoDatabase baseDatos;

    /**
     * Método público para obtener la instancia de la base de datos.
     * Si la base de datos no está inicializada, este método inicializa y configura
     * la conexión a MongoDB utilizando un CodecRegistry para soportar POJOs.
     *
     * @return La instancia de MongoDatabase conectada a la base de datos MongoDB.
     */
    public MongoDatabase getBaseDatos() {
        if (baseDatos == null) {
            CodecRegistry pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
                    fromProviders(PojoCodecProvider.builder().automatic(true).build()));

            MongoClientSettings settings = MongoClientSettings.builder()
                    .codecRegistry(pojoCodecRegistry)
                    .build();

            MongoClient conexion = MongoClients.create(settings);
            baseDatos = conexion.getDatabase(NOMBRE_BASE_DATOS);
        }
        return baseDatos;
    }
}
