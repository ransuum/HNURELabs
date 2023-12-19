package com.qbit.labs.lab3;

import java.util.*;

public class Overturn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.nextLine();
        String[] array = N.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        int n = Integer.parseInt(array[0]);
        int m = Integer.parseInt(array[1]);
        int[][] array1 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array1[i][j] = scanner.nextInt();
            }
        }
        stringBuilder.append(m).append(" ").append(n).append("\n");
        for (int i = 0; i < m; i++) {
            for (int j = n - 1; j >= 0; j--) {
                stringBuilder.append(array1[j][i]).append(" ");
            }
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder);
    }
}
