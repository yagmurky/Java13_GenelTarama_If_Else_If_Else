package com.yagmur;

import java.util.Scanner;

public class Runner_Ornek_3_Mevsim_Belirleme {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan bir ay numarası alsın.
         * Ay numarasına göre hangi mevsimde olduğumuzu söylesin.
         *
         *
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir ay numarası giriniz.");
        int ay= scanner.nextInt();

        if (ay>=1 && ay<=2){
            System.out.println("Mevsimlerden kış.");
        } else if (ay==12) {
            System.out.println("Mevsimlerden kış.");
        } else if (ay>=3 && ay<=5) {
            System.out.println("Mevsimlerden ilkbahar.");
        } else if (ay>=6 && ay<=8) {
            System.out.println("Mevsimlerden yaz.");
        }else if (ay>=9 && ay<=11){
            System.out.println("Mevsimlerden sonbahar.");
        }else {
            System.out.println("Lütfen 1-12 arasında bir ay numarası giriniz.");
        }
    }
}
