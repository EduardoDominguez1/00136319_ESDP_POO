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
        boolean Pal = false;
        System.out.println("Ingrese una palabra");
        Scanner scan = new Scanner(System.in);
        String palabra = scan.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(palabra);

        if (sb.reverse().toString().equalsIgnoreCase(palabra))
            Pal = true;
        return Pal;
    }
}
