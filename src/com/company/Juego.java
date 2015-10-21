package com.company;
import java.util.ArrayList;
import java.util.List;

public class Juego {
    private int cara = 0;
    private int cruz = 0;
    private int premio;

    //nos crea los jugadores en una lista
    public List<Jugadores> crearjugadores(int cantidadJugadores){
        ArrayList<Jugadores> participantes = new ArrayList<Jugadores>();
        for (int i =0;i<cantidadJugadores;i++){
            Jugadores participante =new Jugadores();
            String nombre= participante.SetNombre();
            int dinero= participante.SetDiners();
            int Cara=participante.SetCara();
            participantes.add(participante);
        }
        return participantes;
    }

    //nos suma las caras de las moneda
    public void SumaCarascara (List<Jugadores> jugadores){
        if (cara !=0 ||cruz !=0) {
            cara = 0;
            cruz = 0;
        }
        for(int i=0;i<jugadores.size();i++){
            if(jugadores.get(i).getCaraMoneda()== 0){
                cara++;
            }else{
                cruz++;
            }
        }
        System.out.println("Cara : "+cara);
        System.out.println("Cruz : "+cruz);
        
    }

    /*nos comprueva que las caras y las cruces no sean iguales
      si cara o cruz es mas grande nos borra el que tenga mas
      nos comprueva que si de una cara ahi 0 nos vuelva a tirar*/
    public void borrarBanquero(List<Jugadores> jugadores) {
        if(cara==cruz ||cruz ==0||cara==0){
            for(int i=0;i<jugadores.size();i++){
                jugadores.get(i).SetCara();
            }
        }
        if (cara>cruz) {
            for (int i=jugadores.size()-1;i>=0;i--) {
                if(jugadores.get(i).getCaraMoneda()==0){
                    jugadores.remove(i);
                }
            }

            System.out.println("Borramos Cara");
        }if(cruz>cara){
            for (int i=jugadores.size()-1;i>=0;i--) {
                if(jugadores.get(i).getCaraMoneda()==1){
                    jugadores.remove(i);
                }
            }
            System.out.println("Borramos Cruz");
        }

    }

    //aqui nos dice si la lista contiene 1 o 2 jugadores si se cumple tenemos ganador
    public boolean EsGanador(List<Jugadores> jugadores) {
        if (jugadores.size() == 2) {
            return true;
        } else if (jugadores.size() == 1) {
            return true;
        }
        return false;
    }

    //aqui repartimos el premio en cas de haver 2 ganadores se divide el premio en 2
    public int darPremio(List<Jugadores> jugadores){
        for(int i=0;i<jugadores.size();i++){
            premio =premio+jugadores.get(i).getDiners();
        }
        return premio;
    }

    //aqui mostramos por pantalla el ganador o los ganadores
    public void ganador(List<Jugadores> jugadores,int premio){
        if (jugadores.size()==2){
            System.out.println("El premio se divide en 2" );
            premio=premio/2;
            for(int i =0;i<jugadores.size();i++){
                System.out.println("el Jugador "+jugadores.get(i).getNombre()+" se lleva "+ premio);
            }
        }if (jugadores.size()==1){
            System.out.println("El jugador  : "+jugadores.get(0).getNombre()+" se lleva "+premio);
        }
    }
}
