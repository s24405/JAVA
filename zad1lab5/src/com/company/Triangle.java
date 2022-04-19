package com.company;

public class Triangle extends Shape {
    public double a;
    public double h;
    public double c;

    @Override
    public double getArea() {
        return (a*h)/2;
    }

    @Override
    public double getPerimeter() {
        return a+c+h;
    }

}
