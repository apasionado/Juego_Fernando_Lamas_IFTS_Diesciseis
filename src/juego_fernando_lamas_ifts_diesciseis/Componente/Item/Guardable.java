/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Componente.Item;

import ifts16.pp.juego.componentes.Componente;
import ifts16.pp.juego.componentes.item.Inventariable;
import ifts16.pp.juego.sistemas.IOBase;

/**
 *
 * @author Fernando Lamas
 */
public class Guardable extends Componente implements Inventariable{
    
    protected int cantidadActual;
    
    public Guardable(){
        this.cantidadActual = 0;
    }

    @Override
    public int cantidad() {
        return this.cantidadActual;
    }

    @Override
    public int vaciar() {
        this.cantidadActual = 0;
        return this.cantidadActual;
    }

    @Override
    public int agregar(int cantidad) {
        if(!(this.cantidadActual >= cantidad));
        this.cantidadActual = this.cantidadActual + cantidad;
        return this.cantidadActual;
    }

    @Override
    public int quitar(int cantidad) {
        if(!(this.cantidadActual > 0)){
            this.cantidadActual = this.cantidadActual - cantidad;
            
        }else{
            IOBase.mostrarTexto("No puedes quitar de un item vacio!");
        }
        return this.cantidadActual;
    }
    
}
