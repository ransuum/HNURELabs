package com.qbit.labs.lab2.lab2Var;

import java.util.Scanner;

public class SquareRootsOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double answer = 0d;
        for (int i = 0; i < N; i++) {
            answer = Math.sqrt(2 + answer);
        }
        System.out.println(Math.round(answer * 10000000000.0) / 10000000000.0);
    }
}
