/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Componente;

import ifts16.pp.juego.componentes.Componente;
import ifts16.pp.juego.componentes.personaje.Saludable;
import ifts16.pp.juego.sistemas.IOBase;
import java.awt.Color;
import java.util.Random;

/**
 *
 * @author Heresy
 */
public class Salud extends Componente implements Saludable{
    

    protected int saludActual;
    protected int saludMaxima;
    //daniar maximo se supone es el daño maximo que puede recibir el jugador
    protected int daniarMaximo;
    protected int daniar;
    protected Random azar;
    
       Salud() {
        this.saludMaxima = 10;
        this.saludActual = this.saludMaxima;
        this.azar = new Random();
    }
    
    
   

    
    @Override
    public int saludActual() {
        return saludActual;
    }

    @Override
    public int saludMaxima() {
        return this.saludMaxima;
    }

    @Override
    public int curarMaximo() {
        this.saludActual = this.saludMaxima - this.saludActual;
        return this.saludActual;
    }

    @Override
    public int daniarMaximo() {
        this.daniar = this.saludActual;
        return this.daniar;
    }

    @Override
    public int curar(int puntos) {
        puntos = azar.nextInt(10);
        if(!((this.saludActual + puntos) < this.curarMaximo())){
            IOBase.mostrarTexto("Te haz curado al máximo");
        return this.curarMaximo();
        }else{
        this.saludActual = this.saludActual + puntos;
            IOBase.mostrarTexto("Te haz curado " + puntos + " puntos de vida");
        return this.saludActual;
        }
    }

    @Override
    public int daniar(int puntos) {
        puntos = azar.nextInt(6);
        if(!((this.saludActual + puntos) < this.daniarMaximo())){
            IOBase.mostrarTexto("Golpe CRITICO", Color.red, Color.white);
        return this.daniarMaximo();
        }else{
        this.saludActual = this.saludActual - puntos;
        IOBase.mostrarTexto("Haz daniado "+puntos+ " a tu oponente");
        return this.saludActual;
        }
    }
  
}
