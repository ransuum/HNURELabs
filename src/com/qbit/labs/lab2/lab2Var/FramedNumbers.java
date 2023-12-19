package com.qbit.labs.lab2.lab2Var;

import java.util.Scanner;

public class FramedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        String[] array = Integer.toString(N).split("");

        for (int i = 1; i <= 3; i++) {
            System.out.print("*");
            for (int j = 0; j < array.length; j++) {
                if (i == 2){
                    System.out.print(array[j] + "*");
                } else {
                    System.out.print("**");
                }
            }
            System.out.println();
        }
    }
}
