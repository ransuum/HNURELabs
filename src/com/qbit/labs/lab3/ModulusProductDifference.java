package com.qbit.labs.lab3;

import java.util.Scanner;

public class ModulusProductDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] numbs = new long[5];
        for (int i = 0; i < 5; i++) {
            numbs[i] = scanner.nextLong();
        }

        long min = Long.MAX_VALUE;
        long numb1 = 0;
        long numb2 = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                long prod1 = get(numbs[i]);
                long prod2 = get(numbs[j]);
                long difference = Math.abs(prod1 - prod2);

                if (difference < min) {
                    min = difference;
                    numb1 = numbs[i];
                    numb2 = numbs[j];
                }
            }
        }
        System.out.println(numb1 + " " + numb2);
    }
    private static long get(long numb) {
        long prod = 1;
        while (numb != 0) {
            long digit = Math.abs(numb % 10);
            prod *= digit;
            numb /= 10;
        }
        return prod;
    }
}
