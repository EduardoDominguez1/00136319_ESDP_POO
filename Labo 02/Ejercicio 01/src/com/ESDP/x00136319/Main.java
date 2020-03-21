package com.ESDP.x00136319;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static Scanner sca = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<herramientasMinecraft> ListaHerramientas = new ArrayList<>();
        String tool, mat;
        double salir = 0, attack=0, durability=0, Dps=0;
        do{
            mostrarMenu();
            System.out.print("Seleccione una opcion: ");
            byte op = sca.nextByte();sca.nextLine();
            switch(op){
                case 1:
                    System.out.print("Herramienta:");
                    System.out.println("Hacha, Pico, Espada, Pala, Azada"); tool = sca.nextLine();
                    if(tool == "Hacha")
                        Dps = 1.0;
                    else if(tool == "Pico")
                        Dps = 1.2;
                    else if(tool == "Espada")
                        Dps = 1.6;
                    else if(tool == "Pala")
                        Dps = 1;
                    else if(tool == "Azada")
                        Dps = 3;
                    System.out.println("Material:");
                    System.out.println("Diamante, Oro, Hierro, Piedra, Madera"); mat = sca.nextLine();
                    if(mat == "Diamante")
                        durability = 300;
                    else if(mat == "Oro")
                        durability = 150;
                    else if(mat == "Hierro")
                        durability = 150;
                    else if(mat == "Pierdra")
                        durability = 100;
                    else if(mat == "Madera")
                        durability = 50;
                    System.out.println("Calculando Ataque. . . .");
                    if(tool == "Hacha")
                        attack =+ 10;
                    else if(tool == "Pico")
                        attack =+ 5;
                    else if(tool == "Espada")
                        attack =+ 15;
                    else if(tool == "Pala")
                        attack =+ 4;
                    else if(tool == "Azada")
                        attack =+ 4;
                    else if(mat == "Diamante")
                        attack =+ 15;
                    else if(mat == "Oro")
                        attack =+ 13;
                    else if(mat == "Hierro")
                        attack =+ 10;
                    else if(mat == "Pierdra")
                        attack =+ 5;
                    else if(mat == "Madera")
                        attack =+ 4;
                    ListaHerramientas.add(new herramientasMinecraft(tool, mat, durability, Dps, attack));
                    break;
                case 2:
                    ConsultAllTools();
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
    public static void Material(){
        System.out.println("Material:");
        System.out.println("1) Diamante");
        System.out.println("2) Oro");
        System.out.println("3) Hierro");
        System.out.println("4) Piedra");
        System.out.println("5) Madera");
        System.out.print("Eleccion: ");
    }

    public static void ConsultAllTools(){
        System.out.println("Consultando todas las herramientas");
    }
    public void ConsultToolOneType(){
        System.out.println("Consultar una sola herramienta");
    }

}
