package com.yagmur;

import java.util.Scanner;

public class Runner_Ornek_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bilgisayarFiyati = 3000.0;
        double telefonFiyati = 1500.0;
        double televizyonFiyati = 2000.0;
        double hoparlorFiyati = 200.0;

        int bilgisayarAdet = 0;
        int telefonAdet = 0;
        int televizyonAdet = 0;
        int hoparlorAdet = 0;

        double toplamFiyat = 0.0;

        while (true) {
            System.out.println("************************************");
            System.out.println("1- Ürünleri görmek için 1'e basınız.");
            System.out.println("2- Alışveriş yapmak için 2'ye basın");
            System.out.println("3- Ç I K I Ş");
            System.out.println("************************************");
            int secim = scanner.nextInt();

            if (secim == 1) {
                System.out.println("1. Bilgisayar - " + bilgisayarFiyati + " TL");
                System.out.println("2. Telefon - " + telefonFiyati + " TL");
                System.out.println("3. Televizyon - " + televizyonFiyati + " TL");
                System.out.println("4. Hoparlör - " + hoparlorFiyati + " TL");

            } else if (secim == 2) {
                System.out.print("Almak istediğiniz ürünün numarasını girin: ");
                int urunNumarasi = scanner.nextInt();

                if (urunNumarasi == 1) {
                    bilgisayarAdet++;
                    toplamFiyat += bilgisayarFiyati;
                    System.out.println("Bilgisayar sepete eklendi.");
                } else if (urunNumarasi == 2) {
                    telefonAdet++;
                    toplamFiyat += telefonFiyati;
                    System.out.println("Telefon sepete eklendi.");
                } else if (urunNumarasi == 3) {
                    televizyonAdet++;
                    toplamFiyat += televizyonFiyati;
                    System.out.println("Televizyon sepete eklendi.");
                } else if (urunNumarasi == 4) {
                    hoparlorAdet++;
                    toplamFiyat += hoparlorFiyati;
                    System.out.println("Hoparlör sepete eklendi.");
                } else {
                    System.out.println("Geçersiz ürün numarası.");
                }
            } else if (secim == 3) {
                break;
            } else {
                System.out.println("Geçersiz bir seçim yaptınız. Lütfen tekrar deneyin.");
            }
        }

        System.out.println("Sepetinizdeki ürünler ve adetleri:");
        System.out.println("Bilgisayar: " + bilgisayarAdet + " adet");
        System.out.println("Telefon: " + telefonAdet + " adet");
        System.out.println("Televizyon: " + televizyonAdet + " adet");
        System.out.println("Hoparlör: " + hoparlorAdet + " adet");
        System.out.println("Toplam Fiyat: " + toplamFiyat + " TL");

    }
}
