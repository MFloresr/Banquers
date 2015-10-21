package com.company;
import java.util.List;

public class Main {

    public static final int CANTIDAD_JUGADORES = 200;

    public static void main(String[] args) {

        //creamos las varialbes principales
        Juego partidaNueva= new Juego();
        List<Jugadores> participantes = partidaNueva.crearjugadores(CANTIDAD_JUGADORES);
        int premio = partidaNueva.darPremio(participantes);

        //aqui empiesa el programa
        System.out.println("El premio es de : "+ premio);

        int partida= 1;
        while(partidaNueva.EsGanador(participantes)!= true){//mientras no hay ganador que vaya haciendo
            System. out.println("RONDA "+partida);
            partida ++;
            partidaNueva.SumaCarascara(participantes);
            partidaNueva.borrarBanquero(participantes);
            for(int i=0;i<participantes.size();i++){
                participantes.get(i).SetCara();//volvemos a tirar moneda para cada jugador
            }

        }

        //damos el premio
        partidaNueva.ganador(participantes,premio);

    }

}
