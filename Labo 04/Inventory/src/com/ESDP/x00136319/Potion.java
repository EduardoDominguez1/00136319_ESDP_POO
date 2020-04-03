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
    public void drink(){
        JOptionPane.showMessageDialog(null, "Tomando la poti ");
    }
}
