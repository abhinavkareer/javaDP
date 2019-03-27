package com.dp.abstractFactory;

public abstract class EnemyShip {
    private String name;
    ESWeapon weapon;
    EsEngine engine;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    abstract void makeShip();


    @Override
    public String toString() {
        return "EnemyShip{" +
                "name='" + name + '\'' +
                ", weapon=" + weapon +
                ", engine=" + engine +
                '}';
    }
}
