package com.qbit.labs.lab2.lab2Var;

import java.util.*;

public class HNE_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();
        int count = 1;
        int count1 = 0;
        for (int i = 1; i <= numb; i++) {
            for (int j = 1; j <= i; j++) {
               if (count1 < numb){
                   System.out.print(count + " ");
                   count1++;
               } else {
                  break;
               }
            }
            count++;
        }
    }
}
