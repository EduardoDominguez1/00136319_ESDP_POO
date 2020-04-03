package com.ESDP.x00136319;

import javax.swing.*;

public class Ammo extends ReusableItem {
    private boolean equipped;

    public Ammo(int remainingUses, boolean equipped) {
        super(remainingUses);
        this.equipped = equipped;
    }

    public Ammo(String name, int wheight, String description, int remainingUses, boolean equipped) {
        super(name, wheight, description, remainingUses);
        this.equipped = equipped;
    }

    public void equip(){
        equipped = true;
    }
}
