package com.company;

public class zadanie3 {
    public static void main(String[] args){
        punkt punkt = new punkt( 2, 2);
        punkt zerowy = new punkt ();
        punkt.wyswietl();
        zerowy.wyswietl();

        int a = Math.abs(punkt.x-zerowy.x);
        int b = Math.abs(punkt.y-zerowy.y);
        double dist = Math.sqrt(a*a+b*b);
    }
}
