package org.example;

public class Rectangle implements Figure {
    private int a;
    private int b;
    private String backgroundcolor;
    private String borderColor;

    public Rectangle(int a, int b, String backgroundcolor, String borderColor) {
        this.a = a;
        this.b = b;
        this.backgroundcolor = backgroundcolor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (a + b);
    }

    @Override
    public double calculateArea() {
        return a * b;
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
