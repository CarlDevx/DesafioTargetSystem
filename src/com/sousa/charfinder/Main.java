package com.sousa.charfinder;
import java.util.Scanner;
public class Main {
    public static void main(String... args){
        CharFinder charfinder = new CharFinder();
        Scanner scan = new Scanner(System.in);
        System.out.println("digite um texto para verificar quantas vezes a letra 'A' aparece no mesmo.");
        String str = scan.nextLine();
        scan.close();
        charfinder.find(str);
    }
}