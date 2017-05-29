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
public class AeropuertoConstructorConcreto implements IConstructor{
    Aeropuerto aeropuesto;
    public AeropuertoConstructorConcreto(){
        this.aeropuesto=new Aeropuerto();
    }
    @Override
    public void tipoDeAeropuerto(String aeropuerto){
        this.aeropuesto.setTipoDeAeropuesto(aeropuerto);
    }
    @Override
    public void nombreAerolinea(String nombre){
        this.aeropuesto.setNombre(nombre);        
    }
    @Override
    public void id(int id){
        this.aeropuesto.setId(id);
    }    
    @Override
    public Aeropuerto getAeropuerto(){
        return this.aeropuesto;
    }
    
}
