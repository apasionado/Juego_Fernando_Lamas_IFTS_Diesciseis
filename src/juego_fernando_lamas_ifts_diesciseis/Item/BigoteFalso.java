/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Item;

import ifts16.pp.juego.entidades.ItemAbstracto;
import juego_fernando_lamas_ifts_diesciseis.Componente.Item.Carga;

/**
 *
 * @author usuario
 */
public class BigoteFalso extends ItemAbstracto{
    
    public Carga Cargado;
    
    public BigoteFalso(){
    
        this.nombre = "Un bigote falso " + this.getId().toString();
        this.Cargado = new Carga();
        this.Cargado.agregarPeso(1);
    }
    
}
