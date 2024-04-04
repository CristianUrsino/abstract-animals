package org.learning;

public class Eagle extends Animal{
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
}
