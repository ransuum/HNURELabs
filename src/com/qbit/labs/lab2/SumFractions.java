package com.qbit.labs.lab2;

import java.util.Scanner;

public class SumFractions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
            double sum1 = 0;
            int N = 0;
            while (sum1 < x) {
                N++;
                sum1 += 1d / N;
            }

            double sum2 = 0;
            int M = 0;
            while (sum2 <= x) {
                M++;
                sum2 += 1d / M;
            }
        System.out.println((N - 1) + " " + M);
    }
}
