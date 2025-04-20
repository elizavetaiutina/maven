package org.example;
//import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        Dish dish = new Dish(19);
        dish.getinfoDish();

        Cat[] cats = {new Cat("Том"), new Cat("Барсик"), new Cat("Джерри"), new Cat("Барсик2")};
        for (int i = 0; i < cats.length; i++) {
            cats[i].getInfo();
            cats[i].eat(dish, 5);
        }

        dish.addFood(50);

        cats[1].run(25);

        Dog dog = new Dog("Дружок");
        dog.getInfo();
        dog.run(-1);

        Animal.getCountAnimals();
    }
}