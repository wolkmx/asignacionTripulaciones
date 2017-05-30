/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;

import static almacen.Almacen.PILOTOS;
import bridge.prototype.Escenario;
import bridge.prototype.Escenario1;
import bridge.prototype.Escenario2;
import bridge.prototype.Escenario3;
import bridge.prototype.Escenario4;
import bridge.prototype.Escenario5;
import bridge.prototype.Escenario6;
import composite.proxy.Piloto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import registro.RegistroPruebasSimulacion;
import registro.RegistroVuelos;

/**
 *
 * @author Roberto Hernandez De La Luz <www.ohsioh.com>
 * Clase utileria para guardar las listas estaticas es decir como si fuera nuestra base de datos
 */
public class Almacen {
    
    public static Map<String,RegistroPruebasSimulacion> registroPruebasSimulacion= new HashMap<String,RegistroPruebasSimulacion>();
    
    public static Escenario escenario1 = new Escenario1();
    public static Escenario escenario2 = new Escenario2();
    public static Escenario escenario3 = new Escenario3();
    public static Escenario escenario4 = new Escenario4();
    public static Escenario escenario5 = new Escenario5();
    public static Escenario escenario6 = new Escenario6();
    
    public static Map<Integer,RegistroVuelos> registroVuelos= new HashMap<Integer,RegistroVuelos>();
    
    public static List<Piloto> PILOTOS = new ArrayList<Piloto>();
}
