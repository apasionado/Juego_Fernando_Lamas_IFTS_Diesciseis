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
import ifts16.pp.juego.utiles.ConOpciones;
import ifts16.pp.juego.utiles.Opciones;

/**
 *
 * @author Fernando Lamas
 */
public class Grog extends Componente implements DeDefensa, Inventariable, Equipable, ConOpciones{

    
    protected int cantidad;
    
    //si al obtener el grog no tiene valores sacar el void
    void Obtenido() {
        this.cantidad = 5;
    }
    
    @Override
    public int bonoDefensa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int bonoResistencia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int aumentarBonoDefensa(int cantidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int disminuirBonoDefensa(int cantidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int aumentarBonoResistencia(int cantidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int disminuirBonoResistencia(int cantidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ParteDelCuerpo seUsaEn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void lugarDeUso(ParteDelCuerpo parte) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int cantidad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int vaciar() {
        this.cantidad = 0;
        return cantidad;
    }

    @Override
    public int agregar(int cantidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int quitar(int cantidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Opciones opciones() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Opciones opciones(String texto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
