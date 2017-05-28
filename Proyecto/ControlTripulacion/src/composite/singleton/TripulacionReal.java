/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite.singleton;

/**
 *
 * @author Cristian Enríquez
 */
public class TripulacionReal implements Tripulacion {

    Tripulacion tripulantes[] = new Tripulacion[2];

    //Singleton
    private static TripulacionReal tripulacion;

    private TripulacionReal() {
    }

    public static TripulacionReal getTripulacion() {
        if (tripulacion == null) {
            tripulacion = new TripulacionReal();
        }
        return tripulacion;
    }
}
