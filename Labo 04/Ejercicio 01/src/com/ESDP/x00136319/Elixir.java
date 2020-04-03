package com.ESDP.x00136319;

import javax.swing.*;

public class Elixir extends HealthItem {
    private int amount;
    private int time;

    @Override
    public void drink(){ //Cures over time
        JOptionPane.showMessageDialog(null, "Tomando Elixir :O ");
    }
}
