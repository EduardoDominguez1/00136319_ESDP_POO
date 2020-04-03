package com.ESDP.x00136319;

import javax.swing.*;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        ArrayList<Item> PersonalItems = new ArrayList<>();
        ArrayList<Item> CommonItems = new ArrayList<>();
        int op = 0;
        int wheight, reuseTime,  amount, time,levelint;
        String name, description, level, type,wieldType;
        double speed, damage;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, mostarMenu()));

            switch (op) {
                case 1:
                    //Agregados en PersonalItems por defecto
                    int tipo = Integer.parseInt(JOptionPane.showInputDialog(null, "Que tipo de item agregara? \n" +
                            "1) Healt Item\n" +
                            "2) Reusable Item\n"));
                    if(tipo==1){
                        int tipoHeal = Integer.parseInt(JOptionPane.showInputDialog(null,"Que tipo de Heal Item agregara? \n" +
                                "1)Potion\n" +
                                "2)Elixir\n"));
                        if(tipoHeal==1){

                        }else if(tipoHeal==2){

                        }else{
                            JOptionPane.showMessageDialog(null, "Ingrese una opción valida");
                        }
                    }else if(tipo==2){
                        int tipoRI = Integer.parseInt(JOptionPane.showInputDialog(null,"Que tipo de Reusable Item agregara? \n" +
                                "1)Ammo\n" +
                                "2)Weapon\n"));
                        if(tipoRI==1){

                        }else if(tipoRI==2){

                        }else{
                            JOptionPane.showMessageDialog(null, "Ingrese una opción valida");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Ingrese una opción valida");
                    }
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
                    JOptionPane.showMessageDialog(null, "Ingrese una opción valida");
            }
        }while(op!=100);
    }

    static String mostarMenu(){
        return  "1) Agregar Item \n" +
                "2) Compartir Item \n" +
                "3) Buscar ítem por ID\n" +
                "4) Buscar ítem por tipo\n" +
                "5) Borrar ítem por ID \n" +
                "6) Borrar ítem por tipo \n" +
                "7) Cerrar programa";
    }
     static void compartirItem(){
//se buscará un ítem por ID en PersonalItems y se duplicará a la lista llamada CommonItems.
    JOptionPane.showMessageDialog(null, "Compartiendo item");
    }
    static void BuscarItemID(){
// forEach de ArrayList, al encontrar el ítem mostrar todos sus valores. Deberá darle la opción al usuario en cual de las dos listas desea buscar.
            JOptionPane.showMessageDialog(null, "Buscando por ID");

    }
    static void BuscarItemTipo(){
//ArrayList, utilizar instanceof para verificar el tipo. Deberá darle la opción al usuario en cual de las dos listas desea buscar.
            JOptionPane.showMessageDialog(null, "Buscando por tipo");
    }
    static void BorrarItemID(){
//Utilizar el método removeIf de ArrayList para eliminar un ítem por ID. Deberá darle la opción al usuario en cual de las dos listas desea eliminar.
            JOptionPane.showMessageDialog(null, "Borrando item por ID");
    }
    static void BorrarItemTipo(){
//Utilizar el método removeIf de ArrayList para eliminar un ítem por tipo usando instanceof. Deberá darle la opción al usuario en cual de las dos listas desea eliminar.
            JOptionPane.showMessageDialog(null, "Borrando item por tipo");
    }

}
