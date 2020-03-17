package com.ESDP.x00136319;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Labo 01");
        System.out.println("Ejercicio 02");

        System.out.println("Detector de palabras palindromes");
        System.out.println("True = palindrome, False = No es palindrome");
        System.out.println(palindrome());
    }
    static boolean palindrome() {
        boolean Pal = true;
        System.out.println("Ingrese una palabra");
        Scanner scan = new Scanner(System.in);
        String palabra = scan.nextLine();

        int fin = palabra.length() - 1;
        int ini = 0;

        int tamano = palabra.length();
        for (int i = 0; i < tamano; i++) {
            if (palabra.charAt(i) != palabra.equalsIgnoreCase(palabra.charAt(tamano - i - 1)))
                Pal = false;
        }
        return Pal;
    }
}
