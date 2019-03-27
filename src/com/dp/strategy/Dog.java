package com.dp.strategy;

public class Dog extends Animal{

    public void dugHole(){
        System.out.println("Dug a Hole");
    }

    public Dog() {
        super();
        setSound("Bark!");
        flyingType=new CantFly();
    }
}
