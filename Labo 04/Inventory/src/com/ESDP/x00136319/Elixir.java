package com.ESDP.x00136319;

import javax.swing.*;

public class Elixir extends HealthItem {
    private int amount;
    private int time;

    public Elixir(int reuseTime, String level, String type, int amount, int time) {
        super(reuseTime, level, type);
        this.amount = amount;
        this.time = time;
    }

    public Elixir(String name, int wheight, String description, int reuseTime, String level, String type, int amount, int time) {
        super(name, wheight, description, reuseTime, level, type);
        this.amount = amount;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Elixir{" +
                "amount=" + amount +
                ", time=" + time +
                ", reuseTime=" + reuseTime +
                ", level='" + level + '\'' +
                ", type='" + type + '\'' +
                ", id=" + id +
                ", wheight=" + wheight +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public void drink(){ //Cures over time
        JOptionPane.showMessageDialog(null, "Tomando Elixir :O ");
    }
}
