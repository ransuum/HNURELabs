package com.qbit.labs.lab2.lab2Var;

import java.util.Scanner;

public class OddNumbReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oddNumb = scanner.nextInt();
        scanner.nextLine();
        String numbers = scanner.nextLine();
        String[] array = numbers.split(" ");
        for (int i = 0; i < oddNumb; i++) {
            if (Integer.parseInt(array[i]) % 2 == 0) {
                if (i == 0) {
                    System.out.print(array[i]);
                } else {
                    System.out.print(" " + array[i]);

                }
            } else {
                if (i == 0) {
                    StringBuilder stringBuilder = new StringBuilder(array[i]);
                    stringBuilder.reverse();
                    System.out.print(stringBuilder);
                } else {
                    StringBuilder stringBuilder = new StringBuilder(array[i]);
                    stringBuilder.reverse();
                    System.out.print(" " + stringBuilder);
                }
            }
        }
    }
}
