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
import ifts16.pp.juego.utiles.MapaDeOpciones;
import ifts16.pp.juego.utiles.Opcion;
import ifts16.pp.juego.utiles.Opciones;
import java.awt.Color;
import java.util.UUID;

/**
 *
 * @author Fernando Lamas
 */
public class Grog extends Componente implements DeDefensa, Inventariable, Equipable, Pesado, ConOpciones{


    //TODO SOBRE DEFENSA 
    

    Grog(){
        
    }
    

    //TODO SOBRE EQUIPABLE
    
   


    //TODO de inventariable
    
    protected int cantidad;
    
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
    
    
    
  
    //mostrar al profesor como hice estas opciones
    @Override
    public Opciones opciones() {
        
        Opciones listaDeOpciones = new Opciones();
        
        
        listaDeOpciones.agregar("1", "Beber");
        listaDeOpciones.agregar("2","Tirar");
        listaDeOpciones.agregar("3", "Observar");
        
        
        for(int i = 0; i > listaDeOpciones.cantidad(); i++){
        
            String numElegido = IOBase.ingresarTexto("Ingrese un numero del 1 al 3 para las siguientes opciones");
            
            if(numElegido.equals("1")){
            
                this.quitar(1);
            
            if(!(this.cantidad == 0)){
                IOBase.mostrarTexto("Haz bebido un poco de Grog", Color.yellow, Color.white);
            
            }else{
               IOBase.mostrarTexto("¡Has bebido todo el Grog!", Color.yellow, Color.white);
            }
        }
            
        if(numElegido.equals("2")){
            this.vaciar();
            IOBase.mostrarTexto("¿Te volviste loco? ¡Haz tirado todo el Grog!", Color.yellow, Color.white);
        }
        
        if(numElegido.equals("3")){
            
        
        IOBase.mostrarTexto("El grog es una bebida hecha de agua caliente azucarada, mezclada con un licor, "
                + "generalmente ron, aunque también kirsch, coñac u otros. "
                + "Suele contener algún aromatizante, por ejemplo, limón.", Color.yellow, Color.white);
        
        
        }
        
        
            
            
        }
        
        
        return listaDeOpciones;
    }

    @Override
    public Opciones opciones(String texto) {
    }

    
    
    
    /*
    Opciones GrogOpciones = new Opciones();
    
    @Override
    public Opciones opciones() {
        
        //no entendi esto???
        //  GrogOpciones.agregar(op);
        
        
        
        GrogOpciones.cantidad();
        
        GrogOpciones.agregar("Beber", "Bebe el Grog");
        GrogOpciones.agregar("Tirar", "Tira el grog al suelo");
        GrogOpciones.agregar("Observar", "Observa la descripción del objeto");
        
        return GrogOpciones;
        
    }

    @Override
    public Opciones opciones(String texto) {
        
        String numElegido = GrogOpciones.comandoElegido(IOBase.ingresarEntero("Ingrese un número disponible en la lista"));
        for(int i = 0; i < texto.indexOf(numElegido); i++){
        
        if(numElegido.equals("0")){
            
            this.quitar(1);
            
            if(!(this.cantidad == 0)){
                texto = "Haz bebido un poco de Grog";
            
            }else{
                texto = "¡Has bebido todo el Grog!";
            }
        }
            
        if(numElegido.equals("1")){
            this.vaciar();
            texto = "¿Te volviste loco? ¡Haz tirado todo el Grog!";
        }
        
        if(numElegido.equals("2")){
            
        
        texto = "El grog es una bebida hecha de agua caliente azucarada, mezclada con un licor, "
                + "generalmente ron, aunque también kirsch, coñac u otros. "
                + "Suele contener algún aromatizante, por ejemplo, limón.";
        GrogOpciones.setMensaje(texto);
        
        }
        
        }
        //chequear si hay que returnear el grogopciones o el texto (depende la necesidad)
        return GrogOpciones;
    }


    */

    //TODO SOBRE PESO
    
    protected int pesoActual;
    
    @Override
    public int peso() {
        return this.pesoActual;
    }

    @Override
    public int agregarPeso(int peso) {
    
        this.pesoActual = this.pesoActual + peso;
        return this.pesoActual;
    }

    @Override
    public int quitarPeso(int peso) {
        this.pesoActual = this.pesoActual - peso;
        return this.pesoActual;
    }

}
