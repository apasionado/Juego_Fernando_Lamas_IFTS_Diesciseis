/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Item;

import ifts16.pp.juego.componentes.Componente;
import ifts16.pp.juego.componentes.ParteDelCuerpo;
import ifts16.pp.juego.componentes.item.DeDefensa;
import ifts16.pp.juego.componentes.item.Equipable;
import ifts16.pp.juego.componentes.item.Inventariable;
import ifts16.pp.juego.componentes.item.Pesado;
import ifts16.pp.juego.sistemas.IOBase;
import ifts16.pp.juego.utiles.ConOpciones;
import ifts16.pp.juego.utiles.Opciones;

/**
 *
 * @author Fernando Lamas
 */
public class Grog extends Componente implements DeDefensa, Inventariable, Equipable, Pesado, ConOpciones{


    //TODO SOBRE DEFENSA 
    
    protected int bonoDefensa;
    protected int bonoResistencia;
    
    
    @Override
    public int bonoDefensa() {
        return this.bonoDefensa;
    }

    @Override
    public int bonoResistencia() {
        return this.bonoResistencia;
    }

    @Override
    public int aumentarBonoDefensa(int cantidad) {
        this.bonoDefensa = 0;
        return this.bonoDefensa;
    }

    @Override
    public int disminuirBonoDefensa(int cantidad) {       
        this.bonoDefensa = 0;
        return this.bonoDefensa;
    }

    @Override
    public int aumentarBonoResistencia(int cantidad) {
        this.bonoResistencia = this.bonoResistencia + 1;
        return this.bonoResistencia;
    }

    @Override
    public int disminuirBonoResistencia(int cantidad) {
        this.bonoResistencia = this.bonoResistencia - 1;
        return this.bonoResistencia;
    }
    
    
    //TODO SOBRE EQUIPABLE
    
    protected int cantidad;
    protected ParteDelCuerpo Boca;
   

    @Override
    public void lugarDeUso(ParteDelCuerpo parte) {
        IOBase.mostrarTexto("Se usa en " + parte.ManoDerecha);
    }
    
    @Override
    public ParteDelCuerpo seUsaEn() {
        return this.Boca;
    }

    //TODO de inventariable
    
    @Override
    public int cantidad() {
        return this.cantidad;
    }

    @Override
    public int vaciar() {
        this.cantidad = 0;
        return this.cantidad;
    }

    @Override
    public int agregar(int cantidad) {
        cantidad = cantidad + 1;
        return cantidad;
    }

    @Override
    public int quitar(int cantidad) {
        cantidad = cantidad - 1;
        return cantidad;
    }

    //TODO sobre opciones
    
    @Override
    public Opciones opciones() {
        opciones(lista); 
    }

    @Override
    public Opciones opciones(String texto) {
        texto.charAt(1);
        texto = "Usar grog";
        
        return texto;
    }


    @Override
    public int peso() {
    }

    @Override
    public int agregarPeso(int peso) {
    }

    @Override
    public int quitarPeso(int peso) {
    }


    
}
