package com.ESDP.x00136319;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        ArrayList<herramientasMinecraft> ListaHerramientas = new ArrayList<>();
        String tool, mat;
        int select = 0, attack, durability, Dps;

        do{
            byte op = sca.nextByte(); sca.nextLine();
            switch(op){
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(select!=1);
    }
}
