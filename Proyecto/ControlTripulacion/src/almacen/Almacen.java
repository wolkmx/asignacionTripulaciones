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
import bridge.Aeropuerto;
import bridge.Vuelo;
import composite.proxy.Piloto;
import composite.proxy.PilotoProxy;
import composite.singleton.TripulacionReal;
import java.text.SimpleDateFormat;
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
    public static List<Aeropuerto> aeropuertos=new ArrayList<>();
    public static Escenario escenario1 = new Escenario1();
    public static Escenario escenario2 = new Escenario2();
    public static Escenario escenario3 = new Escenario3();
    public static Escenario escenario4 = new Escenario4();
    public static Escenario escenario5 = new Escenario5();
    public static Escenario escenario6 = new Escenario6();
    
    public static Map<Integer,RegistroVuelos> registroVuelos= new HashMap<Integer,RegistroVuelos>();
    
    public static List<Piloto> PILOTOS = new ArrayList<>();
    public static List<TripulacionReal> TRIPULACIONES = new ArrayList<>();
    public static List<Vuelo> VUELOS = new ArrayList<>();
    
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
    
    /**
     * Metodo que guarda la prueba de simulacion verificando si existe previamente para este escenario para sustituirla o agregar una nueva
     * @param rps 
     */
    public static void registrarPruebaSimulacion(RegistroPruebasSimulacion rps){
    
        int indice = -1;
        

        for(RegistroPruebasSimulacion r: registroPruebasSimulacion){
            //System.out.println(r.getEscenario().getNombre());
            if( (r.getEscenario().getNombre().compareTo(rps.getEscenario().getNombre()) == 0) && (r.getPiloto().getnEmpleado() ==  rps.getPiloto().getnEmpleado()) ){
                indice = registroPruebasSimulacion.indexOf(r);
                break;
            }
        }
        
        if(indice >= 0 ){
            registroPruebasSimulacion.set(indice, rps);
        }else{
            registroPruebasSimulacion.add(rps);
        }
        
        
    }
    
    public static Piloto getPilotoByNempleado(int ne){
        Piloto piloto = null;
        for(Piloto p: PILOTOS){
            if(p.getnEmpleado() == ne){
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
     * @param nVuelo
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
    
    
    public static RegistroVuelos getVuelo(String numero){
        RegistroVuelos rv = null;
        
        for(Entry<Integer,RegistroVuelos> e: registroVuelos.entrySet()){
            if(String.valueOf(e.getValue().getVuelo().getNumeroVuelo()).compareTo(numero) == 0){
                rv = e.getValue();
            }
        }
        
        return rv;
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
                    respuesta = respuesta + "Fecha: "+new SimpleDateFormat("dd-MM-yyyy").format(r.getFecha())+"<br/>";
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
    
       /**
     * Método estatico para recuperar los vuelos que pertenecen a un piloto
     *
     * @param numeroEmpleado
     * @return
     */
    public static String getVuelosPiloto(String numeroEmpleado) {
        String respuesta = "";

        for (Entry<Integer, RegistroVuelos> e : registroVuelos.entrySet()) {
            TripulacionReal x = (TripulacionReal) e.getValue().getTripulacion();
            if (String.valueOf(x.getTripulacion()[0].getnEmpleado()).compareTo(numeroEmpleado) == 0
                    || String.valueOf(x.getTripulacion()[1].getnEmpleado()).compareTo(numeroEmpleado) == 0) {
                respuesta = "Número de vuelo: " + String.valueOf(e.getValue().getVuelo().getNumeroVuelo()) + "<br>"
                        + "Aeropuerto destino: " + e.getValue().getVuelo().getAeropuertoEntrada().getNombre() + "<br>"
                        + "Aeropuerto salida: " + e.getValue().getVuelo().getAeropuertoSalida().getNombre() + "<br>"
                        + "Condiciones meteorológicas previstas: <br>"
                        + getCaracteristicasVuelo(String.valueOf(e.getValue().getVuelo().getNumeroVuelo()));
            } else {
                respuesta = "No tiene vuelos asignados";
            }
        }
        return respuesta;
    }

    /**
     * Método estatico para recuperar los escenarios
     */
    public static String getEscenarios() {
        String respuesta = "";
        respuesta = "<b>Escenario 1: </b>" + escenario1.getNombre()+"<br>"
                + obtenerDatosCondiciones(escenario1.getMeteorologica())+"<br>"
                + obtenerDatosCondiciones(escenario1.getOrografica())+"<br>"
                + obtenerDatosCondiciones(escenario1.getVisibilidad())+"<br>"
                + "<b>Escenario 2: </b>" + escenario2.getNombre()+"<br>"
                + obtenerDatosCondiciones(escenario2.getMeteorologica())+"<br>"
                + obtenerDatosCondiciones(escenario2.getOrografica())+"<br>"
                + obtenerDatosCondiciones(escenario2.getVisibilidad())+"<br>"
                + "<b>Escenario 3: </b>" + escenario3.getNombre()+"<br>"
                + obtenerDatosCondiciones(escenario3.getMeteorologica())+"<br>"
                + obtenerDatosCondiciones(escenario3.getOrografica())+"<br>"
                + obtenerDatosCondiciones(escenario3.getVisibilidad())+"<br>"
                + "<b>Escenario 4: </b>" + escenario4.getNombre()+"<br>"
                + obtenerDatosCondiciones(escenario4.getMeteorologica())+"<br>"
                + obtenerDatosCondiciones(escenario4.getOrografica())+"<br>"
                + obtenerDatosCondiciones(escenario4.getVisibilidad())+"<br>"
                + "<b>Escenario 5: </b>" + escenario5.getNombre()+"<br>"
                + obtenerDatosCondiciones(escenario5.getMeteorologica())+"<br>"
                + obtenerDatosCondiciones(escenario5.getOrografica())+"<br>"
                + obtenerDatosCondiciones(escenario5.getVisibilidad())+"<br>"
                + "<b>Escenario 6: </b>" + escenario6.getNombre()+"<br>"
                + obtenerDatosCondiciones(escenario6.getMeteorologica())+"<br>"
                + obtenerDatosCondiciones(escenario6.getOrografica())+"<br>"
                + obtenerDatosCondiciones(escenario6.getVisibilidad());

        return respuesta;
    }
    
}
