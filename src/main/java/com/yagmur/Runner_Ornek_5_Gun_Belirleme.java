package com.yagmur;

import java.util.Scanner;

public class Runner_Ornek_5_Gun_Belirleme {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("1-7 arasında bir sayı giriniz.");
        int kacinciGun=scanner.nextInt();

        if (kacinciGun==1){
            System.out.println("Haftanın "+ kacinciGun + ". günü pazartesidir.");
        }else if (kacinciGun==2){
            System.out.println("Haftanın "+ kacinciGun + ". günü salıdır.");
        }else if (kacinciGun==3){
            System.out.println("Haftanın "+ kacinciGun + ". günü çarşambadır.");
        }else if (kacinciGun==4){
            System.out.println("Haftanın "+ kacinciGun + ". günü perşembedir.");
        } else if (kacinciGun==5) {
            System.out.println("Haftanın "+ kacinciGun + ". günü cumadır.");
        } else if (kacinciGun==6) {
            System.out.println("Haftanın "+ kacinciGun + ". günü cumartesidir.");
        } else if (kacinciGun==7) {
            System.out.println("Haftanın "+ kacinciGun + ". günü pazardır.");
        }else {
            System.out.println("Geçersiz bir gün numarası.");
        }
    }
}
