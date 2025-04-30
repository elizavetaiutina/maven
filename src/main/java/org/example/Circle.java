package org.example;

public class Circle implements Figure {
    private int radius;
    private String backgroundcolor;
    private String borderColor;

    public Circle(int radius, String backgroundcolor, String borderColor) {
        this.radius = radius;
        this.backgroundcolor = backgroundcolor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
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
