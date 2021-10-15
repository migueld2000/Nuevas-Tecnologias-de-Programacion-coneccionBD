/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula_1;

import formula_1.controladores.Controlador;
import formula_1.modelos.Modelo_BD;
import formula_1.vistas.Vista;

/**
 *
 * @author 503
 */
public class Formula_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modelo_BD modelo =new  Modelo_BD();
        Vista vista=new Vista();
        
        vista.setVisible(true);
        
        Controlador controlador=new Controlador(modelo,vista);
        
        
    }
    
}
