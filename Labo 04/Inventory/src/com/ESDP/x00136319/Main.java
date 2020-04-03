package com.ESDP.x00136319;

import javax.swing.*;
import java.util.ArrayList;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {

        ArrayList<Item> PersonalItems = new ArrayList<>();
        ArrayList<Item> CommonItems = new ArrayList<>();

        int op = 0;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, mostarMenu()));
            switch (op) {
                case 1:
                    agregarItem();
                    break;
                case 2:
                    compartirItem();
                    break;
                case 3:
                    BuscarItemID();
                    break;
                case 4:
                    BuscarItemTipo();
                    break;
                case 5:
                    BorrarItemID();
                    break;
                case 6:
                    BorrarItemTipo();
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Cerrando el programa . . . .");
                    op = 100;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
            }
        }while(op!=100);
    }
    static String mostarMenu(){
        return  "1) Agregar Item \n" +
                "2) Compartir Item \n" +
                "3) Buscar ítem por ID\n" +
                "4) Buscar ítem por tipo\n " +
                "5) Borrar ítem por ID \n" +
                "6) Borrar ítem por tipo \n" +
                "7) Cerrar programa";
    }
    static void agregarItem(){
//Agregados en PersonalItems por defecto

    }

    static void compartirItem(){
//se buscará un ítem por ID en PersonalItems y se duplicará a la lista llamada CommonItems.
    }
    static void BuscarItemID(){
// forEach de ArrayList, al encontrar el ítem mostrar todos sus valores. Deberá darle la opción al usuario en cual de las dos listas desea buscar.
    }
    static void BuscarItemTipo(){
//ArrayList, utilizar instanceof para verificar el tipo. Deberá darle la opción al usuario en cual de las dos listas desea buscar.
    }
    static void BorrarItemID(){
//Utilizar el método removeIf de ArrayList para eliminar un ítem por ID. Deberá darle la opción al usuario en cual de las dos listas desea eliminar.
    }
    static void BorrarItemTipo(){
//Utilizar el método removeIf de ArrayList para eliminar un ítem por tipo usando instanceof. Deberá darle la opción al usuario en cual de las dos listas desea eliminar.
    }

}
