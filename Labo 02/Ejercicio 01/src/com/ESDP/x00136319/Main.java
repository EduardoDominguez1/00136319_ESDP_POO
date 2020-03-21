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
        do {
            mostrarMenu();
            System.out.print("Seleccione una opcion: ");
            byte op = sca.nextByte();
            sca.nextLine();
            switch (op) {
                case 1:
                    System.out.println("Herramienta: ");
                    System.out.println("Hacha, Pico, Espada, Pala, Azada");
                    tool = sca.nextLine();

                    System.out.println("Material:");
                    System.out.println("Diamante, Oro, Hierro, Piedra, Madera");
                    mat = sca.nextLine();

                    System.out.print("Ataque: ");
                    attack = sca.nextDouble();
                    sca.nextLine();
                    System.out.print("Durabilidad: ");
                    durability = sca.nextDouble();
                    sca.nextLine();
                    System.out.print("Dps: ");
                    Dps = sca.nextDouble();
                    sca.nextLine();

                    ListaHerramientas.add(new herramientasMinecraft(tool, mat, attack, durability, Dps));
                    break;
                case 2:
                    System.out.println("Mostrando Herramientas actuales");
                    System.out.println(ListaHerramientas.toString());
                    break;
                case 3:
                    System.out.println("Consultar un solo tipo de herramientas. . . ");
                    if (ListaHerramientas.size() == 0) {
                        System.out.println("No se encuentran Herramientas");
                        System.out.println("Añada Herramientas\n");
                    }
                    else {
                        System.out.println("Digite el Tipo: ");
                        System.out.println("Hacha, Pico, Espada, Pala, Azada");
                        tool = sca.nextLine();
                        String tipoAgain = tool;
                        for (int i = 0; i < ListaHerramientas.size(); i++) {
                            if (ListaHerramientas.get(i).getTipo().equals(tipoAgain)) {
                                ListaHerramientas.get(i).mostrardatos();
                            }
                        }
                    }
                    break;
                    case 4:
                        ListaHerramientas.forEach(s -> {
                            s.ChopMats();
                        });
                        break;
                        case 5:
                            ListaHerramientas.forEach(s -> {
                                s.AttackMob();
                            });
                            break;
                            case 6:
                                salir = 1;
                                break;
                                default:
                                    System.out.println("Opcion no valida");
                                break;
            }
        }while (salir != 1) ;
    }
    public static void mostrarMenu () {
        System.out.println("--------------------------------------");
        System.out.println("1) Agregar una herramienta");
        System.out.println("2) Consultar todas las herramientas");
        System.out.println("3) Consultar solo un tipo de herramientas");
        System.out.println("4) Talar/Picar un bloque");
        System.out.println("5) Atacar un enemigo");
        System.out.println("6) Salir");
        System.out.println("--------------------------------------");
    }
}
