package org.learning;

public class Dog extends Animal{
    //costruttore
    public Dog(String name){
        super(name);
    }
    //methods
    @Override
    public void eat() {
        System.out.println(getName() + " eat meat");
    }
    @Override
    public void makeNoise() {
        System.out.println("Bau!");
    }
}
