package com.qbit.labs.lab2.lab2Var;

import java.util.*;

public class NumberInTheVerticalFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println("***");
        String[] array = Integer.toString(N).split("");
        for (int i = 0; i < array.length; i++) {
            System.out.println("*" + array[i] + "*");
        }
        System.out.println("***");
    }
}
