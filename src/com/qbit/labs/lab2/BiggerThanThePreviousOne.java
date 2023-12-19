package com.qbit.labs.lab2;

import java.util.Scanner;

public class BiggerThanThePreviousOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int previousNumber = A;
        int count = 0;

        while (A != 0) {
            if (A > previousNumber) {
                count++;
            }

            previousNumber = A;
            A = scanner.nextInt();
        }

        System.out.println(count);
    }
}
