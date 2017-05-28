/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import Bridge.Aeropuerto;

/**
 *
 * @author Cristian Enríquez
 */
public interface IConstructor {
    public void tipoDeAeropuerto(String tipo);
    public void nombreAerolinea(String nombre);
    public void id(int id);
    public Aeropuerto getAeropuerto();
}
