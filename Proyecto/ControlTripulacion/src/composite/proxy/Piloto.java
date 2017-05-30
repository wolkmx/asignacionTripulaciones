/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite.proxy;

import java.util.Date;

/**
 *
 * @author Cristian Enríquez
 */
public class Piloto implements PilotoSubject{

private String id="";
    private String password="";
    private String nombre;
    private int nEmpleado;
    private Date fechaNacimiento;
    private int numeroVuelos;
    private int horasVuelo;
    private String observaciones;

    public int getNumeroVuelos() {
        return numeroVuelos;
    }

    public void setNumeroVuelos(int numeroVuelos) {
        this.numeroVuelos = numeroVuelos;
    }

    public int getHorasVuelo() {
        return horasVuelo;
    }

    public void setHorasVuelo(int horasVuelo) {
        this.horasVuelo = horasVuelo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    /**
     * @return the nombre
     */
  
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the nEmpleado
     */
   
    public int getnEmpleado() {
        return nEmpleado;
    }

    /**
     * @param nEmpleado the nEmpleado to set
     */

    public void setnEmpleado(int nEmpleado) {
        this.nEmpleado = nEmpleado;
    }

    /**
     * @return the fechaNacimiento
     */
    
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
   
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the id
     */
  
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the password
     */
    
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
  
    public void setPassword(String password) {
        this.password = password;
    }

  
    public PilotoSubject obtener() {
        return this;
    }
    
    @Override
    public String toString(){
        return this.nombre+"";
    }
    
}
