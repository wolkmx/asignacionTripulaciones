/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;

import bridge.Condiciones;
import bridge.prototype.Escenario;
import bridge.prototype.Escenario1;
import bridge.prototype.Escenario2;
import bridge.prototype.Escenario3;
import bridge.prototype.Escenario4;
import bridge.prototype.Escenario5;
import bridge.prototype.Escenario6;
import composite.proxy.Piloto;
import composite.proxy.PilotoProxy;
import composite.singleton.TripulacionReal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import registro.RegistroPruebasSimulacion;
import registro.RegistroVuelos;

/**
 *
 * @author Roberto Hernandez De La Luz <www.ohsioh.com>
 * Clase utileria para guardar las listas estaticas es decir como si fuera nuestra base de datos
 */
public class Almacen {
    
    public static List<RegistroPruebasSimulacion> registroPruebasSimulacion= new ArrayList<>();
    
    public static Escenario escenario1 = new Escenario1();
    public static Escenario escenario2 = new Escenario2();
    public static Escenario escenario3 = new Escenario3();
    public static Escenario escenario4 = new Escenario4();
    public static Escenario escenario5 = new Escenario5();
    public static Escenario escenario6 = new Escenario6();
    
    public static Map<Integer,RegistroVuelos> registroVuelos= new HashMap<Integer,RegistroVuelos>();
    
    public static List<Piloto> PILOTOS = new ArrayList<>();
    public static List<TripulacionReal> TRIPULACIONES = new ArrayList<>();
    
    public static PilotoProxy getPilotoDisponible(String nombre){
        PilotoProxy piloto= new PilotoProxy(nombre);
        
        return piloto;
        
    }
    
    public static Piloto getPiloto(String nombre){
        Piloto piloto = null;
        for(Piloto p: PILOTOS){
            if(p.getNombre().compareTo(nombre) == 0){
                piloto = p;
            }
        }
        return piloto;
    }
    
    //Metodo estatico para obtener las simulaciones de un piloto dado , segun su numeroDeEmpleado
    public static String[] getSimulacionesPiloto(String numeroEmpleado){
        List<String> respuesta = new ArrayList<>();
        
        
        for(RegistroPruebasSimulacion r: registroPruebasSimulacion){
            if(r.getPiloto() == null){
                respuesta.add("");
            }else{
            
                if(r.getPiloto().getNombre().compareTo(numeroEmpleado) == 0 ){
                    respuesta.add(numeroEmpleado+"-"+r.getEscenario().getNombre());
                }
            
            }
        }
        
        String[] t = respuesta.toArray(new String[0]);
        
        return t;
    }
    /**
     * Metodo public estatico para obtener las caracteristicas de los vueolos
     */
    
    public static String getCaracteristicasVuelo(String nVuelo){
        String respuesta = "";
        
        for(Entry<Integer,RegistroVuelos> e: registroVuelos.entrySet()){
            if(String.valueOf(e.getValue().getVuelo().getNumeroVuelo()).compareTo(nVuelo) == 0){

                String temp = obtenerDatosCondiciones(e.getValue().getVuelo().getMeteorologica());
                respuesta = respuesta + "Configuracion Meteorologica: "+temp+"<br/>";
                respuesta = respuesta + "=================<br/>";
                
                temp = obtenerDatosCondiciones(e.getValue().getVuelo().getOrografica());
                respuesta = respuesta + "Configuracion Orografica: <br/>"+temp+"<br/>";
                respuesta = respuesta + "=================<br/>";

                temp = obtenerDatosCondiciones(e.getValue().getVuelo().getVisibilidad());
                respuesta = respuesta + "Configuracion Visibilidad: "+temp+"<br/>";
                respuesta = respuesta + "=================<br/>";
                
                break;
            }
            
        }
        
        
        return "<html><body style='width:100%;'>"+respuesta+"</body></html>";
    }
    
    
    /**
     * Metodo publico estatico para obtener un listado de tipo string con todos los numeros de vuelo existentes
    */
    public static String[] getVuelosExistentes(){
        List<String> respuesta = new ArrayList<>();
        
        for(Entry<Integer,RegistroVuelos> e: registroVuelos.entrySet()){
            respuesta.add(String.valueOf(e.getValue().getVuelo().getNumeroVuelo()));
        }
        
        String[] t = respuesta.toArray(new String[0]);
        
        return t;
    }
    
    /**
     * Metodo publico estatico para obtener una cadena HTML con la informacion de las calificaicones de la simulacion
    */
    public static String getCalificacionSimulacion(String nombreEscenario){
        String respuesta = "";
        String[] valores = nombreEscenario.split("-");
        
        for(RegistroPruebasSimulacion r: Almacen.registroPruebasSimulacion){
            if(r.getPiloto() != null){
                if((r.getPiloto().getNombre().compareTo(valores[0]) == 0) && (r.getEscenario().getNombre().compareTo(valores[1]) == 0) ){
                    respuesta = "Escenario: "+r.getEscenario().getNombre()+"<br/>Calificaicon Meteorologica: "+r.getCalificacionMeteorologica()+"<br/>";
                    respuesta = respuesta + "Calificacion Orografica: "+r.getCalificacionOrografica()+"<br/>";
                    respuesta = respuesta + "Calificacion Visibilidad: "+r.getCalificacionVisibilidad()+"<br/>";
                    respuesta = respuesta + "Fecha: "+r.getFecha()+"<br/>";
                    respuesta = respuesta + "=================<br/>";
                    
                    String temp = obtenerDatosCondiciones(r.getEscenario().getMeteorologica());
                    respuesta = respuesta + "Configuracion Meteorologica: "+temp+"<br/>";
                    respuesta = respuesta + "=================<br/>";
                    
                    temp = obtenerDatosCondiciones(r.getEscenario().getOrografica());
                    respuesta = respuesta + "Configuracion Orografica: <br/>"+temp+"<br/>";
                    respuesta = respuesta + "=================<br/>";
                    
                    temp = obtenerDatosCondiciones(r.getEscenario().getVisibilidad());
                    respuesta = respuesta + "Configuracion Visibilidad: "+temp+"<br/>";
                    respuesta = respuesta + "=================<br/>";
                    
                }
            }

        }
        
        
        return "<html><body style='width:100%;'>"+respuesta+"</body></html>";
    }
    
    public static String obtenerDatosCondiciones(Condiciones[] condiciones){
        String respuesta = "";
        
        for(Condiciones c: condiciones){
            respuesta = respuesta + "Tipo: "+c.getClass().getSimpleName()+"<br/>";
            for(String x : c.getInfo()){
                respuesta = respuesta + x+"<br/>";
            }
        }
        
        return respuesta;
    }
    
    
}
