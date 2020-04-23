package com.ESDP.x00136319;

import javax.swing.*;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        ArrayList<Item> PersonalItems = new ArrayList<>();
        ArrayList<Item> CommonItems = new ArrayList<>();
        int op =0;
        int wheight, reuseTime,  amount, time,levelint, remainingUses;
        String name, description, level, type,wieldType;
        boolean equipped;
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
                                name = JOptionPane.showInputDialog(null, "Ingrese el nombre de la Potion");
                                wheight = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el peso de la Potion"));
                                description = JOptionPane.showInputDialog(null, "Ingrese una breve descripcion del objeto");
                                reuseTime = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cada cuanto puede usar la Potion"));
                                level = JOptionPane.showInputDialog(null, "Ingrese el nivel: (Minor/Normal/Major)");
                                type = JOptionPane.showInputDialog(null, "Ingrese si la Potion es de (Mana o Life)");
                                amount = Integer.parseInt(JOptionPane.showInputDialog(null, "Coloque la cantidad de Potion a ingresar"));
                                PersonalItems.add(new Potion(name,wheight,description,reuseTime,level,type,amount));
                        }else if(tipoHeal==2){
                                name = JOptionPane.showInputDialog(null, "Ingrese el nombre del Elixir");
                                wheight = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el peso del Elixir"));
                                description = JOptionPane.showInputDialog(null, "Ingrese una breve descripcion del objeto");
                                reuseTime = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cada cuanto puede usar el Elixir"));
                                level = JOptionPane.showInputDialog(null, "Ingrese el nivel (Minor/Normal/Major)");
                                type = JOptionPane.showInputDialog(null, "Ingrese si la Potion es de (Mana o Life)");
                                amount = Integer.parseInt(JOptionPane.showInputDialog(null, "Coloque la cantidad de Elixir a ingresar"));
                                time = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tiempo de duracion del Elixir"));
                                PersonalItems.add(new Elixir(name, wheight, description, reuseTime, level, type, amount, time));
                        }else{
                            JOptionPane.showMessageDialog(null, "Ingrese una opción valida");
                        }
                    }else if(tipo==2){
                        int tipoRI = Integer.parseInt(JOptionPane.showInputDialog(null,"Que tipo de Reusable Item agregara? \n" +
                                "1)Ammo\n" +
                                "2)Weapon\n"));
                        if(tipoRI==1){
                            name = JOptionPane.showInputDialog(null, "Ingrese el nombre del Ammo");
                            wheight = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el peso de la Ammo(No decimales)"));
                            description = JOptionPane.showInputDialog(null, "Ingrese una breve descripcion del objeto");
                            remainingUses = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de Usos"));
                            int resp = JOptionPane.showConfirmDialog(null, "Ammo equipada??");
                            if (JOptionPane.OK_OPTION == resp){
                                equipped = true;
                            }
                            else{
                                equipped = false;
                            }
                            PersonalItems.add(new Ammo(name,wheight,description,remainingUses,equipped));
                        }else if(tipoRI==2){
                            name = JOptionPane.showInputDialog(null, "Ingrese el nombre del Arma");
                            wheight = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el peso del Arma"));
                            description = JOptionPane.showInputDialog(null, "Ingrese una breve descripcion del objeto");
                            remainingUses = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de Usos"));
                            type = JOptionPane.showInputDialog(null, "Ingrese el tipo del arma: (Bow, Sword, Staff, Orb, Dagger.)");
                            speed = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la velocidad de ataque del Arma"));
                            damage = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el daño del Arma"));
                            wieldType = JOptionPane.showInputDialog(null, "Ingrese el tipo de sujecion del arma (One-Handed, Two-Handed.)");
                            levelint = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nivel del arma"));
                            PersonalItems.add(new Weapon(name,wheight,description,remainingUses,type,speed,damage,wieldType,levelint));
                        }else{
                            JOptionPane.showMessageDialog(null, "Ingrese una opción valida");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Ingrese una opción valida");
                    }
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Bienvenido a Compartir Item");
                    int CompartirPorID = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la ID del item a Compartir"));
                    PersonalItems.forEach(obj -> {
                        if(obj.getId() == CompartirPorID){
                            CommonItems.add(obj);
                            JOptionPane.showMessageDialog(null,  "Objeto compartido");
                        }else{
                            JOptionPane.showMessageDialog(null, "ID no encontrada");
                        }
                    });
                    break;
                case 3:
                    int decidirDonde = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese en que lista quiere buscar:\n" +
                            "1) PersonalItems\n" +
                            "2) CommonItems"));
                    if(decidirDonde==1){
                        JOptionPane.showMessageDialog(null, "Buscando en lista PersonalItems");
                        int IdBuscar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID a buscar"));
                        PersonalItems.forEach(obj -> {
                            if(obj.getId() == IdBuscar){
                                JOptionPane.showMessageDialog(null, obj.toString());
                            }
                        });
                    }else if(decidirDonde==2){
                        JOptionPane.showMessageDialog(null, "Buscando en lista CommonItems");
                        int IdBuscar2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID a buscar"));
                        CommonItems.forEach(obj->{
                            if(obj.getId() == IdBuscar2){
                                JOptionPane.showMessageDialog(null, obj.toString());
                            }
                        });
                    }else {
                        JOptionPane.showMessageDialog(null, "Ingrese una opción valida");
                    }
                    break;
                case 4:
                    int decidirLista = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese en que lista quiere buscar:\n" +
                            "1) PersonalItems\n" +
                            "2) CommonItems"));
                    if(decidirLista==1){
                        JOptionPane.showMessageDialog(null, "Buscando en lista PersonalItems");
                        int IdBuscar3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Tipo de objeto a buscar\n" +
                                "1)Potion\n" +
                                "2)Elixir\n" +
                                "3)Ammo\n" +
                                "4)Weapon\n"));
                        if(IdBuscar3==1){
                            PersonalItems.forEach(obj -> {
                                        if(obj instanceof Potion){
                                            JOptionPane.showMessageDialog(null, obj.toString());
                                        }
                            });
                        }else if(IdBuscar3==2){
                        PersonalItems.forEach(obj -> {
                            if(obj instanceof Elixir){
                                JOptionPane.showMessageDialog(null, obj.toString());
                            }
                        });
                         }else if(IdBuscar3==3) {
                            PersonalItems.forEach(obj -> {
                                if (obj instanceof Ammo) {
                                    JOptionPane.showMessageDialog(null, obj.toString());
                                }
                            });
                        }else if(IdBuscar3==4) {
                            PersonalItems.forEach(obj -> {
                                if (obj instanceof Weapon) {
                                    JOptionPane.showMessageDialog(null, obj.toString());
                                }
                            });
                        }else{
                            JOptionPane.showMessageDialog(null, "Ingrese una opción valida");
                        }
                    }else if(decidirLista==2) {
                        JOptionPane.showMessageDialog(null, "Buscando en lista CommonItems");
                        int IdBuscar4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Tipo de objeto a buscar\n" +
                                "1)Potion\n" +
                                "2)Elixir\n" +
                                "3)Ammo\n" +
                                "4)Weapon\n"));
                        if(IdBuscar4==1){
                            CommonItems.forEach(obj -> {
                                if(obj instanceof Potion){
                                    JOptionPane.showMessageDialog(null, obj.toString());
                                }
                            });
                        }else if(IdBuscar4==2){
                            CommonItems.forEach(obj -> {
                                if(obj instanceof Elixir){
                                    JOptionPane.showMessageDialog(null, obj.toString());
                                }
                            });
                        }else if(IdBuscar4==3) {
                            CommonItems.forEach(obj -> {
                                if (obj instanceof Ammo) {
                                    JOptionPane.showMessageDialog(null, obj.toString());
                                }
                            });
                        }else if(IdBuscar4==4) {
                            CommonItems.forEach(obj -> {
                                if (obj instanceof Weapon) {
                                    JOptionPane.showMessageDialog(null, obj.toString());
                                }
                            });
                        }else{
                            JOptionPane.showMessageDialog(null, "Ingrese una opción valida");
                        }
                    }
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Borrar Item  por ID");
                    int decidirDonde3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese en que lista quiere borrar:\n" +
                            "1) PersonalItems\n" +
                            "2) CommonItems"));
                    if(decidirDonde3==1){
                        JOptionPane.showMessageDialog(null, "Buscando en lista PersonalItems");
                        int IdBorrar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del objeto a borrar"));

                        PersonalItems.removeIf(Obj-> (Obj.getId()==IdBorrar));
                        JOptionPane.showMessageDialog(null, "Borrado Correctamente");

                    }else if(decidirDonde3==2){
                        JOptionPane.showMessageDialog(null, "Buscando en lista CommonItems");
                        int IdBorrar2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID a borrar"));

                        CommonItems.removeIf(Obj-> (Obj.getId()==IdBorrar2));
                        JOptionPane.showMessageDialog(null, "Borrado Correctamente");

                    }else {
                        JOptionPane.showMessageDialog(null, "Ingrese una opción valida");
                    }
                    break;
                case 6:
                    int decidirLista3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese en que lista quiere borrar:\n" +
                            "1) PersonalItems\n" +
                            "2) CommonItems"));
                    if(decidirLista3==1){
                        JOptionPane.showMessageDialog(null, "Borrando en lista PersonalItems");
                        int IdBuscar3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Tipo de objeto a borrar\n" +
                                "1)Potion\n" +
                                "2)Elixir\n" +
                                "3)Ammo\n" +
                                "4)Weapon\n"));
                        if(IdBuscar3==1) {
                           PersonalItems.removeIf(Obj-> (Obj instanceof Potion));
                           JOptionPane.showMessageDialog(null, "Borrado Correctamente");
                        }else if(IdBuscar3==2){
                            PersonalItems.removeIf(Obj-> (Obj instanceof Elixir));
                            JOptionPane.showMessageDialog(null, "Borrado Correctamente");
                        }else if(IdBuscar3==3) {
                            PersonalItems.removeIf(Obj-> (Obj instanceof Ammo));
                            JOptionPane.showMessageDialog(null, "Borrado Correctamente");
                        }else if(IdBuscar3==4) {
                            PersonalItems.removeIf(Obj-> (Obj instanceof Weapon));
                            JOptionPane.showMessageDialog(null, "Borrado Correctamente");
                        }else{
                            JOptionPane.showMessageDialog(null, "Ingrese una opción valida");
                        }
                    }else if(decidirLista3==2) {
                        JOptionPane.showMessageDialog(null, "Borrando en lista CommonItems");
                        int IdBuscar4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Tipo de objeto a borrar\n" +
                                "1)Potion\n" +
                                "2)Elixir\n" +
                                "3)Ammo\n" +
                                "4)Weapon\n"));
                        if (IdBuscar4 == 1) {
                            CommonItems.removeIf(Obj-> (Obj instanceof Potion));
                            JOptionPane.showMessageDialog(null, "Borrado Correctamente");
                            } else if (IdBuscar4 == 2) {
                            CommonItems.removeIf(Obj-> (Obj instanceof Elixir));
                            JOptionPane.showMessageDialog(null, "Borrado Correctamente");
                            } else if (IdBuscar4 == 3) {
                            CommonItems.removeIf(Obj-> (Obj instanceof Ammo));
                            JOptionPane.showMessageDialog(null, "Borrado Correctamente");
                            } else if (IdBuscar4 == 4) {
                            CommonItems.removeIf(Obj-> (Obj instanceof Weapon));
                            JOptionPane.showMessageDialog(null, "Borrado Correctamente");
                            } else {
                                JOptionPane.showMessageDialog(null, "Ingrese una opción valida");
                            }
                        }
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
                "7) Cerrar programa\n\n" +
                "(Si solamente regresa al menu quiere\n" +
                "decir que la accion no se pudo realizar)\n" +
                "(Ej, Id no encontrada)";
    }

}



