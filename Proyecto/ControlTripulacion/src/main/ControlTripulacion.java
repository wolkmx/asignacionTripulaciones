/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import interfaces.SeleccionarUsuario;

/**
 *
 * @author Cristian Enríquez
 */
public class ControlTripulacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(() -> {
            SeleccionarUsuario seleccionarUsuario = new SeleccionarUsuario();
            seleccionarUsuario.setVisible(true);
        });
    }
}
