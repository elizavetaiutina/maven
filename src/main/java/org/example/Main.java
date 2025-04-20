package org.example;
//import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        Cat cat = new Cat("Барсик");
        Dog dog = new Dog("Дружок");
        cat.getInfo();
        cat.run(-25);
        cat.run(200);
        cat.run(201);
        cat.swim(25);
        dog.getInfo();
        dog.run(-1);
        dog.run(0);
        dog.run(500);
        dog.run(501);
        dog.swim(-10);
        dog.swim(0);
        dog.swim(10);
        dog.swim(11);
    }
}