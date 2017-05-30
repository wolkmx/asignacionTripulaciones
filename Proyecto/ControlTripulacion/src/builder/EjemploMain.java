/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import bridge.Aeropuerto;

/**
 *
 * @author Ejmplo para revisar si
 */
public class EjemploMain {
    public static void main(String []args){
        IConstructor constructor=new AeropuertoConstructorConcreto();
        DirectorAeropuerto director=new DirectorAeropuerto(constructor);
        director.constructAeropuerto(1, "Pekin", "origen");
        Aeropuerto nuevoAeropuerto=director.getAeropuerto();
        System.out.println(nuevoAeropuerto.getId());
        System.out.println(nuevoAeropuerto.getNombre());
        System.out.println(nuevoAeropuerto.getTipoDeAeropuesto());
    }
}
