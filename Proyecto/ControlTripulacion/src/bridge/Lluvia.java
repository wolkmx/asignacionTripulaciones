/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Roberto Hernandez De La Luz <www.ohsioh.com>
 */
public class Lluvia extends Meteorologica{

    @Override
    public List<String> getInfo() {
       List<String> respuesta = new ArrayList();
       respuesta.add("Condicion: "+this.getNombre());
       respuesta.add("Dificultad: "+this.getDificultad());
       respuesta.add("Peso Relativo: "+this.getPesoRelativo());
       
       return respuesta;
    }


}
