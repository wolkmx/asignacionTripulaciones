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
public interface UsuarioCondiciones {
    public abstract Condiciones[] getMeteorologica();
    public abstract Condiciones[] getVisibilidad();
    public abstract Condiciones[] getOrografica();
    public abstract Condiciones getTecnica();
}
