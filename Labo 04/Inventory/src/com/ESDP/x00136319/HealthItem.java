package com.ESDP.x00136319;

abstract class HealthItem extends Item {
    protected int reuseTime;
    protected String level;//Minor, Normal, Major.
    protected String type; //Mana, Life.

    public abstract void drink();
}
