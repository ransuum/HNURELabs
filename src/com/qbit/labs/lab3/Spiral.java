package com.qbit.labs.lab3;

import java.util.Scanner;

public class Spiral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] array = new int[n][n];
        int val = 1;
        int startRow = 0, endRow = n - 1, startCol = 0, endCol = n - 1;

        while (startRow <= endRow && startCol <= endCol) {
            for (int j = startCol; j <= endCol; j++) {
                array[startRow][j] = val++;
            }
            startRow++;
            for (int i = startRow; i <= endRow; i++) {
                array[i][endCol] = val++;
            }
            endCol--;
            for (int j = endCol; j >= startCol; j--) {
                array[endRow][j] = val++;
            }
            endRow--;
            for (int i = endRow; i >= startRow; i--) {
                array[i][startCol] = val++;
            }
            startCol++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
