package com.company;

import com.company.Jugadores;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Iterator;
import java.util.List;


/**
 * Created by Vipi on 13/10/2015.
 */
public class Juego {
    private int cara;
    private int cruz;
    
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
            for (Iterator<Jugadores> it = jugadores.iterator(); it.hasNext();) {
                Jugadores j = it.next();
                if(j.getCaraMoneda()== 0){
                    it.remove();
                }
                //jugadores.remove(jugadores.get(i).getCaraMoneda() == 0);
            }
            System.out.println("Borramos Cara");
        }else{
            for(int i=0;i<jugadores.size();i++){
                jugadores.remove(jugadores.get(i).getCaraMoneda() == 1);
            }
            System.out.println("Borramos Cruz");
        }

    }
    private boolean EsGanador(List<Jugadores> jugadores) {
        if (jugadores.size() == 2) {
            return true;
        } else if (jugadores.size() == 1) {
            return true;
        }
        return false;
    }

}
