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
public class Piloto {
    
    private String id;
    private String nombre;
    private int salario;
    private String fechaInicio;
    private String fechaSalida;
    private String idEscuderia;

    public Piloto() {
    }

    public Piloto(String id, String nombre, int salario, String fechaInicio, String fechaSalida, String idEscuderia) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
        this.fechaInicio = fechaInicio;
        this.fechaSalida = fechaSalida;
        this.idEscuderia = idEscuderia;
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

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getIdEscuderia() {
        return idEscuderia;
    }

    public void setIdEscuderia(String idEscuderia) {
        this.idEscuderia = idEscuderia;
    }
    
    
    
}
