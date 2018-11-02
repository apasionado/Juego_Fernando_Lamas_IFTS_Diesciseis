/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Lugar;

import ifts16.pp.juego.componentes.Componente;
import ifts16.pp.juego.componentes.ReferenciaItem;
import ifts16.pp.juego.componentes.Referencias;
import ifts16.pp.juego.componentes.lugar.ConItems;
import juego_fernando_lamas_ifts_diesciseis.Item.Grog;

/**
 *
 * @author Fernando Lamas
 */
public class Recepcion extends Componente implements ConItems {

    //Todo sobre con items
    Referencias lista = new Referencias();
    Grog grog = new Grog();
    
    @Override
    public Referencias<ReferenciaItem> items() {
        lista.agregar(grog.referencia());
        
        return lista;
    }
    
    //Todo sobre conexiones
    
    
    
}

