package com.qbit.labs.lab2.lab2Var;

import java.util.Scanner;

public class EqualSizedRectangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int S = scanner.nextInt();

        for (int a = 1; a <= (int) Math.sqrt(S); a++) {
            if (S % a == 0) {
                int b = S / a;
                if (a <= b) {
                    System.out.println(a + " " + b);
                }
            }
        }
    }
}
