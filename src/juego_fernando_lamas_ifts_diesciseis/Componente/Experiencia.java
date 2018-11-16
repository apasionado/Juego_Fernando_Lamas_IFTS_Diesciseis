/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Componente;

import ifts16.pp.juego.componentes.Componente;
import ifts16.pp.juego.componentes.personaje.Experimentado;
import java.util.Random;

/**
 *
 * @author Heresy
 */
public class Experiencia extends Componente implements Experimentado{
    
    protected int nivelActual;
    protected int nivelProximo;
    protected int nivelMinimo;
    protected int nivelMaximo;
    protected int experienciaActual;
    protected int experienciaNivelProximo;
    protected Random azar;
    
    
    Experiencia(){
        this.nivelActual = 0;
        this.nivelMaximo = 10;
        this.nivelMinimo = 0;
        this.experienciaActual = 0;
        this.azar = new Random();
    }
    
     //TODA LA EXPERIENCIA DEL JUGADOR
    
    

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
        
        return nivelMinimo;
    }

    @Override
    public int nivelMaximo() {
        
        return this.nivelMaximo;
    }

    @Override
    public int experiencia() {
        
        return experienciaActual;
    }

    @Override
    public int agregarExperiencia(int cantidad) {
        // ver  como introducir la experiencia en cantidad probablemente al azar
        this.experienciaActual = this.experienciaActual + cantidad;
        return this.experienciaActual;
    }

    @Override
    public int quitarExperiencia(int cantidad) {
        // ver  como introducir la experiencia en cantidad probablemente al azar
        this.experienciaActual = this.experienciaActual - cantidad;
        return this.experienciaActual;
    }

    @Override
    public int experienciaNivelProximo() {
        this.experienciaNivelProximo = this.experienciaActual * 2;
        return this.experienciaNivelProximo;
    }

    @Override
    public boolean puedeSubirNivel() {
        return true;
    }

    @Override
    public int subirNivel() {
        this.nivelActual = this.nivelProximo;
        return this.nivelActual;
    }

    @Override
    public int subirNivel(int cantidad) {
        this.nivelActual = this.nivelProximo;
        return this.nivelActual;
    }

    @Override
    public int bajarNivel() {
        this.nivelActual = this.nivelActual - 1;
        return this.nivelActual;
    }

    @Override
    public int bajarNivel(int cantidad) {
        this.nivelActual = this.nivelActual - 1;
        return this.nivelActual;
    }
 
    
}
