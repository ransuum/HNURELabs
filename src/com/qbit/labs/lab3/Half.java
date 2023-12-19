package com.qbit.labs.lab3;

import java.util.Scanner;

public class Half {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        int count = n - 1;
        int count1 = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = 0;
            }
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < count; j++) {
                array[i][j] = 2;
            }
            count--;
        }

        for (int i = n - 1; i > 0; i--) {
            for (int j = count1; j < n; j++) {
                array[i][j] = 1;
            }
            count1++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
