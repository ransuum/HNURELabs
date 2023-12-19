package com.qbit.labs.lab2;

import java.util.Scanner;

public class SmallestDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int minDivisor = findSmallDiv(N);

        System.out.println(minDivisor);
    }

    private static int findSmallDiv(int N) {
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                return i;
            }
        }
        return N;
    }
}

