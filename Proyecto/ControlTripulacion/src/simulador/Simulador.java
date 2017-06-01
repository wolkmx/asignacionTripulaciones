/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador;

import bridge.prototype.Escenario;
import composite.proxy.Piloto;
import almacen.Almacen;
import bridge.Condiciones;
import bridge.Meteorologica;
import bridge.Orografica;
import bridge.Visibilidad;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import registro.RegistroPruebasSimulacion;

/**
 *
 * @author Roberto Hernandez De La Luz <www.ohsioh.com>
 */
public class Simulador {
    
    public void generarPrueba(int escenario, Piloto piloto){
        
        RegistroPruebasSimulacion registro = getRegistro(escenario, piloto);

        Almacen.registroPruebasSimulacion.add(registro);
        
    }
    
    public static RegistroPruebasSimulacion getRegistro(int escenario, Piloto piloto){
    
        RegistroPruebasSimulacion registro = new RegistroPruebasSimulacion();
        
        Escenario e = null;
        
        switch(escenario){
            case 1:
                {
                    try {
                        e = (Escenario)Almacen.escenario1.clone();
                    } catch (CloneNotSupportedException ex) {
                        Logger.getLogger(Simulador.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
            case 2:
                {
                    try {
                        e = (Escenario)Almacen.escenario2.clone();
                    } catch (CloneNotSupportedException ex) {
                        Logger.getLogger(Simulador.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
            case 3:
                {
                    try {
                        e = (Escenario)Almacen.escenario3.clone();
                    } catch (CloneNotSupportedException ex) {
                        Logger.getLogger(Simulador.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
            case 4:
                {
                    try {
                        e = (Escenario)Almacen.escenario4.clone();
                    } catch (CloneNotSupportedException ex) {
                        Logger.getLogger(Simulador.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
            case 5:
                {
                    try {
                        e = (Escenario)Almacen.escenario5.clone();
                    } catch (CloneNotSupportedException ex) {
                        Logger.getLogger(Simulador.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
            case 6:
                {
                    try {
                        e = (Escenario)Almacen.escenario6.clone();
                    } catch (CloneNotSupportedException ex) {
                        Logger.getLogger(Simulador.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
        }
        
        
        registro.setEscenario(e);
        registro.setPiloto(piloto);
        registro.setFecha(new Date());
        
        //@todo revisar si se quiere hacer un metodo mas especifico que tome en cuenta la dificultad y peso relativo de cada condicion
        Random r = new Random();
        int inferior = 0;
        int superior = 11;
        int numero = r.nextInt(superior-inferior) + inferior;
        
        //registro.setCalificacionMeteorologica(numero);
        
        registro.setCalificacionMeteorologica(Math.round(calcularCalificacion(e, 1)));
        registro.setCalificacionOrografica(Math.round(calcularCalificacion(e, 2)));
        registro.setCalificacionVisibilidad(Math.round(calcularCalificacion(e, 3)));
        /*
        numero = r.nextInt(superior-inferior) + inferior;
        registro.setCalificacionOrografica(numero);
        numero = r.nextInt(superior-inferior) + inferior;
        registro.setCalificacionVisibilidad(numero);*/
        
        return registro;
        
    }
    
    public static float calcularCalificacion(Escenario e, int tipo){
        float calificacion = 0;
        Condiciones c[] = null;
        
         Random r = new Random();
        int inferior = 1;
        int superior = 10;
        int numero = r.nextInt(superior-inferior) + inferior;
        
        switch(tipo){
            
            case 1:
                     c = e.getMeteorologica();
                for(Condiciones cc: c){
                    numero = r.nextInt(superior-inferior) + inferior;
                    calificacion = calificacion + ( (numero * ((Meteorologica)cc).getPesoRelativo())/10 );

                }
                
                break;
            case 2:
                     c = e.getOrografica();
                for(Condiciones cc: c){
                    numero = r.nextInt(superior-inferior) + inferior;
                    calificacion = calificacion + ((numero * ((Orografica)cc).getPesoRelativo())/10 );

                }
                break;
            case 3:
                     c = e.getVisibilidad();
                for(Condiciones cc: c){
                    numero = r.nextInt(superior-inferior) + inferior;
                    calificacion = calificacion + ((numero * ((Visibilidad)cc).getPesoRelativo())/10 );

                }
                break;
            
        }
        
        return calificacion * 100;
    }
    
}
