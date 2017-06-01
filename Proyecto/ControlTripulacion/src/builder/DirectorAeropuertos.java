/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import bridge.Aeropuerto;
import bridge.Tecnica;

/**
 *
 * @author martina24
 */
public class DirectorAeropuertos {
    private Constructor constructor;
    public DirectorAeropuertos(Constructor constructor){
        this.constructor=constructor;
    }
    public Aeropuerto getAeropuerto(){
        return this.constructor.getAeropuerto();
    }
    public void constructAeropuerto(int id,String nombre,String tipoAeropuerto,Tecnica tecnica){
        this.constructor.id(id);
        this.constructor.nombreAerolinea(nombre);
        this.constructor.tipoDeAeropuerto(tipoAeropuerto);
        this.constructor.setCondicionTecnica(tecnica);
    }
    
}
