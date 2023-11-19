package com.yagmur;

import java.util.Scanner;

public class Runner_Ornek_2_Not_Hesaplama {
    public static void main(String[] args) {

        /**
         * Kullanıcıdan not isteyeceğim.
         * Notu;
         * 100-90: A
         * 90-80: B
         * 80-70: C
         * 70-60: D
         * 60-0: F olsun.
         *
         * 100 ile 0 arasında bir sayı girmezse uyarı versin.
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz.");
        int not = scanner.nextInt();

        if (not>=90 && not<=100) {
            System.out.println("Harf notunuz: A");
        }else if (not>=80 && not<=100) {
            System.out.println("Harf notunuz: B");
        }else if (not>=70 && not<=100){
            System.out.println("Harf notunuz: C");
        }else if (not>=60 && not<=100){
            System.out.println("Harf notunuz: D");
        }else if (not>=0 && not<=100) {
            System.out.println("Harf notunuz: F");
        }else {
            System.out.println("Lütfen 0-100 arasında bir sayı giriniz.");
        }
    }
}
