/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Componente.Personaje;

import ifts16.pp.juego.componentes.personaje.Luchador;
import ifts16.pp.juego.sistemas.IOBase;

/**
 *
 * @author Fernando Lamas
 */
public class Lucha implements Luchador {
    
    protected int danio;
    protected int defensa;
    protected int ataque;
    protected int resistencia;

    public Lucha(){
    this.danio = 1;
    this.defensa = 10;
    this.ataque = 0;
    this.resistencia = 0;
    
    }

    @Override
    public int ataque() {
        this.ataque = this.danio;
        return this.ataque;
    }

    @Override
    public int defensa() {
        return this.defensa;
    }

    @Override
    public int danio() {
        return danio;
    }

    @Override
    public int resistencia() {
        return this.resistencia;
    }

    @Override
    public int aumentarAtaque(int valor) {
        IOBase.mostrarTexto("Para aumentar el ataque use aumentar danio");
        return 0;
    }

    @Override
    public int aumentarDefensa(int valor) {
        this.defensa = this.defensa + valor;
        return this.defensa;
    }

    @Override
    public int aumentarDanio(int valor) {
        this.danio = this.danio + valor;
        return this.danio;
    }

    @Override
    public int aumentarResistencia(int valor) {
        IOBase.mostrarTexto("Funcion no usada");
        return 0;
    }

    @Override
    public int disminuirAtaque(int valor) {
                IOBase.mostrarTexto("Funcion no usada");
        return 0;
    }

    @Override
    public int disminuirDefensa(int valor) {
        this.defensa = this.defensa - valor;
        return this.defensa;
    }

    @Override
    public int disminuirDanio(int valor) {
        this.danio = this.danio - valor;
        return this.danio;
    }

    @Override
    public int disminuirResistencia(int valor) {
                IOBase.mostrarTexto("Funcion no usada");
        return 0;
    }
    
}
