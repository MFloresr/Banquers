package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static final int CANTIDAD_JUGADORES = 200;

    public static void main(String[] args) {
        List<Jugadores> jugadores= new ArrayList<>(Arrays.asList(
                new Jugadores("Jose", 200,0),
                new Jugadores("Mario", 100,1),
                new Jugadores("Manuel", 300,1),
                new Jugadores("Juan", 200,0),
                new Jugadores("Miguel", 200,0),
                new Jugadores("Juanjo", 200,0),
                new Jugadores("Pedro", 100,1)));


        Juego partidaNueva= new Juego();
        List<Jugadores> participantes = partidaNueva.crearjugadores(CANTIDAD_JUGADORES);

        while(partidaNueva.EsGanador(participantes)!= true){
            partidaNueva.SumaCarascara(participantes);
            partidaNueva.borrarBanquero(participantes);

        }



        //System.out.println(participantes.size());
       /* for(int i =0;i<participantes.size();i++){
            System.out.println(participantes.get(i).getNombre()+" "+participantes.get(i).getCaraMoneda()+" "+participantes.get(i).getMoneda());
        }*/
    }

}
