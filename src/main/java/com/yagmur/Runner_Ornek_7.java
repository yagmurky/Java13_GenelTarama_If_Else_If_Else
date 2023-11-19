package com.yagmur;

public class Runner_Ornek_7 {
    public static void main(String[] args) {

        int[] sayilar = { 10, 15, 55, 36, 95, 46, 75 };
        int sayac = 0;
        System.out.println("Dizideki Sayılar");

        for(int i=0;i<sayilar.length;i++)
        {
            System.out.print(sayilar[i]+",");

            if(sayilar[i]<50)
            {
                sayac++;
            }
        }
        System.out.println();
        System.out.println("Dizi içinde 50'den küçük "+sayac+" adet sayı bulunuyor.");
    }
}
