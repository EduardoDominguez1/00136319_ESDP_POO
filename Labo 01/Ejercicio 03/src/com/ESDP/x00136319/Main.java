package com.ESDP.x00136319;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Realice una funcion recursiva que imprima la siguiente secuencia desde 1 hasta n: si n = 3, 1 2 3 2 1
        System.out.println("Labo 01");
        System.out.println("Ejercicio 03");

        System.out.println("Ingrese el valor de N");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        int x = 1;
        int cont = 1;
        nosejaja(n, x, cont);
    }

    static void nosejaja(int n, int x, int cont) {
        if (x < n && cont < n) {
            System.out.println(x);
            x++;
            cont++;
            nosejaja(n, x, cont);
        }
    }
}