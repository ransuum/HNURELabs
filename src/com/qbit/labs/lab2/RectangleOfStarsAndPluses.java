package com.qbit.labs.lab2;

import java.util.Scanner;

public class RectangleOfStarsAndPluses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        for (int i = 1; i <= B; i++) {
            StringBuilder stringBuilder = new StringBuilder("* ");

            if (B % 2 != 0) {
                for (int j = 1; j <= A - 2; j++) {
                    if (i == (B + 1) / 2) {
                        stringBuilder.append("+ ");
                    } else {
                        stringBuilder.append("* ");
                    }
                }
                stringBuilder.append("*");
            } else {
                for (int j = 1; j <= A - 2; j++) {
                    if (i == B / 2) {
                        stringBuilder.append("+ ");
                    } else {
                        stringBuilder.append("* ");
                    }
                }
                stringBuilder.append("*");
            }

            System.out.println(stringBuilder);
        }
    }
}
