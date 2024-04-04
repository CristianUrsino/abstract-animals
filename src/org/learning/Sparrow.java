package org.learning;

public class Sparrow extends Animal implements CanFly, CanSwim{
    //costruttore
    public Sparrow(String name){
        super(name);
    }
    //metodi
    @Override
    public void eat() {
        System.out.println(getName() + " eat seeds");
    }
    @Override
    public void makeNoise() {
        System.out.println("Qua qua!");
    }
    @Override
    public void fly() {
        System.out.println("I am flyyying!");
    }
    @Override
    public void swim() {
        System.out.println("I'm swimmiiing!");
    }
}
