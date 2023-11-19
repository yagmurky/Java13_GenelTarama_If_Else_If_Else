package com.yagmur;

import java.util.Scanner;

public class Runner_Ornek_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        if (number > 10) {
            System.out.println("Girilen sayı 10'dan büyük.");
        } else if (number < 10) {
            System.out.println("Girilen sayı 10'dan küçük.");
        } else {
            System.out.println("Girilen sayı 10'a eşit.");
        }

        if (number >= 0 && number <= 100) {
            System.out.println("Girilen sayı 0 ile 100 arasında.");
        } else {
            System.out.println("Girilen sayı 0 ile 100 arasında değil.");
        }

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Girilen sayı 3'e ve 5'e tam bölünebilir.");
        } else {
            System.out.println("Girilen sayı 3'e ve 5'e tam bölünemiyor.");
        }

    }

}
