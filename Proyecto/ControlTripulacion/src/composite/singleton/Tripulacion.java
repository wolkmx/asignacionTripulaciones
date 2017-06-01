/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite.singleton;

import composite.proxy.Piloto;
import template.Usuario;

/**
 *
 * @author Cristian Enríquez
 */
public abstract class Tripulacion implements Usuario{
    
    private static Tripulacion instancia = null;
    protected Tripulacion(){}
    
    public Tripulacion getInstancia(Piloto piloto, Piloto copiloto){
        instancia = TripulacionReal.getTripulacion(piloto, copiloto); 
        return instancia;
    }
    
}
