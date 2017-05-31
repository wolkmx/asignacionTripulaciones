/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite.singleton;

import almacen.Almacen;
import composite.proxy.Piloto;
import java.util.Date;

/**
 *
 * @author Cristian Enríquez
 */
public class TripulacionReal extends Tripulacion {

    Tripulacion tripulantes[] = new Tripulacion[2];

    //Singleton
    private static TripulacionReal tripulacion;

    public TripulacionReal() {
    }
    
    public static TripulacionReal getTripulacion(Piloto piloto, Piloto copiloto) {
        //Aqui hago dos verificaciones la primera si no existe ya una tripulacion con esta combinacion
        if (!existeTripulacion(piloto, copiloto)) {
            tripulacion = new TripulacionReal();
        }else{
            
        }
        return tripulacion;
    }
    
    private static boolean existeTripulacion(Piloto piloto, Piloto copiloto){
    
        boolean respuesta = false;
        
        for(TripulacionReal t: Almacen.TRIPULACIONES){
            
            if( (t.tripulantes[0].getNombre().compareTo(piloto.getNombre()) == 0) &&  (t.tripulantes[1].getNombre().compareTo(copiloto.getNombre()) == 0)){
                respuesta = true;
                break;
            }
            
        }
        
        
        return respuesta;
        
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
    public void setPassword(String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
