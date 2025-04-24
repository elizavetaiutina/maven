package org.example;

public class Dish {
    public int count;

    public Dish(int count) {
        this.count = count;
    }

    public void getinfoDish() {
        System.out.println("В миске " + count + " г.");
    }

    public void addFood(int addingFood) {
        count += addingFood;
        System.out.println("Добавлено " + addingFood + " г. Теперь в миске " + count + " г.");
    }
}
