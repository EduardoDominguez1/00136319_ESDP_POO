package com.ESDP.x00136319;

import javax.swing.*;

public class Potion extends HealthItem{
    private int amount;

    @Override
    public void drink(){
        JOptionPane.showMessageDialog(null, "Tomando la poti ");
    }
}
