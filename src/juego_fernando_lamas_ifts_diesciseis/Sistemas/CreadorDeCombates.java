/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Sistemas;

import ifts16.pp.juego.sistemas.IOBase;
import ifts16.pp.juego.sistemas.Sistema;
import ifts16.pp.juego.utiles.Opcion;
import ifts16.pp.juego.utiles.Opciones;
import java.awt.Color;
import java.util.Random;
import juego_fernando_lamas_ifts_diesciseis.Entidad.EntidadHumana;
import juego_fernando_lamas_ifts_diesciseis.Entidad.Viviente.VivienteEnemigo;

/**
 *
 * @author Heresy
 */
public class CreadorDeCombates extends Sistema{
    
    public static EntidadHumana per;
    public static VivienteEnemigo ene;

    
    public static void nuevaLucha(EntidadHumana p, VivienteEnemigo e) throws InterruptedException{
        per = p;
        ene = e;
        
        Opciones ops = new Opciones("Que estilo prefieres usar?");
        ops.agregar("fibonacci", "Fibonacci");
        ops.agregar("ruleta rusa", "Ruleta Rusa");
        ops.agregar("lejano oeste", "Lejano oeste");
        ops.agregar("ya fue", "A los guantasos");
        Opcion eleccion = IOBase.elegirOpcion(ops);
        IOBase.mostrarTexto("Eligio: " + eleccion.getTexto());
        realizarAccion(eleccion);
    }   
    
        public static void realizarAccion(Opcion op) throws InterruptedException {
        switch (op.getComando()) {
            case "fibonacci":
                luchaFibonacci(per, ene);
                break;
            case "ya fue":
                aLosGuantasos(per, ene);
                break;
            case "ruleta rusa":
                ruletaRusa(per, ene);
                break;
            case "lejano oeste":
                lejanoOeste(per,ene);
                break;
            default:
                aLosGuantasos(per, ene);
                break;
        }
    }
    
    public static String luchaFibonacci(EntidadHumana p,VivienteEnemigo e) throws InterruptedException{
        
        if(!(p.getActividad() == true && e.getActividad() == true)){
            String condicion = IOBase.ingresarTexto("Ambas entidades tienen que estar activas para poder pelear +"
                    + "Ingrese cualquier tecla para continuar");
            return condicion;
        }else{
            String ganador = null;
            // ||Do the Fibonacci||
            int A = 0;
            int B = 1;
            int C;
            
            IOBase.borrar();
            IOBase.mostrarTexto("¡The battle begins!", Color.red, Color.white);
            Thread.sleep(1500);
            
            while(ganador == null){
                IOBase.borrar();
                IOBase.mostrarTexto("En este encuentro se enfrentaran " + p.getNombre() + " vs " + e.getNombre());
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
                    p.Saludable.daniar(1);
                    IOBase.mostrarTexto("Ingrese cualquier letra para continuar");
                    IOBase.mostrarTexto("EQUIVOCADO!! Perdiste un punto de vida");
                    IOBase.ingresarTexto("Tu salud actual es " + p.Saludable.saludActual());
                    
                    
                    
                }else{
                    IOBase.borrar();
                    e.Saludable.daniar(1);
                    IOBase.mostrarTexto("Ingrese cualquier letra para continuar");
                    IOBase.mostrarTexto("CORRECTO! Has daniado en 1 al enemigo");
                    IOBase.ingresarTexto("Le quedan a " + e.getNombre() + " " + e.Saludable.saludActual() + " puntos de vida");
                    
                    
                    A = B;
                    B = C;
                }
                
             if(e.Saludable.saludActual() == 0){
                 ganador = IOBase.ingresarTexto("El ganador de la pelea es " + p.getNombre());
                 return ganador;
             }
             if(p.Saludable.saludActual() == 0){
                 ganador = IOBase.ingresarTexto("El ganador de la pelea es " + e.getNombre());
                 IOBase.mostrarTexto("HAS PERDIDO");
                 return ganador;
             }   
            }
            
        }
        String metioCualquierCosa = IOBase.ingresarTexto("Ingrese entidades validas");
        return metioCualquierCosa;
    }
    
    public static String aLosGuantasos(EntidadHumana p, VivienteEnemigo e) throws InterruptedException{
        
        
        if(!(p.getActividad() == true && e.getActividad() == true)){
            String condicion = IOBase.ingresarTexto("Ambas entidades tienen que estar activas para poder pelear +"
                    + "Ingrese cualquier tecla para continuar");
            return condicion;
            
        }else{
            
        String ganador = null;
        IOBase.borrar();
        IOBase.mostrarTexto("¡The battle begins!", Color.red, Color.white);
        
        Thread.sleep(1500);

        while(ganador == null){
            IOBase.borrar();
            IOBase.mostrarTexto("Escribe la palabra identicamente a como aparece");
            IOBase.ingresarTexto("Estas listo?");
            Thread.sleep(1500);
            String guanteado = null;
            while(guanteado == null){
            IOBase.borrar();
            IOBase.mostrarTexto("");
            IOBase.mostrarTexto("");
            IOBase.mostrarTexto("");
            Random azar = new Random();
            int salio = azar.nextInt(6);
            switch(salio){
                case 1:
                    
                    String resultado = IOBase.ingresarTexto("gUAntAsOs");
                    
                    if(!("gUAntAsOs".equals(resultado))){
                    IOBase.borrar();
                    p.Saludable.daniar(1);
                    IOBase.mostrarTexto("Ingrese cualquier letra para continuar");
                    IOBase.mostrarTexto("EQUIVOCADO!! Perdiste un punto de vida");
                    IOBase.ingresarTexto("Tu salud actual es " + p.Saludable.saludActual());
                    }else{
                    e.Saludable.daniar(1);
                    IOBase.borrar();
                    IOBase.mostrarTexto("Ingrese cualquier letra para continuar");
                    IOBase.mostrarTexto("CORRECTO! Has daniado en 1 al enemigo");
                    IOBase.ingresarTexto("Le quedan a " + e.getNombre() + " " + e.Saludable.saludActual() + " puntos de vida");
                    }
                    
                    break;
                
                case 2:
                    
                    String resultado1 = IOBase.ingresarTexto("gUANTASOS");
                    
                    if(!("gUANTASOS".equals(resultado1))){
                    IOBase.borrar();
                    p.Saludable.daniar(1);
                    IOBase.mostrarTexto("Ingrese cualquier letra para continuar");
                    IOBase.mostrarTexto("EQUIVOCADO!! Perdiste un punto de vida");
                    IOBase.ingresarTexto("Tu salud actual es " + p.Saludable.saludActual());
                    }else{
                    e.Saludable.daniar(1);
                    IOBase.borrar();
                    IOBase.mostrarTexto("Ingrese cualquier letra para continuar");
                    IOBase.mostrarTexto("CORRECTO! Has daniado en 1 al enemigo");
                    IOBase.ingresarTexto("Le quedan a " + e.getNombre() + " " + e.Saludable.saludActual() + " puntos de vida");
                    }
                    
                    break;
                
                case 3:
                    
                    String resultado2 = IOBase.ingresarTexto("gUANTASOS");
                    
                    if(!("gUANTASOS".equals(resultado2))){
                    IOBase.borrar();
                    p.Saludable.daniar(3);
                    IOBase.mostrarTexto("Ingrese cualquier letra para continuar");
                    IOBase.mostrarTexto("EQUIVOCADO!! Perdiste un punto de vida");
                    IOBase.ingresarTexto("Tu salud actual es " + p.Saludable.saludActual());
                    }else{
                    e.Saludable.daniar(3);
                    IOBase.borrar();
                    IOBase.mostrarTexto("Ingrese cualquier letra para continuar");
                    IOBase.mostrarTexto("CORRECTO! Has daniado en 1 al enemigo");
                    IOBase.ingresarTexto("Le quedan a " + e.getNombre() + " " + e.Saludable.saludActual() + " puntos de vida");
                    }
                    break;
                
                case 4:
                    
                    String resultado3 = IOBase.ingresarTexto("SOSATNAUG");
                    
                    if(!("SOSATNAUG".equals(resultado3))){
                    IOBase.borrar();
                    p.Saludable.daniar(1);
                    IOBase.mostrarTexto("Ingrese cualquier letra para continuar");
                    IOBase.mostrarTexto("EQUIVOCADO!! Perdiste un punto de vida");
                    IOBase.ingresarTexto("Tu salud actual es " + p.Saludable.saludActual());
                    }else{
                    e.Saludable.daniar(1);
                    IOBase.borrar();
                    IOBase.mostrarTexto("Ingrese cualquier letra para continuar");
                    IOBase.mostrarTexto("CORRECTO! Has daniado en 1 al enemigo");
                    IOBase.ingresarTexto("Le quedan a " + e.getNombre() + " " + e.Saludable.saludActual() + " puntos de vida");
                    }
                    break;
                    
                case 5:
                    
                    String resultado4 = IOBase.ingresarTexto("lapizjapones");
                    
                    if(!("lapizjapones".equals(resultado4))){
                    IOBase.borrar();
                    p.Saludable.daniar(1);
                    IOBase.mostrarTexto("Ingrese cualquier letra para continuar");
                    IOBase.mostrarTexto("EQUIVOCADO!! Perdiste un punto de vida");
                    IOBase.ingresarTexto("Tu salud actual es " + p.Saludable.saludActual());
                    }else{
                    e.Saludable.daniar(1);
                    IOBase.borrar();
                    IOBase.mostrarTexto("Ingrese cualquier letra para continuar");
                    IOBase.mostrarTexto("CORRECTO! Has daniado en 1 al enemigo");
                    IOBase.ingresarTexto("Le quedan a " + e.getNombre() + " " + e.Saludable.saludActual() + " puntos de vida");
                    }
                    break;
                    
                default:
                    
                    String resultado5 = IOBase.ingresarTexto("Guantasos");
                    
                    if(!("Guantasos".equals(resultado5))){
                    IOBase.borrar();
                    p.Saludable.daniar(1);
                    IOBase.mostrarTexto("Ingrese cualquier letra para continuar");
                    IOBase.mostrarTexto("EQUIVOCADO!! Perdiste un punto de vida");
                    IOBase.ingresarTexto("Tu salud actual es " + p.Saludable.saludActual());
                    }else{
                    e.Saludable.daniar(1);
                    IOBase.borrar();
                    IOBase.mostrarTexto("Ingrese cualquier letra para continuar");
                    IOBase.mostrarTexto("CORRECTO! Has daniado en 1 al enemigo");
                    IOBase.ingresarTexto("Le quedan a " + e.getNombre() + " " + e.Saludable.saludActual() + " puntos de vida");
                    }
                    break;
                    
                    
                    
            }
            if(e.Saludable.saludActual() == 0){
                 ganador = IOBase.ingresarTexto("El ganador de la pelea es " + p.getNombre());
                 guanteado = "si";
                 return ganador;
             }
             if(p.Saludable.saludActual() == 0){
                 ganador = IOBase.ingresarTexto("El ganador de la pelea es " + e.getNombre());
                 IOBase.mostrarTexto("HAS PERDIDO");
                 return ganador;
             }   
             if(!(ganador == null)){
                 IOBase.ingresarTexto("Si estas viendo esto hay un error en el codigo");
                 guanteado = "termina yaaa";
                 return guanteado;
            }
        }
        }
        String metioCualquierCosa = IOBase.ingresarTexto("Ingrese entidades validas");
        return metioCualquierCosa;
    }
    }
    

    public static String ruletaRusa(EntidadHumana p,VivienteEnemigo e){
        return IOBase.ingresarTexto("En construccion");
    }
    
    public static String lejanoOeste(EntidadHumana p, VivienteEnemigo e){
        return IOBase.ingresarTexto("En construccion"); 
    }
    
}
