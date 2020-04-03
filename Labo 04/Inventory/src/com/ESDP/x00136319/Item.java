package com.ESDP.x00136319;

abstract class Item {
    protected int id, wheight;
    protected String name, description;

    public Item(){}

    public Item(String name, int wheight, String description) {
        this.id = IdGenerator.newId();
        this.name = name;
        this.wheight = wheight;
        this.description = description;
    }
}
