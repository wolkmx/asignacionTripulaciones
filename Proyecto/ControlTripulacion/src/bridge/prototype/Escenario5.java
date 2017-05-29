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
public class Escenario5 extends Escenario{
    
    public Escenario5(){
    
        super();
        
        Lluvia l = new Lluvia();
        l.setNombre("Sin lluvia");
        l.setPesoRelativo(.05f);
        l.setDificultad(0);
        
        condicionMeteorologica[0] = l;
        
        Viento v = new Viento();
        v.setNombre("Viento Medio");
        v.setPesoRelativo(.15f);
        v.setDificultad(4);
        
        condicionMeteorologica[1] = v;
        
        Turbulencia t = new Turbulencia();
        t.setNombre("Sin turbulencia");
        t.setDificultad(0);
        t.setPesoRelativo(.10f);
        
        condicionMeteorologica[2] = t;
        
        LuzSolar ls = new LuzSolar();
        ls.setNombre("Soleado");
        ls.setDificultad(0);
        ls.setPesoRelativo(.05f);
        
        condicionVisibilidad[0] = ls;
        
        Relampagos r = new Relampagos();
        r.setNombre("Con Relampagos");
        r.setDificultad(6);
        r.setPesoRelativo(.10f);
        
        condicionVisibilidad[1] = r;
        
        Niebla n = new Niebla();
        n.setNombre("Sin niebla");
        n.setDificultad(0);
        n.setPesoRelativo(.05f);
        
        condicionVisibilidad[2] = r;
        
        Montania mo = new Montania();
        mo.setNombre("Sin montaña");
        mo.setDificultad(3);
        mo.setPesoRelativo(.05f);
        
        condicionOrografica[0] = mo;
        
        Ciudad ci = new Ciudad();
        ci.setNombre("Capital");
        ci.setDificultad(9);
        ci.setPesoRelativo(.40f);
        
        condicionOrografica[1] = ci;
        
        
       Canion ca = new Canion();
        ca.setNombre("Sin Cañon");
        ca.setDificultad(1);
        ca.setPesoRelativo(.05f);
        
        condicionOrografica[2] = ca;
        
        this.setNombre("Escenario 5");
    
    }
    
}
