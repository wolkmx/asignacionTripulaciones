/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Roberto Hernandez De La Luz <www.ohsioh.com>
 */
public class Tecnica implements CondicionesPermanentes{
    
    private int numeroPistas;
    private int capacidaPasajeros;
    
    public void setNumeroPistas(int numeroPistas){
        this.numeroPistas = numeroPistas;
    }
    
    public int getNumeroPistas(){
        return this.numeroPistas;
    }
    
    public void setCapacidaPasajeros(int capacidaPasajeros){
        this.capacidaPasajeros = capacidaPasajeros;
    }
    
    public int getCapacidaPasajeros(){
        return this.capacidaPasajeros;
    }
    
    @Override
    public List<String> getInfo() {
       List<String> respuesta = new ArrayList();
       respuesta.add("Numero de pistas: "+this.getNumeroPistas());
       respuesta.add("Capacidad de Pasajeros: "+this.getCapacidaPasajeros());
       
       return respuesta;
    }
}
