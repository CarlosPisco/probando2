import beans.Equipo;
import beans.Jugador;
import controller.AppController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        ArrayList<Equipo> listaEquipos = new ArrayList<>();
        ArrayList<Jugador> listaJugadores = new ArrayList<>();
        AppController ac = new AppController();


        bucle:
        while(true){
            System.out.println("\n+++++++++++++++++++++++++++++++");
            System.out.println("1 <- Registrar Nuevo Equipo");
            System.out.println("2 <- Registrar Nuevo Jugador");
            System.out.println("3 <- Lista de jugadores x salario");
            System.out.println("4 <- Lista de Equipos");
            System.out.println("9 <- Salir");
            System.out.print("Ingrese Opcion: ");
            switch (sc.nextLine()){

                case "1" ->{
                    System.out.println("Registrar nuevo equipo");
                    ac.registrarNuevoEquipo(listaEquipos);
                }
                case "2" ->{
                    System.out.println("Registrar nuevo jugador");
                    ac.registrarNuevoJugador(listaJugadores);


                }
                case "3" ->{
                    System.out.println("Lista de jugadores x salario");
                    ac.listarJugadoresXSalario(listaJugadores);
                }
                case "4" ->{
                    System.out.println("Lista de Equipos");
                    ac.listarEquipos(listaEquipos);
                }


                case "9" -> {
                    System.out.println("---Cerrando programa---");
                    break bucle;
                }
                default -> {
                    System.out.println("Ingrese una opcion valida");
                }
            }



        }



    }
}