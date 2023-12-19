package com.qbit.labs.lab3;

import java.util.*;

public class NumberOfLines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[][] array = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int count1 = 0;
            int count2 = 0;

            for (int j = 0; j < M; j++) {
                if (array[i][j] % 2 == 0) {
                    count1++;
                } else {
                    count2++;
                }
            }

            if (count1 > count2) {
                count++;
                stringBuilder.append(i + 1).append(" ");
            }
        }
        System.out.println(count + " ");
        System.out.println(stringBuilder.toString().trim());
    }
}
