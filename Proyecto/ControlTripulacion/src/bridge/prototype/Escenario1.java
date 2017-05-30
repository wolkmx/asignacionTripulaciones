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
public class Escenario1 extends Escenario{
    
    public Escenario1(){
    
        super();
        
        Lluvia l = new Lluvia();
        l.setNombre("Ligera");
        l.setPesoRelativo(.15f);
        l.setDificultad(3);
        
        condicionMeteorologica[0] = l;
        
        Viento v = new Viento();
        v.setNombre("Poco Viento");
        v.setPesoRelativo(.10f);
        v.setDificultad(1);
        
        condicionMeteorologica[1] = v;
        
        Turbulencia t = new Turbulencia();
        t.setNombre("Sin turbulencia");
        t.setDificultad(0);
        t.setPesoRelativo(.20f);
        
        condicionMeteorologica[2] = t;
        
        LuzSolar ls = new LuzSolar();
        ls.setNombre("Soleado");
        ls.setDificultad(0);
        ls.setPesoRelativo(.10f);
        
        condicionVisibilidad[0] = ls;
        
        Relampagos r = new Relampagos();
        r.setNombre("Sin Relampago");
        r.setDificultad(0);
        r.setPesoRelativo(.10f);
        
        condicionVisibilidad[1] = r;
        
        Niebla n = new Niebla();
        n.setNombre("Sin niebla");
        n.setDificultad(0);
        n.setPesoRelativo(.05f);
        
        condicionVisibilidad[2] = r;
        
        Montania mo = new Montania();
        mo.setNombre("Sin Montaña");
        mo.setDificultad(0);
        mo.setPesoRelativo(.10f);
        
        condicionOrografica[0] = mo;
        
        Ciudad ci = new Ciudad();
        ci.setNombre("Ciudad Pequeña");
        ci.setDificultad(2);
        ci.setPesoRelativo(.05f);
        
        condicionOrografica[1] = ci;
        
        
       Canion ca = new Canion();
        ca.setNombre("Sin Cañon");
        ca.setDificultad(1);
        ca.setPesoRelativo(.15f);
        
        condicionOrografica[2] = ca;
        
        this.setNombre("Escenario 1");
    
    }
    
}
