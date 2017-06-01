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
public class ConstructorAeropuerto implements Constructor{
    Aeropuerto aeropuesto;
    public ConstructorAeropuerto(){
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
    public void setCondicionTecnica(Tecnica tecnica){
        this.aeropuesto.setCondicionTecnica(tecnica);
    }
    @Override
    public Aeropuerto getAeropuerto(){
        return this.aeropuesto;
    }
    
    
}
