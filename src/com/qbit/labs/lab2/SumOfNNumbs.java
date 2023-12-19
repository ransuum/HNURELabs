package com.qbit.labs.lab2;

import java.util.Scanner;

public class SumOfNNumbs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int previousNumb = A;
        int N = 1;
        while (A != 0) {
            if (A < previousNumb) {
                break;
            }
            N++;
            previousNumb = A;
            A = scanner.nextInt();
        }
        System.out.println(N - 1);
    }
}
