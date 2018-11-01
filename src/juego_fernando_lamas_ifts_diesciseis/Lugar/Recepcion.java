/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Lugar;

import ifts16.pp.juego.componentes.Componente;
import ifts16.pp.juego.componentes.ReferenciaItem;
import ifts16.pp.juego.componentes.ReferenciaLugar;
import ifts16.pp.juego.componentes.Referencias;
import ifts16.pp.juego.componentes.lugar.ConItems;
import ifts16.pp.juego.componentes.lugar.Conectado;
import ifts16.pp.juego.componentes.lugar.Sociable;
import ifts16.pp.juego.entidades.LugarBase;
import java.util.UUID;

/**
 *
 * @author Fernando Lamas
 */
public class Recepcion extends Componente implements ConItems, Conectado {

    //Todo sobre con items
    @Override
    public Referencias<ReferenciaItem> items() {
    }
    
    //Todo sobre conexiones

    @Override
    public boolean abrir(UUID lugar) {
    }

    @Override
    public boolean cerrar(UUID lugar) {
    }

    @Override
    public LugarBase irA(UUID lugar) {
    }

    @Override
    public void conectar(ReferenciaLugar lugar) {
    }
    

    @Override
    public Referencias<ReferenciaLugar> conexiones() {
    }
    
}
