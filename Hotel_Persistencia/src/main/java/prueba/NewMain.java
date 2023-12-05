/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;

import dominio.Usuario;
import fachada.FachadaDAO;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Usuario usuario = new Usuario("Julio", "Mejía", "Sotomayor", "1234567891", "qwertyuiop");
        
        FachadaDAO fachadaDAO = new FachadaDAO();
        fachadaDAO.crearUsuario(usuario);
        
    }
    
}
