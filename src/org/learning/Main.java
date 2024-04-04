package org.learning;

public class Main {

    private static Dolphin dolphin;

    public static void main(String[] args) {
        //Inizializzo un Dog
        Dog dog = null;
        try {
            dog = new Dog("Fuffy");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        //richiamo tutti i metodi
        System.out.println("Dog: " + dog.getName());
        dog.swim();
        dog.eat();
        dog.makeNoise();
        dog.sleap();
        //inizializzo uno Sparrow
        Sparrow sparrow = null;
        try {
            sparrow = new Sparrow("Paperino");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        //richiamo tutti i metodi
        System.out.println("\nSparrow: " + sparrow.getName());
        sparrow.fly();
        sparrow.eat();
        sparrow.swim();
        sparrow.makeNoise();
        sparrow.sleap();
        //inizializzo uno Eagle
        Eagle eagle = null;
        try {
            eagle = new Eagle("Pippo");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        //richiamo tutti i metodi
        System.out.println("\nEagle: " + sparrow.getName());
        eagle.fly();
        eagle.eat();
        eagle.makeNoise();
        eagle.sleap();
        //inizializzo un Dolphin
        dolphin = null;
        try {
            dolphin = new Dolphin("pluto");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        //richiamo tutti i metodi
        System.out.println("\nDolphin: " + dolphin.getName());
        dolphin.swim();
        dolphin.eat();
        dolphin.makeNoise();
        dolphin.sleap();
    }
}
