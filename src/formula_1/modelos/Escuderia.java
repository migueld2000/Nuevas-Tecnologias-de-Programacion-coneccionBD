/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula_1.modelos;

/**
 *
 * @author 503
 */
public class Escuderia {
    
    private String id;
    private String nombre;
    private int presupuesto;
    private String TipoMotor;

    public Escuderia() {
    }

    public Escuderia(String id, String nombre, int presupuesto, String TipoMotor) {
        this.id = id;
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.TipoMotor = TipoMotor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getTipoMotor() {
        return TipoMotor;
    }

    public void setTipoMotor(String TipoMotor) {
        this.TipoMotor = TipoMotor;
    }
}
