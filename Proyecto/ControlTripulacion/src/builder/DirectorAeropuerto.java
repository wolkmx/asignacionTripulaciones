/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import Bridge.Aeropuerto;

/**
 *
 * @author martina24
 */
public class DirectorAeropuerto {
    private IConstructor constructor;
    public DirectorAeropuerto(IConstructor constructor){
        this.constructor=constructor;
    }
    public Aeropuerto getAeropuerto(){
        return this.constructor.getAeropuerto();
    }
    public void constructAeropuerto(int id,String nombre,String tipoAeropuerto){
        this.constructor.id(id);
        this.constructor.nombreAerolinea(nombre);
        this.constructor.tipoDeAeropuerto(tipoAeropuerto);
    }
    
}
