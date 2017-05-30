/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro;

import bridge.prototype.Escenario;
import composite.proxy.PilotoSubject;
import java.util.Date;

/**
 *
 * @author Roberto Hernandez De La Luz <www.ohsioh.com>
 */
public class RegistroPruebasSimulacion {
    
    private PilotoSubject piloto;
    private Escenario escenario;
    private int calificacionMeteorologica;
    private int calificacionVisibilidad;
    private int calificacionOrografica;
    private Date fecha;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    public PilotoSubject getPiloto() {
        return piloto;
    }

    public void setPiloto(PilotoSubject piloto) {
        this.piloto = piloto;
    }

    public Escenario getEscenario() {
        return escenario;
    }

    public void setEscenario(Escenario escenario) {
        this.escenario = escenario;
    }

    public int getCalificacionMeteorologica() {
        return calificacionMeteorologica;
    }

    public void setCalificacionMeteorologica(int calificacionMeteorologica) {
        this.calificacionMeteorologica = calificacionMeteorologica;
    }

    public int getCalificacionVisibilidad() {
        return calificacionVisibilidad;
    }

    public void setCalificacionVisibilidad(int calificacionVisibilidad) {
        this.calificacionVisibilidad = calificacionVisibilidad;
    }

    public int getCalificacionOrografica() {
        return calificacionOrografica;
    }

    public void setCalificacionOrografica(int calificacionOrografica) {
        this.calificacionOrografica = calificacionOrografica;
    }
    
    
    
}
