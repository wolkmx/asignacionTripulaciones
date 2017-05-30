/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge.prototype;

import bridge.Condiciones;
import bridge.UsuarioCondiciones;

/**
 *
 * @author Roberto Hernandez De La Luz <www.ohsioh.com>
 */
public class Escenario implements UsuarioCondiciones, Cloneable{
   
    Condiciones[] condicionMeteorologica;
    Condiciones[] condicionVisibilidad;
    Condiciones[] condicionOrografica;
    String nombre;
    
    public Escenario(){
        condicionMeteorologica = new Condiciones[3];
        condicionVisibilidad = new Condiciones[3];
        condicionOrografica = new Condiciones[3];
        nombre = "";
        
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public Condiciones[] getMeteorologica(){
        return this.condicionMeteorologica;
    }
    
    public Condiciones[] getVisibilidad(){
        return this.condicionVisibilidad;
    }
    
    public Condiciones[] getOrografica(){
        return this.condicionOrografica;
    }
    
    
    @Override
    public Object clone() throws CloneNotSupportedException {
		Object clone = null;
		try {
			clone = (Escenario) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}

    @Override
    public Condiciones[] getTecnica() {
        throw new UnsupportedOperationException("Este tipo de Usuario de condiciones no usa las condiciones tecnicas"); //To change body of generated methods, choose Tools | Templates.
    }
    
}
