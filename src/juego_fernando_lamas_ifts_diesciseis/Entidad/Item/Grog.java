/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Entidad.Item;

import ifts16.pp.juego.entidades.ItemAbstracto;
import ifts16.pp.juego.utiles.ConOpciones;
import ifts16.pp.juego.utiles.Opciones;
import juego_fernando_lamas_ifts_diesciseis.Componente.Item.Guardable;

/**
 *
 * @author Fernando Lamas
 */
public class Grog extends ItemAbstracto implements ConOpciones {
        
    //si no digo  que grog es inventariable nunca podre agregarlo
    public Guardable Inventariable;
    
    public Grog(){
    super();
    this.nombre = "Grog";
    this.Inventariable = new Guardable();
    }
    
     
     
    public Opciones opciones() {
        
        
       Opciones listaDeOpciones = new Opciones();
        
        
        listaDeOpciones.agregar("1", "Beber");
        listaDeOpciones.agregar("2", "Tirar");
        listaDeOpciones.agregar("3", "Observar");
        

        
        return listaDeOpciones;
        
        
    }
    

    @Override
    public Opciones opciones(String texto) {
        return null;
    }

}
