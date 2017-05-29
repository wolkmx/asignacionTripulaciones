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
public interface Usuario {
    public String getNombre();
    public void setNombre(String nombre);
    public int getnEmpleado();
    public void setnEmpleado(int nEmpleado) ;
    public Date getFechaNacimiento();
    public void setFechaNacimiento(Date fechaNacimiento);
    public String getId();
    public void setId(String id);
    public String getPassword();
    public void setPassword(String password);
}
