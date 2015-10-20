package com.company;

import com.company.Jugadores;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * Created by Vipi on 13/10/2015.
 */
public class Juego {
    private int cara;
    private int cruz;

    public List<Jugadores> crearjugadores(int cantidadJugadores){
        ArrayList<Jugadores> participantes = new ArrayList<Jugadores>();
        for (int i =0;i<cantidadJugadores;i++){
            Jugadores participante =new Jugadores();
            String nombre= participante.DarNombre();
            int dinero= participante.DarDinero();
            int Cara=participante.DarCara();
            participantes.add(participante);
        }
        return participantes;
    }
    public void SumaCarascara (List<Jugadores> jugadores){//EL FOR SE TIENE QUE HACER AL REVES
        for(int i=0;i<jugadores.size();i++){//TODO
            if(jugadores.get(i).getCaraMoneda()== 0){
                cara++;
            }else{
                cruz++;
            }
        }
        System.out.println("Cara : "+cara);
        System.out.println("Cruz : "+cruz);
        
    }
    public void borrarBanquero(List<Jugadores> jugadores) {

        if (cara>cruz) {
            for (int i=jugadores.size()-1;i>=0;i--) {
                if(jugadores.get(i).getCaraMoneda()==0){
                    jugadores.remove(i);
                }
            }

            System.out.println("Borramos Cara");
        }else{
            for (int i=jugadores.size()-1;i>=0;i--) {
                if(jugadores.get(i).getCaraMoneda()==1){
                    jugadores.remove(i);
                }
            }
            System.out.println("Borramos Cruz");
        }

    }
    public void jugar(List<Jugadores> jugadores){
        for(int i=0;i<jugadores.size();i++){

        }
    }
    public boolean EsGanador(List<Jugadores> jugadores) {
        if (jugadores.size() == 2) {
            return true;
        } else if (jugadores.size() == 1) {
            return true;
        }
        System.out.println("Aun hay mas de 2 jugadores");
        return false;
    }

}
