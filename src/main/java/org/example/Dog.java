package org.example;

public class Dog extends Animal {
    public Dog(String name) {
        super(name, 500, 10, true);
    }

    public void getInfo() {
        System.out.println("Имя собаки: " + name + ". Умение плавать: " + isSwiming + ". Максимальное расстояние для бега: " + maxDistanceOfRun + "м. Максимальное расстояние для плавания: " + maxDistanceOfSwim + "м.");
    }
}
