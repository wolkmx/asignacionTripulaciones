/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

/**
 *
 * @author Roberto Hernandez De La Luz <www.ohsioh.com>
 */
public abstract class Meteorologica implements CondicionesVariables{
    
    private String nombre;
    private int dificultad;
    private float pesoRelativo;
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getDificultad(){
        return this.dificultad;
    }
    
    public void setDificultad(int dificultad){
        this.dificultad = dificultad;
    }
    
    public float getPesoRelativo(){
        return this.pesoRelativo;
    }
    
    public void setPesoRelativo(float pesoRelativo){
        this.pesoRelativo = pesoRelativo;
    }
    
}
