/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro;

import bridge.Vuelo;
import composite.singleton.Tripulacion;

/**
 *
 * @author Roberto Hernandez De La Luz <www.ohsioh.com>
 */
public class RegistroVuelos {
    private Tripulacion tripulacion;
    private Vuelo vuelo;

    public Tripulacion getTripulacion() {
        return tripulacion;
    }

    public void setTripulacion(Tripulacion tripulacion) {
        this.tripulacion = tripulacion;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
    
}
