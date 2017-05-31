/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite.proxy;

import static almacen.Almacen.PILOTOS;
import composite.singleton.Tripulacion;
import java.util.Date;
//XXX
/**
 *
 * @author Cristian Enríquez
 */
public class PilotoProxy extends Tripulacion implements PilotoSubject{
    private PilotoSubject piloto;
    private boolean estado;
    
    public PilotoProxy(){
    piloto = new Piloto();
    estado = true;
    }
    
    public PilotoProxy(String nombre){
        
        estado = false;
        for(Piloto p: PILOTOS){
            piloto = p;
            if(p.getNombre().compareTo(nombre) == 0 && p.getVolando()){
                estado = true;
                break;
            }
        }
    
    }
    
    public void setPassword(String password){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getnEmpleado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setnEmpleado(int nEmpleado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Date getFechaNacimiento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setFechaNacimiento(Date fechaNacimiento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setId(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPassword() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Piloto obtener() {
        if(!this.estado){
            return (Piloto) this.piloto;
        }else{
            return null;
        }
    }
    
    public void setEstado(boolean estado){
        this.estado = estado;
    }
    
    
}
