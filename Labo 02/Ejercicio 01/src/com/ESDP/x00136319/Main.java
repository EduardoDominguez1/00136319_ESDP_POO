package com.ESDP.x00136319;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static Scanner sca = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<herramientasMinecraft> ListaHerramientas = new ArrayList<>();
        String tool, mat;
        int salir = 0;
        double attack, durability, Dps;
        do{
            mostrarMenu();
            System.out.print("Seleccione una opcion: ");
            byte op = sca.nextByte();sca.nextLine();
            switch(op){
                case 1:
                    System.out.print("Herramienta:");
                    System.out.println("Hacha, Pico, Espada, Pala, Azada"); tool = sca.nextLine();

                    System.out.println("Material:");
                    System.out.println("Diamante, Oro, Hierro, Piedra, Madera"); mat = sca.nextLine();

                    System.out.print("Ataque: "); attack = sca.nextDouble();sca.nextLine();
                    System.out.print("Durabilidad: ");durability = sca.nextDouble();sca.nextLine();
                    System.out.print("Dps: ");Dps = sca.nextDouble(); sca.nextLine();

                    ListaHerramientas.add(new herramientasMinecraft(tool, mat, attack, durability, Dps));
                    break;
                case 2:
                    ConsultAllTools();
                    System.out.println(ListaHerramientas.toString());
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                salir = 1;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(salir != 1);
    }
    public static void mostrarMenu(){
        System.out.println("--------------------------------------");
        System.out.println("1) Agregar una herramienta");
        System.out.println("2) Consultar todas las herramientas");
        System.out.println("3) Consultar solo 1 herramienta");
        System.out.println("4) Talar/Picar un bloque");
        System.out.println("5) Atacar un enemigo");
        System.out.println("6) Salir");
        System.out.println("--------------------------------------");
    }

    public static void ConsultAllTools(){
        System.out.println("Consultando todas las herramientas. . .");
    }
    public void ConsultToolOneType(){
        System.out.println("Consultar una sola herramienta. . . ");
    }

}
