package com.qbit.labs.lab3;

import java.util.*;

public class BuyingCandy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] candies = new int[N];
        for (int i = 0; i < N; i++) {
            candies[i] = scanner.nextInt();
        }
        int maxSum = Integer.MIN_VALUE;
        int[] result = new int[4];

        for (int i = 0; i < N - 3; i++) {
            for (int j = i + 2; j < N - 1; j++) {
                int currentSum = candies[i] + candies[i + 1] + candies[j] + candies[j + 1];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    result = new int[]{i + 1, i + 2, j + 1, j + 2};
                }
            }
        }

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
