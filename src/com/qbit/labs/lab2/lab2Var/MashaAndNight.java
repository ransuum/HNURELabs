package com.qbit.labs.lab2.lab2Var;

import java.util.Scanner;

public class MashaAndNight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение входных данных
        int n = scanner.nextInt(); // количество этажей
        int m = scanner.nextInt(); // количество квартир на каждом этаже

        // Инициализация счетчика невыключенных светов на квартирах
        int count = 0;

        // Цикл по каждому этажу
        for (int i = 0; i < n; i++) {
            // Чтение информации о свете на этаже
            for (int j = 0; j < 2 * m; j++) {
                char lightStatus = scanner.next().charAt(0);
                if (lightStatus == '1') {
                    // Если свет горит хотя бы в одном окне квартиры, увеличиваем счетчик
                    count++;
                    break; // Выход из внутреннего цикла, т.к. свет уже найден на этаже
                }
            }
        }

        // Вывод результата
        System.out.println(count);
    }
}
