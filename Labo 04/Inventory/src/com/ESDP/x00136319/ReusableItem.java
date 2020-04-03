package com.ESDP.x00136319;

import javax.swing.*;

abstract class ReusableItem extends Item{
    protected int remainingUses;

    public void reduceUse(){

        JOptionPane.showMessageDialog(null, "Se ha reducido la cantidad de usos a : ");
    }
    public boolean use(){

    }
}
