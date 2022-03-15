package com.company;

public class punkt {


 int x;
 int y;

 public punkt(){}
        public punkt ( int x, int y) {
            this.x = x;
            this.y = y;
        }
        public void wyswietl(){
     System.out.printf("(%d, %d)", x,y);
    }
}
