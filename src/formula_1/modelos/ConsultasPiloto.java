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
public class ConsultasPiloto extends Modelo_BD {
    
    private PreparedStatement consultaSQL;
    private ResultSet resultadoSQl;

    public ConsultasPiloto() {
    }
    
     public boolean insertarPiloto(Piloto piloto)
     {
     
        //almacenar la conexion de la BD
        Connection conexion=conectar();
        
        //armamos la consulta SQL
        String querry="INSERT INTO pilotos(id, Nombre, Salario, Fecha_inicio, Fehca_salida, id_Escuderia) "
                + " VALUES (?,?,?,?,?)";
        
        //intento ejecutar la consulta BD
         try
        {
            //se prepara la consulta en la BD
            consultaSQL=conexion.prepareStatement(querry);
            
            //organizar los datos que se van a ingresar en los interrogantes
            consultaSQL.setString(1,piloto.getId());
            consultaSQL.setString(2,piloto.getNombre());
            consultaSQL.setInt(3,piloto.getSalario());
            consultaSQL.setString(4,piloto.getFechaInicio());
            consultaSQL.setString(5,piloto.getFechaSalida());
            consultaSQL.setString(6,piloto.getIdEscuderia());
            
            int resultado=consultaSQL.executeUpdate();
            
            if (resultado>0)
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
    public Piloto buscarPiloto(int id){
        
    }
    
}
