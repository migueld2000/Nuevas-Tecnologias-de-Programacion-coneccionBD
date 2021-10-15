/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula_1.modelos;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 503
 */
public class Modelo_BD {
    
    //donde esta la BD
    private String servidorBD="jdbc:mysql://localhost/formula_1";
    private String usuarioBD="root";
    private String passwordB="";

    public Modelo_BD() {
    }
    
    public Connection conectar()
    {
        
        Connection conexion=null;
        try
        {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion=DriverManager.getConnection(servidorBD,usuarioBD,passwordB);
            System.out.println("Exito al conectar a la BD");
            return conexion;
        }
        catch(Exception error)
        {
            System.out.println("upss... " + error);
            return null;
        }
        
    }
}
