package com.ESDP.x00136319;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Realiza un programa que reciba n letras por teclado y almacene en una lista solo las vocales, mayusculas o minusculas
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el total de letras que ingresara");

        List<Character> vocales = Arrays.asList('a', 'e', 'i', 'o', 'u');
        List<Character> vocalesMayu = Arrays.asList('A', 'E', 'I', 'O', 'U');
        List<Character> LisVocalesMin = new ArrayList<>();
        List<Character> LisVocalesMayu = new ArrayList<>();
        int total = scan.nextInt();
        scan.nextLine();

        System.out.println("Ingrese letras 1 por 1");
        for (int i = 0; i < total; i++) {
            char letra = scan.nextLine().charAt(0);
            if (Character.isAlphabetic(letra) && vocales.contains(letra)) {
                LisVocalesMin.add(letra);
            }
            else if(Character.isAlphabetic(letra) && vocalesMayu.contains(letra)) {
                LisVocalesMayu.add(letra);
            }
        }
        System.out.println("Vocales mayusculas ingresadas");
        System.out.println(LisVocalesMayu);
        System.out.println("Vocales minusculas ingresadas");
        System.out.println(LisVocalesMin);
    }
}