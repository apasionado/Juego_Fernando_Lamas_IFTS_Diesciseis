/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Componente;

import ifts16.pp.juego.componentes.Componente;
import ifts16.pp.juego.componentes.ReferenciaItem;
import ifts16.pp.juego.componentes.Referencias;
import ifts16.pp.juego.componentes.item.Inventariable;
import ifts16.pp.juego.componentes.personaje.Cargado;
import ifts16.pp.juego.componentes.personaje.ConInventario;
import ifts16.pp.juego.componentes.personaje.ConMision;
import ifts16.pp.juego.componentes.personaje.Experimentado;
import ifts16.pp.juego.componentes.personaje.Jugador;
import ifts16.pp.juego.componentes.personaje.Saludable;
import ifts16.pp.juego.entidades.ItemAbstracto;
import ifts16.pp.juego.sistemas.IOBase;
import java.awt.Color;
import java.util.Random;
import java.util.UUID;

/**
 *
 * @author Fernando Lamas
 */
public class Humano extends Componente implements Jugador, Experimentado, Saludable, Cargado, ConInventario,
                                                  ConMision{

    protected int nivelActual;
    protected int nivelProximo;
    protected int nivelMinimo;
    protected int nivelMaximo;
    protected int experienciaActual;
    protected int experienciaNivelProximo;
    protected Random azar;
    //Para inicializar las variables "ACTUAL" ver como hizo el profesor en combatiente
    
    //INICIALIZAR VARIABLES
 
    

    Humano() {
        this.nivelActual = 0;
        this.nivelMaximo = 10;
        this.nivelMinimo = 0;
        this.experienciaActual = 0;
        this.saludMaxima = 10;
        this.saludActual = this.saludMaxima;
        this.pesoActual = 0;
        this.pesoMaximo = 10;
        this.azar = new Random();
        
    }
    
    
    //TODA LA EXPERIENCIA DEL JUGADOR
    
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
 
    //TODA LA SALUD DEL JUGADOR

    protected int saludActual;
    protected int saludMaxima;
    //daniar maximo se supone es el daño maximo que puede recibir el jugador
    protected int daniarMaximo;
    protected int daniar;
    
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
  
    //TODO SOBRE CARGADO

    protected int pesoActual;
    protected int pesoMaximo;
    
    
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

    
    //TODO SOBRE INVENTARIO
    
    

    
    @Override
    public boolean agregar(Inventariable item) {
        
        if(!(item.getClass() == null)){
            return true;
        }else{
            return false;
        }
        
    }

    @Override
    public boolean quitar(UUID id) {
        if(!(id.getClass() == null)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean reemplazar(UUID id, Inventariable item) {
        
        //COMO SE USA ESTO?
        return false;
        
    }

    @Override
    public int agregarCantidad(UUID id, int cantidad) {
        
        if(!(this.item(id) == null)){
            
            cantidad = cantidad + 1;
            
        }else{
            
        }
        return cantidad;
    }

    @Override
    public int quitarCantidad(UUID id, int cantidad) {
        
        if(!(this.item(id) == null)){
            
        cantidad = cantidad + 1;
            
        }else{
            
        }
        return cantidad;
    }
    
    Referencias RefInventario = new Referencias();
    
    @Override
    public Referencias<ReferenciaItem> items() {
        //Como se usan las referencias?
    }

    @Override
    public ItemAbstracto item(UUID id) {
        return this.item(id);
    }

    
    // TODO SOBRE MISIONERO
    
    //ver como engancharlo con misiones en situaciones especificas
    //probablemente con if de por medio
    

    
    @Override
    public void darMision(ReferenciaItem mision) {
        
    }

    @Override
    public ReferenciaItem mision() {
    }

    @Override
    public boolean completa() {
    }

    @Override
    public void completar() {
    }
}
