package com.company;

public class Zawodnik {
    private String imie;
    private double maxpredkosc;
    private double minpredkosc;
    private double dystans;

    public Zawodnik(String imie, double maxpredkosc,double minpredkosc){
this.imie=imie;
this.dystans=0;
this.minpredkosc=minpredkosc;
this.maxpredkosc=maxpredkosc;
    }

public void PrzedstawSie(){
System.out.println("Jestem "+imie+" biegam z predkoscia "+maxpredkosc+" przebieglem dystans "+dystans);

}

public void Biegnij(){

        this.dystans=Math.random()*1479910;
        System.out.println("Przebieglem " + dystans + " :) ");
}

}

