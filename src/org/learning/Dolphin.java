package org.learning;

public class Dolphin extends Animal implements CanSwim{
    //costruttore
    public Dolphin(String name){
        super(name);
    }
    //metodi
    @Override
    public void eat() {
        System.out.println(getName() + " eat small fish");
    }
    @Override
    public void makeNoise() {
        System.out.println("Ih IIiih");
    }
    @Override
    public void swim() {
        System.out.println("I'm swimmiiing!");
    }
}
