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
public class Escenario6 extends Escenario{
    
    public Escenario6(){
    
        super();
        
        Lluvia l = new Lluvia();
        l.setNombre("Con tormenta");
        l.setPesoRelativo(.20f);
        l.setDificultad(3);
        
        condicionMeteorologica[0] = l;
        
        Viento v = new Viento();
        v.setNombre("Huracan");
        v.setPesoRelativo(.20f);
        v.setDificultad(8);
        
        condicionMeteorologica[1] = v;
        
        Turbulencia t = new Turbulencia();
        t.setNombre("Con turbulencia");
        t.setDificultad(7);
        t.setPesoRelativo(.20f);
        
        condicionMeteorologica[2] = t;
        
        LuzSolar ls = new LuzSolar();
        ls.setNombre("nublado");
        ls.setDificultad(5);
        ls.setPesoRelativo(.05f);
        
        condicionVisibilidad[0] = ls;
        
        Relampagos r = new Relampagos();
        r.setNombre("Sin Relampagos");
        r.setDificultad(5);
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
        ci.setNombre("Ciudad Mediana");
        ci.setDificultad(6);
        ci.setPesoRelativo(.10f);
        
        condicionOrografica[1] = ci;
        
        
       Canion ca = new Canion();
        ca.setNombre("Sin Cañon");
        ca.setDificultad(1);
        ca.setPesoRelativo(.05f);
        
        condicionOrografica[2] = ca;
        
        this.setNombre("Escenario 6");
    
    }
    
}
