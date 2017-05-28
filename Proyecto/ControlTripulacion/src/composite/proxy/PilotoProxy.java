/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite.proxy;

import composite.singleton.Tripulacion;

/**
 *
 * @author Cristian Enríquez
 */
public class PilotoProxy implements PilotoSubject, Tripulacion{
    private PilotoSubject piloto;
    private PilotoSubject copiloto;
    
    public PilotoProxy(){
    piloto = new Piloto();
    copiloto = new Copiloto();
    }
}
