package com.company;

public class Square extends Shape {

    public double a;
    public double b;

    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public double getPerimeter() {
        return 2*a+2*b;
    }

}
