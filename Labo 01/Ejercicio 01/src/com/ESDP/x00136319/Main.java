package com.ESDP.x00136319;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Labo 01");
        System.out.println("Ejercicio 01");
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el valor hasta el que se aplicara la serie Fibonacci");

        int n = scan.nextInt();
        scan.nextLine();
        int fibo = 1;
        int fibo2 = 2;
        int aux = 0;

        for(int i = 0; i < n; i++){
            System.out.println(fibo);
            aux = fibo + fibo2;
            fibo = fibo2;
            fibo2 = aux;
        }
    }
}
