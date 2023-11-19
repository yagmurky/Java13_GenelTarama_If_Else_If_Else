package com.yagmur;

import java.util.Scanner;

public class Runner_Ornek_9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı girin: ");
        String kullaniciAdi = scanner.nextLine();

        System.out.print("Şifrenizi girin: ");
        String sifre = scanner.nextLine();

        if (kullaniciAdi.equals("admin") && sifre.equals("12345")) {
            System.out.println("Giriş başarılı. Hoş geldiniz, admin!");
        } else if (kullaniciAdi.equals("user") && sifre.equals("67890")) {
            System.out.println("Giriş başarılı. Hoş geldiniz, kullanıcı!");
        } else {
            System.out.println("Giriş başarısız. Geçersiz kullanıcı adı veya şifrenizi tekrar giriniz.");
        }
    }
}
