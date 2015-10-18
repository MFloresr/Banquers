package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Jugadores> jugadores= Arrays.asList(
                new Jugadores("Jose", 200,0),
                new Jugadores("Mario", 100,1),
                new Jugadores("Manuel", 300,1),
                new Jugadores("Juan", 200,0),
                new Jugadores("Miguel", 200,0),
                new Jugadores("Juanjo", 200,0),
                new Jugadores("Pedro", 100,1));

        Juego partidaNueva= new Juego();
        partidaNueva.SumaCarascara(jugadores);
        partidaNueva.borrarBanquero(jugadores);
        System.out.println(jugadores.size());
    }

}
