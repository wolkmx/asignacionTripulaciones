/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

/**
 *
 * @author Ignacio Luna Rodriguez
 */
public class Aeropuerto implements UsuarioCondiciones{

    /**
     * @return the tipoDeAeropuesto
     */
    public String getTipoDeAeropuesto() {
        return tipoDeAeropuesto;
    }

    /**
     * @param tipoDeAeropuesto the tipoDeAeropuesto to set
     */
    public void setTipoDeAeropuesto(String tipoDeAeropuesto) {
        this.tipoDeAeropuesto = tipoDeAeropuesto;
    }
    private int id;
    private String tipoDeAeropuesto;
    private String nombre;
    private Condiciones condicionTecnica;

    public void setCondicionTecnica(Tecnica condicionTecnica) {
        this.condicionTecnica = condicionTecnica;
    }
    
    public Aeropuerto(){
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public Condiciones[] getMeteorologica() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Condiciones[] getVisibilidad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Condiciones[] getOrografica() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Condiciones getTecnica() {
        return this.condicionTecnica;
    }
    
}
