package com.company;

public class Circle2d {

    private double radious;


    private double x;
    private double y;



    public Circle2d() {
        this.x = 0;
        this.y = 0;
        this.radious = 0.5;


    }

    public Circle2d(double x, double y, double radious) {
        this.x = x;
        this.y = y;
        this.radious = radious;


    }
    public double getArea(){
        double pi = Math.PI;
        double pole= pi*radious*radious;
        return pole;
    }
    public double getPerimeter(){
        double pi = Math.PI;
        double obwod= 2*pi*radious;
        return obwod;
    }
}

