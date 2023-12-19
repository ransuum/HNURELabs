package com.qbit.labs.lab3;

import java.util.Scanner;

public class InputNumb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        int countx = 0;
        int county = 0;
        int countz = 0;
        String[] array = N.split("");
        for (int i = 0; i < array.length; i++) {
            if (x == Integer.parseInt(array[i])) {
                countx++;
            }
            if (y == Integer.parseInt(array[i])) {
                county++;
            }
            if (z == Integer.parseInt(array[i])) {
                countz++;
            }
        }
        int output = array.length -(countx + county + countz);
        if (countx + county + countz != array.length || countx + county + countz == array.length ){
            System.out.println(output);
        }
    }
}