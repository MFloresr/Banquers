package com.company;

import java.util.Random;

/**
 * Created by Vipi on 13/10/2015.
 */
public class Jugadores {
    private String nombre;
    private int diners;
    private int CaraMoneda;
    private Random rand = new Random();


    public Jugadores(String nombre,int diners, int CaraMoneda){
        this.nombre=nombre;
        this.diners=diners;
        this.CaraMoneda=CaraMoneda;
    }
    public Jugadores(){

    }
    public int TirarMoneda(){
        int CaraMoneda = rand.nextInt(1);
        return CaraMoneda;
    }

    public int getMoneda() {
        return diners;
    }

    public void setMoneda(int moneda) {
        this.diners = moneda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCaraMoneda() {
        return CaraMoneda;
    }

    public void setCaraMoneda(int caraMoneda) {
        CaraMoneda = caraMoneda;
    }
}
