package com.qbit.labs.lab2;

import java.util.Scanner;

public class NumberMaxTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        boolean bol = true;
        while (bol) {
            n = Integer.parseInt(scanner.nextLine());
            if (n == 0) {
                bol = false;
            } else {
                if (n >= max) {
                    secMax = max;
                    max = n;
                }else if (n > secMax) {
                    secMax = n;
                }
            }
        }
        System.out.println(secMax);
    }
}
