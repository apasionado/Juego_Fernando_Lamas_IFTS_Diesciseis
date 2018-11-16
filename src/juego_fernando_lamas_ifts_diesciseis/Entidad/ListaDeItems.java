/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Entidad;

import ifts16.pp.juego.sistemas.IOBase;
import ifts16.pp.juego.utiles.ConOpciones;
import ifts16.pp.juego.utiles.Opciones;
import java.util.ArrayList;
import juego_fernando_lamas_ifts_diesciseis.Entidad.Lugar.LugarBase;

/**
 *
 * @author Fernando Lamas
 */
public class ListaDeItems {
    
        public LugarBase ubicacionActual;
        
            //UNA SIMPLE LISTA QUE CUANDO AGARRA UN ITEM LO AGREGA A LA LISTA
        //CON FUNCIONES DE YAPA PARA QUE ANDEN LOS ITEMS EN LAS PELEAS
        
        //se trata de una lista vacia que se le van agregando 
        //items a medida que se elijan las opciones
        private ArrayList<String> items;
        
        
        public ListaDeItems(){
            
        }
        
        public boolean existe(String item){
            if(!(this.items.contains(item))){
                    IOBase.mostrarTexto("No se encontro el item que buscabas en EntidadHumana");
                    return false;
                }else{
                    return true;
                }
            
        }
	
	public void agregarItem(String item) {
            if(!(item.isEmpty())){
                    items.add(item);
                    IOBase.ingresarTexto("El item fue agregado exitosamente");
            }else{
                IOBase.mostrarTexto("Me estas dando un " + item + " null");
            }
                    
        
        
        }
	
	public void eliminarItem(String item) {
                    this.items.add(item);
                    IOBase.ingresarTexto("El item fue eliminado exitosamente");
	}
	
	
	public boolean buscarPorElItem(String item) {
		if(this.items.contains(item)) {
			return true;
		}
		else {
                    IOBase.ingresarTexto("El item que buscas no esta en la lista");
			return false;
		}
	}
        //devuelve una lista de items listos para interactuar
        public Opciones itemsListosParaInteractuar(){
            Opciones itemListos = new Opciones();
            for(int i = 0; i > items.size(); i++){
                if(!(items.get(i).isEmpty()))
                itemListos.agregar("" + i + "",items.get(i));
                
            }return itemListos;
        }
        /*
        public void usarItem(String item){
            if(itemEstaEnLaLista(item)){
                switch(item){
                    
                }
            }
        }
        */

}

