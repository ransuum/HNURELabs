package com.qbit.labs.lab2.lab2Var;

import java.util.Scanner;

public class Matchsticks_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int S = scanner.nextInt();

        int side = (int) Math.ceil(Math.sqrt(S));

        int matchesMinStick = 2 * side + 2 * (S / side);

        if (S % side != 0) {
            matchesMinStick += 2;
        }
        System.out.println(matchesMinStick);
    }
}
