package org.example;

public class Triangle implements Figure {
    private int a;
    private int b;
    private int c;
    private String backgroundcolor;
    private String borderColor;

    public Triangle(int a, int b, int c, String backgroundcolor, String borderColor) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.backgroundcolor = backgroundcolor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public double calculateArea() {
        double polupreimetr = (a + b + c) / 2;
        return Math.sqrt(polupreimetr * (polupreimetr - a) * (polupreimetr - b) * (polupreimetr - c));
    }

    @Override
    public String getBackgroungColor() {
        return backgroundcolor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}
