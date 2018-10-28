/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Entidades;

import ifts16.pp.juego.componentes.Componente;
import ifts16.pp.juego.componentes.personaje.Experimentado;
import ifts16.pp.juego.componentes.personaje.Jugador;

/**
 *
 * @author Fernando Lamas
 */
public class Humana extends Componente implements Jugador, Experimentado{

    protected int nivelActual;
    protected int nivelProximo;
    protected int nivelMinimo;
    protected int nivelMaximo;
    protected int experienciaActual;
    
    
    @Override
    public boolean esJugador() {
        return true;
    }

    @Override
    public int nivel() {
    return nivelActual;
    }


    @Override
    public int nivelProximo() {
    this.nivelProximo = this.nivelActual + 1;
    return nivelProximo;
    }

    @Override
    public int nivelMinimo() {
        this.nivelMinimo = 0;
        return nivelMinimo;
    }

    @Override
    public int nivelMaximo() {
        this.nivelMaximo = 10;
        return this.nivelMaximo;
    }

    @Override
    public int experiencia() {
        return experienciaActual;
    }

    @Override
    public int agregarExperiencia(int cantidad) {
        this.experienciaActual = this.experienciaActual + cantidad;
        return this.experienciaActual;
    }

    @Override
    public int quitarExperiencia(int cantidad) {
        this.experienciaActual = this.experienciaActual - cantidad;
        return this.experienciaActual;
    }

    @Override
    public int experienciaNivelProximo() {
    }

    @Override
    public boolean puedeSubirNivel() {
        return true;
    }

    @Override
    public int subirNivel() {
    }

    @Override
    public int subirNivel(int cantidad) {
    }

    @Override
    public int bajarNivel() {
    }

    @Override
    public int bajarNivel(int cantidad) {
    }
    /*el humano dice hace piensa y apartir de eso interactua con el sistema
    
    si es necesario revisar el doc "HumanEntity"
    */
}
