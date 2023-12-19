package com.qbit.labs.lab2;
import java.util.Scanner;

public class NumberMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int max = Integer.MIN_VALUE;
        int count = 0;
        do {
            n = Integer.parseInt(scanner.nextLine());
            if (n > max){
                max = n;
                count = 1;
            } else if (n == max) {
                count++;
            }
        } while (n != 0);
        System.out.println(count);
    }
}

