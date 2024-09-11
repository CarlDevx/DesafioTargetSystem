package com.sousa;
import java.util.Scanner;
public class Main {
    public static void main(String... args){
        Challenge challenge = new Challenge();
        Scanner scan = new Scanner(System.in);
        System.out.println("digite um numero para verificar se o mesmo está na sequencia de fibonnaci.");
        int number = scan.nextInt();
        scan.close();
        challenge.fibonnaci(number);
    }
}
