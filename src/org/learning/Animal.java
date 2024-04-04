package org.learning;

public abstract class Animal {
    //attributi
    private String name;
    //costruttori
    public Animal(String name)
            throws IllegalArgumentException{
        if(name.isEmpty()) throw new IllegalArgumentException("The field name is empty");
        this.name = name;
    }
    //setter
    public void setName(String name)
            throws IllegalArgumentException{
        if(name.isEmpty()) throw new IllegalArgumentException("The field name is empty");
        this.name = name;
    }
    //getter
    public String getName() {
        return name;
    }
    //metodi
    public void sleap(){
        System.out.println("ZZZzzz");
    }
    public abstract void makeNoise();
    public abstract void eat();
}
