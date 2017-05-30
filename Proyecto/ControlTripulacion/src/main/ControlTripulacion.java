/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import static almacen.Almacen.PILOTOS;
import composite.proxy.Piloto;
import interfaces.SeleccionarUsuario;

/**
 *
 * @author Cristian Enríquez
 */
public class ControlTripulacion {

    public static void pilotos() {
        PILOTOS.add(new Piloto("Jon Dao", 001, 10, 360, "Piloto de prueba"));
        PILOTOS.add(new Piloto("Jan Doa", 002, 20, 360, "Piloto de prueba"));
        PILOTOS.add(new Piloto("Jen Deo", 003, 30, 360, "Piloto de prueba"));
        PILOTOS.add(new Piloto("Jin Dio", 004, 40, 260, "Piloto de prueba"));
        PILOTOS.add(new Piloto("Jun Duo", 005, 50, 160, "Piloto de prueba"));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Llenamos pilotos de prueba
        pilotos();
        
        //Inicializa UI
        java.awt.EventQueue.invokeLater(() -> {
            SeleccionarUsuario seleccionarUsuario = new SeleccionarUsuario();
            seleccionarUsuario.setVisible(true);
        });
    }
}
