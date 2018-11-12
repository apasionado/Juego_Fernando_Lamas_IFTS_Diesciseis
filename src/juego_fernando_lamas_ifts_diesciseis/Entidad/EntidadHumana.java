/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Entidad;

import ifts16.pp.juego.entidades.PersonajeAbstracto;
import ifts16.pp.juego.sistemas.IOBase;
import java.util.ArrayList;
import juego_fernando_lamas_ifts_diesciseis.Componente.Personaje.Inventario;
import juego_fernando_lamas_ifts_diesciseis.Componente.Personaje.Lucha;
import juego_fernando_lamas_ifts_diesciseis.Componente.Personaje.Salud;

/**
 *
 * @author Fernando Lamas
 */
public class EntidadHumana extends PersonajeAbstracto{
    
    public Inventario ConInventario;
    public Salud Saludable;
    public Lucha Luchador;
    
    public EntidadHumana(){
        super();
        
        this.nombre = "Nombre sin asignar still";
        this.Saludable = new Salud();
        this.Saludable.establecerSalud(10);
        }
    
        //UNA SIMPLE LISTA QUE CUANDO AGARRA UN ITEM LO AGREGA A LA LISTA
        //CON FUNCIONES DE YAPA PARA QUE ANDEN LOS ITEMS EN LAS PELEAS
        private ArrayList<String> items;
    
	public String esteItem(int vector) {
            String esteItem = this.items.get(vector); 
            
		return esteItem;
	}
	
	public void agregarItem(String item) {
                    this.items.add(item);
                    IOBase.ingresarTexto("El item fue agregado exitosamente");
        }
	
	public void eliminarItem(String item) {
                    this.items.add(item);
                    IOBase.ingresarTexto("El item fue eliminado exitosamente");
	}
	
	
	public boolean itemEstaEnLaLista(String item) {
		if(this.items.contains(item)) {
			return true;
		}
		else {
                    IOBase.ingresarTexto("El item que buscas no esta en la lista");
			return false;
		}
	}
        public void usarItem(String item){
            if(itemEstaEnLaLista(item)){
                switch(item){
                    
                }
            }
        }
}
