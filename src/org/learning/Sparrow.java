package org.learning;

public class Sparrow extends Animal{
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
}
