package com.ESDP.x00136319;

import javax.swing.*;

public class Potion extends HealthItem{
    private int amount;

    public Potion(int reuseTime, String level, String type, int amount) {
        super(reuseTime, level, type);
        this.amount = amount;
    }

    public Potion(String name, int wheight, String description, int reuseTime, String level, String type, int amount) {
        super(name, wheight, description, reuseTime, level, type);
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Potion{" +
                "amount=" + amount +
                ", reuseTime=" + reuseTime +
                ", level='" + level + '\'' +
                ", type='" + type + '\'' +
                ", ID=" + id +
                ", wheight=" + wheight +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public void drink(){
        JOptionPane.showMessageDialog(null, "Tomando la poti ");
    }
}
