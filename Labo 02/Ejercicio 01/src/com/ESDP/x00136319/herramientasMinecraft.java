package com.ESDP.x00136319;

public class herramientasMinecraft {
    private String tool, mat;
    private double attack, durability, Dps; //dps= damage per second

    public herramientasMinecraft(String tool, String mat, double attack, double durability, double dps) {
        this.tool = tool;
        this.mat = mat;
        this.attack = attack;
        this.durability = durability;
        Dps = dps;
    }

    //Metodos
    public void ChopMats(){
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
