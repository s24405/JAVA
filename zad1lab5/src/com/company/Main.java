package com.company;

public class Main {

    public static void main(String[] args) {
        {
            Rectangle rectangle = new Rectangle();
            rectangle.a = 10;
            rectangle.b = 15;
            System.out.println("Pole rectangle = " + rectangle.getArea());
            System.out.println("Obwód rectagle = " + rectangle.getPerimeter());

            Square square = new Square();
            square.a = 10;
            System.out.println("Pole square = " + square.getArea());
            System.out.println("Obwód square = " + square.getPerimeter());

            Circle Circle = new Circle();


            System.out.println("Pole circle = " + square.getArea() + "pi");
            System.out.println("Obwód circle = " + square.getPerimeter() + "pi");

            Triangle triangle = new Triangle();

            System.out.println("Pole triangle = " + square.getArea());
            System.out.println("Obwód triangle = " + square.getPerimeter());
        }
    }




    }

