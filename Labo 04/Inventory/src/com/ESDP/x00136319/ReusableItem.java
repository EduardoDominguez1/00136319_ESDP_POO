package com.ESDP.x00136319;

import javax.swing.*;

abstract class ReusableItem extends Item{
    protected int remainingUses;

    public ReusableItem(int remainingUses) {
        this.remainingUses = remainingUses;
    }

    public ReusableItem(String name, int wheight, String description, int remainingUses) {
        super(name, wheight, description);
        this.remainingUses = remainingUses;
    }

    public void reduceUse(){

        JOptionPane.showMessageDialog(null, "Se ha reducido la cantidad de usos a : ");
    }
    public boolean use(){ //retorna true para no dar error ya que no se usa se implemento asi de momento
    return true;
    }
}
