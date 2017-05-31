/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

/**
 *
 * @author Roberto Hernandez De La Luz <www.ohsioh.com>
 */
public class Vuelo implements UsuarioCondiciones{

    private Aeropuerto aeropuertoEntrada;
    private Aeropuerto aeropuertoSalida;
    
    private Condiciones[] condicionMeteorologica = new Condiciones[3];
    private Condiciones[] condicionVisibilidad = new Condiciones[3];
    private Condiciones[] condicionOrografica = new Condiciones[3];
    
    private int numeroVuelo;

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public Aeropuerto getAeropuertoEntrada() {
        return aeropuertoEntrada;
    }

    public void setAeropuertoEntrada(Aeropuerto aeropuertoEntrada) {
        this.aeropuertoEntrada = aeropuertoEntrada;
    }

    public Aeropuerto getAeropuertoSalida() {
        return aeropuertoSalida;
    }

    public void setAeropuertoSalida(Aeropuerto aeropuertoSalida) {
        this.aeropuertoSalida = aeropuertoSalida;
    }
    
    @Override
    public Condiciones[] getMeteorologica(){
        return this.condicionMeteorologica;
    }
    
    @Override
    public Condiciones[] getVisibilidad(){
        return this.condicionVisibilidad;
    }
    
    @Override
    public Condiciones[] getOrografica(){
        return this.condicionOrografica;
    }
    @Override
    public Condiciones getTecnica() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
