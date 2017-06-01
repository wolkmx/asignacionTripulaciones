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
        Almacen.getVuelosPiloto("20");
        
        //Inicializa UI
        java.awt.EventQueue.invokeLater(() -> {
            SeleccionarUsuario seleccionarUsuario = new SeleccionarUsuario();
            seleccionarUsuario.setVisible(true);
        });
    }
}
