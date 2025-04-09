package org.example;
//import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Футболка", "02.04.2024", "Текстильная фабрика", "Китай", 1000, true);
        productsArray[1] = new Product("Толстовка", "02.05.2023", "Текстильная фабрика", "Китай", 3000, true);
        productsArray[2] = new Product("Штаны", "05.04.2021", "Текстильная фабрика", "Франция", 2000, false);
        productsArray[3] = new Product("Кепка", "02.08.2023", "Головные уборы", "Китай", 700, true);
        productsArray[4] = new Product("Очки", "02.07.2024", "Оптика", "Россия", 1000, false);
        productsArray[0].getInfo();
        productsArray[1].getInfo();
        productsArray[2].getInfo();
        productsArray[3].getInfo();
        productsArray[4].getInfo();

        System.out.println("\n\n\n\n\nЗАДАНИЕ 3");

        Park.Attraction attraction = new Park().new Attraction("Солнышко", "10:00-22:00", 750);
        attraction.getInfoAboutAttraction();

    }
}