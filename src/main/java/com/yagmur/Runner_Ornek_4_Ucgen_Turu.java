package com.yagmur;

import java.util.Scanner;

public class Runner_Ornek_4_Ucgen_Turu {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("üçgenin 1. kenar uzunluğunu giriniz.");
        int a=scanner.nextInt();
        System.out.println("üçgenin 2. kenar uzunluğunu giriniz.");
        int b=scanner.nextInt();
        System.out.println("üçgenin 3. kenar uzunluğunu giriniz.");
        int c=scanner.nextInt();

        if (a==b && b==c){
            System.out.println("Bu bir eşkenar üçgendir.");
        }else if (a==b || b==c ||  a==c){
            System.out.println("Bu bir ikizkenar üçgendir.");
        }else {
            System.out.println("Bu bir çeşitkenar üçgendir.");
        }
    }
}
