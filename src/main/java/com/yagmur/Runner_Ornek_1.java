package com.yagmur;

import java.util.Scanner;

public class Runner_Ornek_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Girilen sayı pozitif.");
        } else if (number < 0) {
            System.out.println("Girilen sayı negatif.");
        } else {
            System.out.println("Girilen sayı sıfır.");
        }

        if (number % 2 == 0) {
            System.out.println("Girilen sayı çift.");
        } else {
            System.out.println("Girilen sayı tek.");
        }

    }
}
