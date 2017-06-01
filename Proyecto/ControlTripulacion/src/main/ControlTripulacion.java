/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import almacen.Almacen;
import static almacen.Almacen.PILOTOS;
import static almacen.Almacen.VUELOS;
import static almacen.Almacen.registroVuelos;
import bridge.Aeropuerto;
import bridge.Canion;
import bridge.Ciudad;
import bridge.Lluvia;
import bridge.LuzSolar;
import bridge.Montania;
import bridge.Niebla;
import bridge.Relampagos;
import bridge.Turbulencia;
import bridge.Viento;
import bridge.Vuelo;
import composite.proxy.Piloto;
import composite.singleton.Tripulacion;
import composite.singleton.TripulacionReal;
import interfaces.SeleccionarUsuario;
import registro.RegistroVuelos;

/**
 *
 * @author Cristian Enríquez
 */
public class ControlTripulacion {

    //Para crear pilotos desde el arranque
    public static void pilotos() {
        PILOTOS.add(new Piloto("Jon Dao", 001, 10, 360, "Piloto de prueba"));
        PILOTOS.add(new Piloto("Jan Doa", 002, 20, 360, "Piloto de prueba"));
        PILOTOS.add(new Piloto("Jen Deo", 003, 30, 360, "Piloto de prueba"));
        PILOTOS.add(new Piloto("Jin Dio", 004, 40, 260, "Piloto de prueba"));
        PILOTOS.add(new Piloto("Jun Duo", 005, 50, 160, "Piloto de prueba"));
    }

    /*
    *--> Creamos un vuelo
    *--> Asignamos una tripulacion a ese vuelo
    **/
    public static void asignaTripulacionAVuelo() {

        //Creamos los aeropuertos
        Aeropuerto a1 = new Aeropuerto();
        Aeropuerto a2 = new Aeropuerto();
        a1.setNombre("Aeropuerto Salida");
        a2.setNombre("Aeropuerto destino");

        //Creamos el vuelo
        Vuelo v1 = new Vuelo();
        v1.setAeropuertoEntrada(a2);
        v1.setAeropuertoSalida(a1);
        v1.setNumeroVuelo(23);
        
        
        /**/
       Lluvia l = new Lluvia();
        l.setNombre("Ligera");
        l.setPesoRelativo(.15f);
        l.setDificultad(3);
        
        v1.addMeteorologica(l,0);
        
        Viento v = new Viento();
        v.setNombre("Poco Viento");
        v.setPesoRelativo(.10f);
        v.setDificultad(1);
        
        v1.addMeteorologica(v,1);
        
        Turbulencia t = new Turbulencia();
        t.setNombre("Sin turbulencia");
        t.setDificultad(0);
        t.setPesoRelativo(.20f);
        
        v1.addMeteorologica(t,2);
        
        LuzSolar ls = new LuzSolar();
        ls.setNombre("Soleado");
        ls.setDificultad(0);
        ls.setPesoRelativo(.10f);
        
        v1.addVisibilidad(ls,0);
        
        Relampagos r = new Relampagos();
        r.setNombre("Sin Relampago");
        r.setDificultad(0);
        r.setPesoRelativo(.10f);
        
        v1.addVisibilidad(r,1);
        
        Niebla n = new Niebla();
        n.setNombre("Sin niebla");
        n.setDificultad(0);
        n.setPesoRelativo(.05f);
        
        v1.addVisibilidad(n,2);
        
        Montania mo = new Montania();
        mo.setNombre("Sin Montaña");
        mo.setDificultad(0);
        mo.setPesoRelativo(.10f);
        
        v1.addOrografica(mo,0);
        
        Ciudad ci = new Ciudad();
        ci.setNombre("Ciudad Pequeña");
        ci.setDificultad(2);
        ci.setPesoRelativo(.05f);
        
        v1.addOrografica(ci,1);
        
        
       Canion ca = new Canion();
        ca.setNombre("Sin Cañon");
        ca.setDificultad(1);
        ca.setPesoRelativo(.15f);
        
        v1.addOrografica(ca,2);
        
        /**/
        
        VUELOS.add(v1);

        //Asignamos tripulacion
        TripulacionReal tripulacion = new TripulacionReal();
        tripulacion.setTripulante(0, new Piloto("Piloto piloto", 10, 10, 360, "Piloto de prueba"));
        tripulacion.setTripulante(1, new Piloto("Piloto copiloto", 20, 20, 360, "Copiloto de prueba"));
        
        //Registramos el vuelo
        RegistroVuelos rv = new RegistroVuelos();
        rv.setVuelo(v1);
        rv.setTripulacion(tripulacion);
        
        registroVuelos.put(v1.getNumeroVuelo(), rv);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Llenamos pilotos de prueba
        pilotos();
        //Vuelo de prueba
        asignaTripulacionAVuelo();
        
        //Testeando
        //Almacen.getVuelosPiloto("20");
        
        //Inicializa UI
        java.awt.EventQueue.invokeLater(() -> {
            SeleccionarUsuario seleccionarUsuario = new SeleccionarUsuario();
            seleccionarUsuario.setVisible(true);
        });
    }
}
