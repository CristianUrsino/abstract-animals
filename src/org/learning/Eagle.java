package org.learning;

public class Eagle extends Animal implements CanFly{
    //costruttore
    public Eagle(String name){
        super(name);
    }
    //metodi
    @Override
    public void eat() {
        System.out.println(getName() + " eat meat");
    }
    @Override
    public void makeNoise() {
        System.out.println("AhAAaa Ahaa Ahaa!");
    }
    @Override
    public void fly() {
        System.out.println("I am flyyying!");
    }
}
