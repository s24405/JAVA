package com.company;

public class Circle extends Shape{
        public double a;


        @Override
        public double getArea() {
            return a*a;
        }

        @Override
        public double getPerimeter() {
            return 2*a;
        }

}
