/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Item;

import ifts16.pp.juego.entidades.ItemAbstracto;
import ifts16.pp.juego.sistemas.IOBase;
import ifts16.pp.juego.utiles.ConOpciones;
import ifts16.pp.juego.utiles.MapaDeOpciones;
import ifts16.pp.juego.utiles.Opcion;
import ifts16.pp.juego.utiles.Opciones;
import juego_fernando_lamas_ifts_diesciseis.Componente.Item.Carga;

/**
 *
 * @author Fernando Lamas
 */
public class Grog extends ItemAbstracto implements ConOpciones {
        
    public Carga Cargado;
    
    public Grog(){
    super();
    this.nombre = "Grog" + this.getId().toString();
    this.Cargado = new Carga();
    }
    
    //mostrar al profesor como hice estas opciones
     MapaDeOpciones mapa = new MapaDeOpciones();
     Opciones listaDeOpciones = new Opciones();
     Opcion eleccion = IOBase.elegirOpcion(listaDeOpciones);
     
    public Opciones opciones() {
        
        
       
        
        
        listaDeOpciones.agregar("1", "Beber");
        listaDeOpciones.agregar("2", "Tirar");
        listaDeOpciones.agregar("3", "Observar");
        
        
        mapa.poner("irse", listaDeOpciones);
        
        return listaDeOpciones;
        
        
    }
    

    @Override
    public Opciones opciones(String texto) {
        return null;
    }

}
