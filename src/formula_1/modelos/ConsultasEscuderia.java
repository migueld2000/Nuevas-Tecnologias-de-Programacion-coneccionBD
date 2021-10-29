/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula_1.modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author 503
 */
public class ConsultasEscuderia extends Modelo_BD {
    
    private PreparedStatement consultaSQL;
    private ResultSet resultadoSQl;

    public ConsultasEscuderia() {
        
    }
    
    public boolean insertarEcudeia(Escuderia escuderia){
        
        //almacenar la conexion de la BD
        Connection conexion=conectar();
        
        //armamos la consulta SQL
        String query="INSERT INTO escuderias(id, Nombre, Presupuesto, tipo_motor)"
                + " VALUES (?,?,?,?)";
        //intento ejecutar la consulta BD
        try
        {
            //se prepara la consulta en la BD
            consultaSQL=conexion.prepareStatement(query);
            
            //organizar los datos que se van a ingresar en los interrogantes
            consultaSQL.setString(1, escuderia.getId());
            consultaSQL.setString(2, escuderia.getNombre());
            consultaSQL.setInt(3, escuderia.getPresupuesto());
            consultaSQL.setString(4, escuderia.getTipoMotor());
            
            //ejecuto la consulta preparada
            int resultado=consultaSQL.executeUpdate();
            
            //validar el resultado
            
            if(resultado>0)
            {
                return true;
            }
            else
            {
                return false;
            }
            
        }
        
        catch(Exception error)
        {
            System.out.println("uppps.."+error);
            return false;
        }
        
    }
    public Escuderia buscarEscuderia(String id)
    {
        //instanciar un objeto de tipo escuderia
        Escuderia escuderia=new Escuderia();
        
        //almacenar la conexion de la BD
        Connection conexion=conectar();
        
        //armamos la query de SQL
        String query="SELECT * FROM escuderias where id=?";
        
        try
        {
            //se prepara la consulta en la BD
            consultaSQL=conexion.prepareStatement(query);
            
            //organizamos los datos que voy a ingresar en las ?
            consultaSQL.setString(1,id);
            
            //ejecuto la consulta
            resultadoSQl=consultaSQL.executeQuery();
            
            //organizar los datos de llegada
            if(resultadoSQl.next())
            {
                escuderia.setId(resultadoSQl.getString("id"));
                escuderia.setNombre(resultadoSQl.getString("Nombre"));
                escuderia.setPresupuesto(resultadoSQl.getInt("Presupuesto"));
                escuderia.setTipoMotor(resultadoSQl.getString("tipo_motor"));
                return escuderia;
                
            }
            else
            {
                return null;
            }
        }
        catch(Exception error)
        {
            System.out.println("upsss... " +error);
            return null;
        }
        
    }
}
