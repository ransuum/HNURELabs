package com.qbit.labs.lab3;

import java.util.*;

public class EIT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        double min = Double.MAX_VALUE;
        for (int i = array[0]; i <= array[N - 1]; i++) {
            double EIT = 0;
            for (int j = 0; j < N; j++) {
                EIT += Math.abs(array[j] - i);
            }
            min = Math.min(min, EIT);
        }
        if (min/2 % 1 == 0) {
            System.out.println((int) min / 2);
        } else {
            System.out.println(min / 2);
        }
    }
}
