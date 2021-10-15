/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula_1.controladores;

import formula_1.modelos.Modelo_BD;
import formula_1.vistas.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author 503
 */
public class Controlador implements ActionListener{
    
     Modelo_BD modelo =new  Modelo_BD();
     Vista vista=new Vista();

    public Controlador(Modelo_BD modelo,Vista vista) {
        this.modelo=modelo;
        this.vista=vista;
        vista.boton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        modelo.conectar();
    }
     
     
     
    
}
