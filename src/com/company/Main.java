package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        if(gcd(firstNum, secondNum) == 1)
            System.out.print("Relatively Prime");
        else
            System.out.print("Have a Common Multiple");
    }
    static int gcd(int a, int b) {
        if(a > b) {
            int c = a;
            a = b;
            b = c;
        }
        while(a > 0) {
            b %= a;
            int c = a;
            a = b;
            b = c;
        }
        return b;
    }
}
