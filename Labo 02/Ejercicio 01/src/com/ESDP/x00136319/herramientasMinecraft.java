package com.ESDP.x00136319;

public class herramientasMinecraft {
    private String tool, mat;
    private double attack, durability, Dps; //Dps= damage per second

    public herramientasMinecraft(String tool, String mat, double attack, double durability, double dps) {
        this.tool = tool;
        this.mat = mat;
        this.attack = attack;
        this.durability = durability;
        Dps = dps;
    }

    public void AddTool(){
        System.out.println("Agregar una herramienta");
    }
    public void ConsultAllTools(){

    }
    public void ConsultToolOneType(){

    }
    //Metodos
    public void (){
        System.out.println("Talando. . .");

    }
    public void AttackMob(){
        System.out.println("Atacando. . .");
    }
    //toString
    @Override
    public String toString() {
        return "herramientasMinecraft{" +
                "tool='" + tool + '\'' +
                ", mat='" + mat + '\'' +
                ", attack=" + attack +
                ", durability=" + durability +
                ", Dps=" + Dps +
                '}';
    }
}