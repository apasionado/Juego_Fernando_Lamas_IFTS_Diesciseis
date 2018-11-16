/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Componente;

import ifts16.pp.juego.componentes.Componente;
import ifts16.pp.juego.componentes.personaje.Cargado;
import ifts16.pp.juego.sistemas.IOBase;

/**
 *
 * @author Heresy
 */
public class Carga extends Componente implements Cargado{
    
    protected int pesoActual;
    protected int pesoMaximo;
    
    Carga(){
        this.pesoActual = 0;
        this.pesoMaximo = 10;
    }
    
    
  
    
    
    @Override
    public int pesoActual() {
        return this.pesoActual;
    }

    @Override
    public int pesoMaximo() {
        return this.pesoMaximo;
    }

    @Override
    public boolean puedeCargar(int peso) {
        return true;
    }

    @Override
    public int agregarPeso(int peso) {
        peso = 1;
        if(!((peso + this.pesoActual) > this.pesoMaximo)){
            IOBase.mostrarTexto("Estas muy cargado");
        return this.pesoActual;
        }else{
        this.pesoActual = this.pesoActual + peso;
        return this.pesoActual; 
        }
        
    }

    @Override
    public int quitarPeso(int peso) {
        this.pesoActual = this.pesoActual - 1;
        return this.pesoActual;
    }

    @Override
    public int aumentarPesoMaximo(int peso) {
        this.pesoMaximo = this.pesoMaximo + peso;
        return this.pesoMaximo;
    }

    @Override
    public int disminuirPesoMaximo(int peso) {
        if(!(this.pesoMaximo > 1)){
        IOBase.mostrarTexto("No puede tener un peso máximo menor que 1");
        return this.pesoMaximo;
        }else{
        this.pesoMaximo = this.pesoMaximo - peso;
        return this.pesoMaximo;  
        }
       
    }
    
}
