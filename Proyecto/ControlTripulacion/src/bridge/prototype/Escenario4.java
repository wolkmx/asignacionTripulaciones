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
public class Escenario4 extends Escenario{
    
    public Escenario4(){
    
        super();
        
        Lluvia l = new Lluvia();
        l.setNombre("Sin lluvia");
        l.setPesoRelativo(.05f);
        l.setDificultad(0);
        
        condicionMeteorologica[0] = l;
        
        Viento v = new Viento();
        v.setNombre("Viento Medio");
        v.setPesoRelativo(.20f);
        v.setDificultad(4);
        
        condicionMeteorologica[1] = v;
        
        Turbulencia t = new Turbulencia();
        t.setNombre("Sin turbulencia");
        t.setDificultad(0);
        t.setPesoRelativo(.15f);
        
        condicionMeteorologica[2] = t;
        
        LuzSolar ls = new LuzSolar();
        ls.setNombre("Noche");
        ls.setDificultad(5);
        ls.setPesoRelativo(.15f);
        
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
        mo.setNombre("Pequeña montaña");
        mo.setDificultad(3);
        mo.setPesoRelativo(.10f);
        
        condicionOrografica[0] = mo;
        
        Ciudad ci = new Ciudad();
        ci.setNombre("Gran ciudad");
        ci.setDificultad(7);
        ci.setPesoRelativo(.15f);
        
        condicionOrografica[1] = ci;
        
        
       Canion ca = new Canion();
        ca.setNombre("Sin Cañon");
        ca.setDificultad(1);
        ca.setPesoRelativo(.05f);
        
        condicionOrografica[2] = ca;
        
        this.setNombre("Escenario 4");
    
    }
    
}
