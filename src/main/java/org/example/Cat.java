package org.example;

public class Cat extends Animal {
    boolean isWellFed = false;

    public Cat(String name) {
        super(name, 200, 0, false);
        countCats++;
    }

    public void getInfo() {
        System.out.println("Имя кота: " + name + ". Умение плавать: " + isSwiming + ". Максимальное расстояние для бега: " + maxDistanceOfRun + "м."+" Сыт ли кот: " + isWellFed);
    }

    public void eat(Dish dish, int countFoodForEat) {
        if (countFoodForEat < 0) {
            System.out.println("Количество еды не может быть отрицательным");
        } else if (dish.count > countFoodForEat) {
            isWellFed = true;
            dish.count -= countFoodForEat;
            System.out.println(name + " съел " + countFoodForEat + " г. Осталось " + dish.count + " г." + " Сыт ли кот: " + isWellFed);
        } else {
            isWellFed = false;
            System.out.println("Еды в миске недостаточно! В миске всего лишь " + dish.count + " г. Коту нужно: " + countFoodForEat + "г. Сыт ли кот: " + isWellFed);
        }

    }

}
