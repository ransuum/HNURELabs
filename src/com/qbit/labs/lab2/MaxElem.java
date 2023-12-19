package com.qbit.labs.lab2;

import java.util.Scanner;

public class MaxElem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int max = 0;
        boolean first = true;

        do {
            n = Integer.parseInt(scanner.nextLine());

            if (first || n > max && n != 0) {
                max = n;
                first = false;
            }
        } while (n != 0);

        System.out.println(max);
    }
}
