package com.company;
import java.util.Random;

public class Jugadores {

    //varialbles de la clase jugador
    private String nombre;
    private int diners;
    private int CaraMoneda;
    private Random rand = new Random();

    //contructor
    public Jugadores(){

    }

    //muestra el valor de la cantidad de dinero que tiene el jugador
    public int getDiners() {
        return diners;
    }

    //muestra el nombre del jugador
    public String getNombre() {
        return nombre;
    }

    //muestra la cara de mneda que escogio el jugador
    public int getCaraMoneda() {
        return CaraMoneda;
    }

    //nos da una nueva cantidad de dinero de un jugador
    public final int SetDiners() {
        diners= (int)(Math.random()*(200)+1);
        return diners;
    }

    //nos da una nueva cara de la moneda de forma aleatoria para un jugador
    public final int SetCara() {
        CaraMoneda= (int) (Math.random()*(2)); //genera numero entre 0 y 1
        return CaraMoneda;
    }

    //nos da un nombre pa un jugador
    public final String SetNombre() {
        int i= (int) (Math.random()*(100)+1);
        int j= (int) (Math.random()*(100)+1);
        nombre = String.format("Participant_%s", i+j);
        return nombre;
    }
}



