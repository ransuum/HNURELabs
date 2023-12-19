package com.qbit.labs.lab3;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] A = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        int count = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i > j) {
                    sum += A[i][j];
                    count++;
                }
            }
        }
        if (count > 0) {
            double average = (double) sum / count;
            System.out.printf("%.5f\n", average);
        }

    }
}
