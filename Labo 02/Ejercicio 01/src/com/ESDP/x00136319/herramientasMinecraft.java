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
    //Solo se usa un getter
    public String getTipo() {
        return tool;
    }
    //Metodos
    public void ChopMats(){
        System.out.println("Talando. . .");
        System.out.println("Usando " + tool + " De " + mat + "!!!!");
        System.out.println("PICAS MATERIAL A " + Dps + " Golpes por Segundo!");
        System.out.println("La durabilidad se ha reducido. .");
        System.out.println("Durabilidad actual: " + (durability-20));
    }
    public void AttackMob(){
        System.out.println("Atacando. . .");
        System.out.println("Usando " + tool + " De " + mat + "!!!!");
        System.out.println("PEGAS A " + Dps + " Golpes por Segundo!");
        System.out.println("Se ha dañado tu herramienta. .");
        System.out.println("Durabilidad actual: " + (durability-35));
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
    public void mostrardatos(){
        System.out.println("Tipo: "+ tool);
        System.out.println("Material: "+ mat);
        System.out.println("Durabilidad: "+ durability);
        System.out.println("Velocidad de Ataque: "+ Dps);
        System.out.println("Daño: "+ attack);

    }
}
