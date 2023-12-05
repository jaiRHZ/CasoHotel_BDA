package daos;

import baseDatos.IConexionBD;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import dominio.Tarifa;
import interfaces.ITarifaDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 * Clase TarifaDAO que implementa la interfaz ITarifaDAO.
 * Se encarga de las operaciones de base de datos para las tarifas,
 * proporcionando funcionalidades CRUD (Crear, Leer, Actualizar, Eliminar).
 * Utiliza una conexión a MongoDB para almacenar y recuperar datos de tarifas.
 * 
 * @autor HP
 */
public class TarifaDAO implements ITarifaDAO {

    /**
     * Conexión a la base de datos MongoDB.
     */
    private final IConexionBD CONEXION;

    /**
     * Instancia de la base de datos MongoDB.
     */
    private final MongoDatabase BASE_DATOS;

    /**
     * Colección de MongoDB donde se almacenan los datos de las tarifas.
     */
    private final MongoCollection<Tarifa> COLECCION;
    
    /**
     * Constructor de TarifaDAO.
     * Inicializa la conexión con la base de datos MongoDB y configura la colección
     * para almacenar y gestionar los datos de tarifas.
     *
     * @param CONEXION La conexión a la base de datos MongoDB.
     */
    public TarifaDAO(IConexionBD CONEXION) {
        this.CONEXION = CONEXION;
        this.BASE_DATOS = CONEXION.getBaseDatos();
        this.COLECCION = BASE_DATOS.getCollection("tarifas", Tarifa.class);
    }
    
    /**
     * Crea una nueva tarifa en la base de datos.
     * Antes de la inserción, verifica si ya existe una tarifa con el mismo tipo.
     * Muestra un mensaje de error si la tarifa ya existe.
     *
     * @param tarifa La tarifa a crear.
     * @return La tarifa creada o null en caso de error.
     */
    @Override
    public Tarifa crearTarifa(Tarifa tarifa) {
        try {
            // Verificar si ya existe una tarifa con el mismo tipo
            Document queryRfc = new Document("tipo", tarifa.getTipo());
            long countRfc = this.COLECCION.countDocuments(queryRfc);
            if (countRfc > 0) {
                JOptionPane.showMessageDialog(null, "Ya existe una tarifa con "
                        + "el mismo Tipo", "Error", JOptionPane.ERROR_MESSAGE);
                throw new Exception("Ya existe una tarifa con el mismo Tipo");
            }
            // Insertar la reservacion en la colección
            this.COLECCION.insertOne(tarifa);

            return tarifa;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Consulta una tarifa en la base de datos basándose en su tipo.
     * Si no se encuentra la tarifa, muestra un mensaje de error.
     *
     * @param tarifa La tarifa a consultar.
     * @return La tarifa encontrada o null si no se encuentra.
     */
    @Override
    public Tarifa consultarTarifa(Tarifa tarifa) {
        try {
            // Construir el filtro para buscar la reservacion por su numero de orden, fecha que se hizo y fecha en que finaliza
            Document filtro = new Document();
            filtro.append("tipo", tarifa.getTipo());

            // Realizar la búsqueda del usuario en la base de datos
            Tarifa tarifaConsultado = this.COLECCION.find(filtro).first();
            if (tarifaConsultado != null) {

                return tarifaConsultado;
            }
            // Devolver el usuario encontrado (puede ser null si no se encuentra)
            JOptionPane.showMessageDialog(null, "tarifa no encontrada", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Actualiza la información de una tarifa existente en la base de datos.
     * Esta implementación aún no está soportada y lanzará una excepción si se intenta usar.
     * 
     * @param tarifa La tarifa a actualizar.
     * @return La tarifa actualizada.
     */
    @Override
    public Tarifa actualizarTarifa(Tarifa tarifa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Consulta y devuelve todas las tarifas existentes en la base de datos.
     * Retorna una lista de todas las tarifas encontradas.
     * 
     * @return Una lista de todas las tarifas.
     */
    @Override
    public List<Tarifa> consultarTodoTarifa() {
        List<Tarifa> tarifas = new ArrayList<>();

        // Realizar la búsqueda de todas las tarifas en la base de datos
        try (MongoCursor<Tarifa> cursor = this.COLECCION.find().iterator()) {
            while (cursor.hasNext()) {
                
                Tarifa tarifa = cursor.next();

                tarifas.add(tarifa);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return tarifas;
    }

    /**
     * Elimina una tarifa de la base de datos.
     * Esta implementación aún no está soportada y lanzará una excepción si se intenta usar.
     *
     * @param tarifa La tarifa a eliminar.
     * @return Verdadero si la eliminación fue exitosa, falso de lo contrario.
     */
    @Override
    public boolean eliminarTarifa(Tarifa tarifa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
