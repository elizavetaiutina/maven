package org.example;

public interface Figure {
    double calculatePerimeter();

    double calculateArea();

    String getBackgroungColor();

    String getBorderColor();

    default void getInfoTheFigure() {
        System.out.println("Периметр фигуры: " + calculatePerimeter() + "\nПлощадь фигуры: " + calculateArea() + "\nЦвет фона фигуры " + getBackgroungColor() + "\nЦвет границ фигуры: " + getBorderColor());
    }
}
