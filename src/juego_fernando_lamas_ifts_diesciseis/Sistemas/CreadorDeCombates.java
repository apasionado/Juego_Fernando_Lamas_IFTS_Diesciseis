/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Sistemas;

import ifts16.pp.juego.sistemas.IOBase;
import ifts16.pp.juego.sistemas.Sistema;
import java.awt.Color;
import juego_fernando_lamas_ifts_diesciseis.Entidad.EntidadHumana;
import juego_fernando_lamas_ifts_diesciseis.Entidad.VivienteEnemigo;

/**
 *
 * @author Heresy
 */
public class CreadorDeCombates extends Sistema{
    

    
    
    public static String nuevaLucha(EntidadHumana p, VivienteEnemigo e){

        if(!(p.getActividad() == true && e.getActividad() == true)){
            String condicion = IOBase.ingresarTexto("Ambas entidades tienen que estar activas para poder pelear +"
                    + "Ingrese cualquier tecla para continuar");
            return condicion;
        }else{
            String ganador;
            int A = 0;
            int B = 1;
            int C;
            
            IOBase.borrar();
            IOBase.mostrarTexto("¡The battle begins!", Color.red, Color.white);
            while(e.Saludable.saludActual() > 0 && p.Saludable.saludActual() > 0){
                //desarrollar sistema de daño que interactue con IOBase.
                IOBase.mostrarTexto("Hora de usar Fibonacci!");
                IOBase.mostrarTexto("");
                IOBase.mostrarTexto("Recuerda que A y B = C donde C es A + B");
                IOBase.mostrarTexto("");
                IOBase.mostrarTexto("Por rondas, para poder atacar, deberas acertar el numero proximo correspondiente");
                IOBase.mostrarTexto("");
                IOBase.mostrarTexto("Partiendo de que A es " + A + " y B es " + B);
                C = IOBase.ingresarEntero("EL RESULTADO ES?");
                if(!(C == A + B)){
                    IOBase.borrar();
                    IOBase.mostrarTexto("Ingrese cualquier letra para continuar");
                    IOBase.ingresarTexto("EQUIVOCADO!! Perdiste un punto de vida");
                    
                    p.Saludable.daniar(1);
                }else{
                    IOBase.borrar();
                    IOBase.mostrarTexto("Ingrese cualquier letra para continuar");
                    IOBase.ingresarTexto("CORRECTO! Has daniado en 1 al enemigo");
                    
                    e.Saludable.daniar(1);
                    A = B;
                    B = C;
                }
                
                
             if(e.Saludable.saludActual() == 0 && p.Saludable.saludActual() > 0){
                 ganador = IOBase.ingresarTexto("El ganador de la pelea es " + p.getNombre());
                 return ganador;
             }else{
                 ganador = IOBase.ingresarTexto("El ganador de la pelea es " + e.getNombre());
                 IOBase.mostrarTexto("HAS PERDIDO");
                 return ganador;
             }   
            }
            
        }
        String metioCualquierCosa = IOBase.ingresarTexto("Ingrese entidades validas");
        return metioCualquierCosa;
    }
    
}
