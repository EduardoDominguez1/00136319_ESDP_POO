package com.ESDP.x00136319;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    //Realiza un programa que remplace todos los caracteres "a" por un caracter "b" de una cadena de texto luego muestra la cadena modificada.
        Scanner sca = new Scanner(System.in);
        System.out.printf("Ingrese una oracion");
        String Frase = sca.nextLine();
        System.out.println("Cambiando a por b");
        String cambio = Frase.replace("a", "b");
        System.out.println(cambio);
    }
}
