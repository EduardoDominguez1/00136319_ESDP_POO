package com.ESDP.x00136319;

abstract class HealthItem extends Item {
    protected int reuseTime;
    protected String level;//Minor, Normal, Major.
    protected String type; //Mana, Life.

    public HealthItem(int reuseTime, String level, String type) {
        this.reuseTime = reuseTime;
        this.level = level;
        this.type = type;
    }

    public HealthItem(String name, int wheight, String description, int reuseTime, String level, String type) {
        super(name, wheight, description);
        this.reuseTime = reuseTime;
        this.level = level;
        this.type = type;
    }

    public abstract void drink();
}
