package org.learning;

public class Dog extends Animal implements CanSwim{
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
    @Override
    public void swim() {
        System.out.println("I'm swimmiiing!");
    }
}
