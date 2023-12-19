package com.qbit.labs.lab4;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static int idAcc = 1;
    public static int transactionID = 1;
    public static int categoryID = 1;

    public static void main(String[] args) throws IOException, ParseException {
        Process process = new Process();
        process.app();
    }

    public static void print(String some){
        System.out.print(some);
    }
    public static void println(String some){
        System.out.println(some);
    }

}
