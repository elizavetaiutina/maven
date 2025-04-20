package org.example;

public class Cat extends Animal {
    public Cat(String name) {
        super(name, 200, 0, false);
    }

    public void getInfo() {
        System.out.println("Имя кота: " + name + ". Умение плавать: " + isSwiming + ". Максимальное расстояние для бега: " + maxDistanceOfRun + "м.");
    }
}
