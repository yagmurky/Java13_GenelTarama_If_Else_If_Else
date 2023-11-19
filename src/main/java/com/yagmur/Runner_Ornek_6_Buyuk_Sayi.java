package com.yagmur;

import java.util.Scanner;

public class Runner_Ornek_6_Buyuk_Sayi {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen 1. sayıyı giriniz.");
        int a=scanner.nextInt();
        System.out.println("Lütfen 2. sayıyı giriniz.");
        int b=scanner.nextInt();
        System.out.println("Lütfen 3. sayıyı giriniz.");
        int c=scanner.nextInt();


        if (a>b && a<c){
            System.out.println(a+" sayısı büyüktür.");
        }
        else if (b > a && b > c)
        {
            System.out.println(b+" sayısı büyüktür.");
        }
        else
        {
            System.out.println(c+" sayısı büyüktür.");
        }

    }
}
