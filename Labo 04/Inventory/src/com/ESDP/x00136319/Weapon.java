package com.ESDP.x00136319;

import javax.swing.*;

public class Weapon extends ReusableItem {
    private String type; //Bow, Sword, Staff, Orb, Dagger.
    private double speed;
    private double damage;
    private String wieldType; //One-Handed, Two-Handed.
    private int level;

    public Weapon(int remainingUses, String type, double speed, double damage, String wieldType, int level) {
        super(remainingUses);
        this.type = type;
        this.speed = speed;
        this.damage = damage;
        this.wieldType = wieldType;
        this.level = level;
    }

    public Weapon(String name, int wheight, String description, int remainingUses, String type, double speed, double damage, String wieldType, int level) {
        super(name, wheight, description, remainingUses);
        this.type = type;
        this.speed = speed;
        this.damage = damage;
        this.wieldType = wieldType;
        this.level = level;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "type='" + type + '\'' +
                ", speed=" + speed +
                ", damage=" + damage +
                ", wieldType='" + wieldType + '\'' +
                ", level=" + level +
                ", remainingUses=" + remainingUses +
                ", id=" + id +
                ", wheight=" + wheight +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public void upgrade(){
        JOptionPane.showMessageDialog(null, "Tu " + type + " sube de nivel :D");
        level++;
    }
}
