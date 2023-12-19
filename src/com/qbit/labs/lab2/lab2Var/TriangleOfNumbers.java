package com.qbit.labs.lab2.lab2Var;

import java.util.*;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String input = scanner.nextLine();
        String[] array = input.split(" ");
        int count = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(array[count] + " ");
                count++;
            }
            System.out.println();
        }

    }
}