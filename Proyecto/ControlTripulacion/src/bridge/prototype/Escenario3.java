/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge.prototype;

import bridge.Canion;
import bridge.Ciudad;
import bridge.Lluvia;
import bridge.LuzSolar;
import bridge.Montania;
import bridge.Niebla;
import bridge.Relampagos;
import bridge.Turbulencia;
import bridge.Viento;

/**
 *
 * @author Roberto Hernandez De La Luz <www.ohsioh.com>
 */
public class Escenario3 extends Escenario{
    
    public Escenario3(){
    
        super();
        
        Lluvia l = new Lluvia();
        l.setNombre("Fuerte");
        l.setPesoRelativo(.15f);
        l.setDificultad(5);
        
        condicionMeteorologica[0] = l;
        
        Viento v = new Viento();
        v.setNombre("Mucho Viento");
        v.setPesoRelativo(.20f);
        v.setDificultad(5);
        
        condicionMeteorologica[1] = v;
        
        Turbulencia t = new Turbulencia();
        t.setNombre("Turbulencia severa");
        t.setDificultad(8);
        t.setPesoRelativo(.25f);
        
        condicionMeteorologica[2] = t;
        
        LuzSolar ls = new LuzSolar();
        ls.setNombre("Soleado");
        ls.setDificultad(0);
        ls.setPesoRelativo(.05f);
        
        condicionVisibilidad[0] = ls;
        
        Relampagos r = new Relampagos();
        r.setNombre("Sin Relampago");
        r.setDificultad(0);
        r.setPesoRelativo(.05f);
        
        condicionVisibilidad[1] = r;
        
        Niebla n = new Niebla();
        n.setNombre("Sin niebla");
        n.setDificultad(0);
        n.setPesoRelativo(.05f);
        
        condicionVisibilidad[2] = r;
        
        Montania mo = new Montania();
        mo.setNombre("Gran montaña");
        mo.setDificultad(6);
        mo.setPesoRelativo(.15f);
        
        condicionOrografica[0] = mo;
        
        Ciudad ci = new Ciudad();
        ci.setNombre("Sin ciudad");
        ci.setDificultad(0);
        ci.setPesoRelativo(.05f);
        
        condicionOrografica[1] = ci;
        
        
       Canion ca = new Canion();
        ca.setNombre("Sin Cañon");
        ca.setDificultad(1);
        ca.setPesoRelativo(.05f);
        
        condicionOrografica[2] = ca;
        
        this.setNombre("Escenario 3");
    
    }
    
}
