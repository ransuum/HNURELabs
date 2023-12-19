package com.qbit.labs.lab2;

import java.util.Scanner;

public class ArithmeticAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        double average = 0;
        int count = 0;
        boolean bol = true;
        while (bol) {
            n = Integer.parseInt(scanner.nextLine());
            if (n == 0) {
                bol = false;
            } else {
                average += n;
                count++;
            }
        }
        System.out.println(average / count);
    }
}
