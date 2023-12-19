package com.qbit.labs.lab3;
import java.util.Arrays;
import java.util.Scanner;

public class Sight2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int L = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);

        int days = 0;
        int pos = array[0];
        for (int i = 0; i < N; i++) {
            if (array[i] - pos > L) {
                days++;
                pos = array[i];
            }
        }
        days++;
        System.out.println(days);
    }
}
