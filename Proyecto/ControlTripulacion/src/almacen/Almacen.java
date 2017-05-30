/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;

import bridge.Condiciones;
import static almacen.Almacen.PILOTOS;
import bridge.prototype.Escenario;
import bridge.prototype.Escenario1;
import bridge.prototype.Escenario2;
import bridge.prototype.Escenario3;
import bridge.prototype.Escenario4;
import bridge.prototype.Escenario5;
import bridge.prototype.Escenario6;
import bridge.Aeropuerto;
import composite.proxy.Piloto;
import composite.proxy.PilotoProxy;
import composite.proxy.PilotoSubject;
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
    public static Map<Integer,Aeropuerto> aeropuertos=new HashMap<Integer,Aeropuerto>();
    public static Escenario escenario1 = new Escenario1();
    public static Escenario escenario2 = new Escenario2();
    public static Escenario escenario3 = new Escenario3();
    public static Escenario escenario4 = new Escenario4();
    public static Escenario escenario5 = new Escenario5();
    public static Escenario escenario6 = new Escenario6();
    
    public static Map<Integer,RegistroVuelos> registroVuelos= new HashMap<Integer,RegistroVuelos>();
    
    public static List<Piloto> PILOTOS = new ArrayList<>();
    
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
