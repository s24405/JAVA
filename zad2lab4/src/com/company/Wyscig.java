package com.company;

public class Wyscig {
    public static void main(String[] args) {

Zawodnik czlowiek1=new Zawodnik("czlowiek1", 95,20);
        Zawodnik czlowiek2=new Zawodnik("czlowiek2", 102,12);
        Zawodnik czlowiek3=new Zawodnik("czlowiek3", 30,2);

        czlowiek1.Biegnij();
        czlowiek2.Biegnij();
        czlowiek3.Biegnij();

        czlowiek1.PrzedstawSie();
        czlowiek2.PrzedstawSie();
        czlowiek3.PrzedstawSie();
    }
}