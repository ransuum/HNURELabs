package com.qbit.labs.lab2.lab2Var;

import java.util.Scanner;

public class TriangleByZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = N; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (j == i){
                    System.out.print(0);
                }else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}
