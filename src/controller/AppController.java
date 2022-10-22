package controller;

import beans.Equipo;
import beans.Jugador;

import java.util.ArrayList;
import java.util.Scanner;

public class AppController {

    Scanner sc = new Scanner(System.in);
    //boolean existName = false;


    public void registrarNuevoEquipo (ArrayList<Equipo> lista){
        Equipo equipo = new Equipo();

        System.out.println("------------------------");


        while(true){
            boolean i = true;
            System.out.print("Nombre: ");
            String nameTeam = sc.nextLine();
            //equipo.setNombre(sc.nextLine());
            for (Equipo e :lista){
                if(e.getNombre().equalsIgnoreCase(nameTeam)){
                    System.out.println("Error, ya existe el nombre");
                    i = false;
                    break;
                }
            }
            if(i){
                equipo.setNombre(nameTeam);
                break ;
            }
        }
        System.out.print("Pais: ");
        equipo.setPais(sc.nextLine());


        while(true){
            System.out.print("Iniciales: ");
            String inicials = sc.nextLine();
            if(inicials.length()>3){
                System.out.println("Error, el inicial no puede tener mas de 3 caracteres");

            }else{
                equipo.setIniciales(inicials);
                break ;
            }
        }

        System.out.print("Estadio: ");
        equipo.setEstadio(sc.nextLine());
        System.out.print("Tecnico: ");
        equipo.setTecnico(sc.nextLine());
        System.out.print("Presupuesto: ");
        equipo.setPresupuesto(Float.parseFloat(sc.nextLine()));

        lista.add(equipo);

    }

    public void registrarNuevoJugador(ArrayList<Jugador> lista1){
        Jugador jugador = new Jugador();

        System.out.println("----------------------");
        System.out.print("Nombre: ");
        jugador.setNombre(sc.nextLine());
        System.out.print("Posicion: ");
        jugador.setPosicion(sc.nextLine());
        System.out.print("Numero de camiseta: ");
        jugador.setNum_camiseta(Integer.parseInt(sc.nextLine()));
        System.out.print("Edad: ");
        jugador.setEdad(sc.nextLine());



        while(true){
            boolean j = true;
            System.out.print("DNI: ");
            String dni = sc.nextLine();

            for(Jugador player : lista1){
                if(player.getDni().equalsIgnoreCase(dni)){
                    System.out.println("Error, ya existe el dni");
                    j = false;
                    break;
                }

            }
            if(j){
                jugador.setDni(dni);
                break;
            }

        }
        System.out.print("Salario: ");
        jugador.setSalario(Float.parseFloat(sc.nextLine()));


        lista1.add(jugador);



    }


    public void listarEquipos(ArrayList<Equipo> lista2){

        System.out.println("-------------------------------");
        for(Equipo team : lista2){
            System.out.println("Nombre: "+team.getNombre()+" | Pais: "+team.getPais()+" | Iniciales: "+team.getIniciales()+" | Estadio: "+team.getEstadio()+" | Tecnico: "+team.getTecnico()+" | Presupuesto: S/"+team.getPresupuesto());

        }

    }

    public void listarJugadoresXSalario (ArrayList<Jugador> lista3){

        System.out.print("Salario mayor a :");
        float salary = Float.parseFloat(sc.nextLine());

        for(Jugador player : lista3){
            if(player.getSalario()>salary){
                System.out.println("Nombre: "+player.getNombre()+" | Posicion: "+player.getPosicion()+" | Numero de camiseta: "+player.getNum_camiseta()+" | Edad: "+player.getEdad()+" | DNI: "+player.getDni()+" | Salario: S/"+player.getSalario());
            }
        }

    }


}
