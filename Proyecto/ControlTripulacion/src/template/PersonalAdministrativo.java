/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template;

import java.util.Date;

/**
 *
 * @author Ignacio Luna Rodríguez
 */
public class PersonalAdministrativo implements Usuario{
    private String id;
    private String password;
    private String nombre;
    private int nEmpleado;
    private Date fechaNacimiento;
    public PersonalAdministrativo(){
    }
    
    /**
     * @return the nombre
     */
    @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the nEmpleado
     */
    @Override
    public int getnEmpleado() {
        return nEmpleado;
    }

    /**
     * @param nEmpleado the nEmpleado to set
     */
    @Override
    public void setnEmpleado(int nEmpleado) {
        this.nEmpleado = nEmpleado;
    }

    /**
     * @return the fechaNacimiento
     */
    @Override
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    @Override
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the id
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the password
     */
    @Override
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    @Override
    public void setPassword(String password) {
        this.password = password;
    }
    
}
