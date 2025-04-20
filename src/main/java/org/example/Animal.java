package org.example;

public class Animal {
    String name;
    int maxDistanceOfRun;
    int maxDistanceOfSwim;
    boolean isSwiming;

    public Animal(String name, int maxDistanceOfRun, int maxDistanceOfSwim, boolean isSwiming) {
        this.name = name;
        this.maxDistanceOfRun = maxDistanceOfRun;
        this.maxDistanceOfSwim = maxDistanceOfSwim;
        this.isSwiming = isSwiming;
    }

    public void run(int distance) {
        if (distance >= 0 && distance <= maxDistanceOfRun) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else if (distance < 0) {
            System.out.println("Дистанция не может быть меньше 0м.");
        } else {
            System.out.println(name + " не смог пробежать " + distance + "м, он может пробежать максимум " + maxDistanceOfRun + "м.");
        }
    }

    public void swim(int distance) {
        if (!isSwiming) {
            System.out.println(name + " не умеет плавать !");
        } else if (distance < 0) {
            System.out.println("Дистанция не может быть меньше 0м.");
        } else if (distance <= maxDistanceOfSwim) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не смог проплыть " + distance + "м, он может проплыть максимум " + maxDistanceOfSwim + "м.");
        }
    }
}

