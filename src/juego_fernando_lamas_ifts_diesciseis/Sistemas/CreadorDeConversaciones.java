/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Sistemas;

import ifts16.pp.juego.sistemas.IOBase;
import ifts16.pp.juego.utiles.Opcion;
import ifts16.pp.juego.utiles.Opciones;
import java.awt.Color;
import juego_fernando_lamas_ifts_diesciseis.Entidad.EntidadHumana;
import juego_fernando_lamas_ifts_diesciseis.Entidad.ListaDeItems;
import juego_fernando_lamas_ifts_diesciseis.Entidad.Lugar.LugarBase;
import juego_fernando_lamas_ifts_diesciseis.Entidad.Viviente.Viviente;

/**
 *
 * @author Heresy
 */
public class CreadorDeConversaciones {
    
    public static LugarBase Entrada;
    public static ListaDeItems Inventario;
    
    
        public static void inicioConversacion(EntidadHumana p, Viviente v){
            
            Opciones ops = new Opciones("Conversa con " + v.getNombre());
            ops.agregar("saludar", "Hola como andas? en que aula estan?");
            ops.agregar("hora", "Disculpa que hora es?");
            
            Opcion eleccion = IOBase.elegirOpcion(ops);
            IOBase.mostrarTexto("Eligio: " + eleccion.getTexto());
            realizarCharla(eleccion, p, v);
        }
    
        public static void realizarCharla(Opcion op, EntidadHumana p, Viviente v){
            switch(op.getComando()){
                case "saludar":
                    saludoConver(p,v);
                    break;
                case "hora":
                    horaConver(p,v);
                    break;
            }
        }
        
       public static void saludoConver(EntidadHumana p, Viviente v){
            if(Inventario.buscarPorElItem("bigote_falso")){
                IOBase.mostrarTexto("Bien, estan en el aula de 4to", Color.blue, Color.white);
            }else{
                IOBase.mostrarTexto("Quien sos vos flaco? tomatela por que te cago a trompadas", Color.red, Color.white);
                Opciones desicion = new Opciones("Toma una desicion...");
                desicion.agregar("pelear", "Cagarlo a trompadas");
                desicion.agregar("tomatela", "Tirar la de humo");
                
                Opcion eleccion = IOBase.elegirOpcion(desicion);
                if(eleccion.esComando() && eleccion.getComando().equals("pelear")){
                    pelearConReceptor(p, v);
                }else{
                    Navegacion.irAVecino(Entrada);
                }
            }
        }
        public static void pelearConReceptor(EntidadHumana p,Viviente v){
            
        }
         
        
       public static void horaConver(EntidadHumana p, Viviente v){
           
       }
}
