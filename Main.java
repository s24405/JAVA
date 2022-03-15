package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(" ");
        System.out.println("labolatoria 2 zadanie 1");

        int[] tablica1 = new int[]{5, 5, 5};
        int[] tablica2 = new int[]{1, 2, 3};
        int[] suma = sumujTablice(tablica1, tablica2);
        System.out.println(Arrays.toString(suma));
    }
        public static int[] sumujTablice ( int[] tab1, int[] tab2){
            if (tab1.length != tab2.length) {
                return new int[]{};
            }

            int[] suma = new int[tab1.length];
            for (int i = 0; i < suma.length; i++) {
                suma[i] = tab1[i] + tab2[i];
            }
            return suma;
        }
    }

