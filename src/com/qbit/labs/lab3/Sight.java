package com.qbit.labs.lab3;

import java.util.*;

public class Sight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение количества достопримечательностей
        int n = scanner.nextInt();

        // Чтение координат достопримечательностей
        int[] coordinates = new int[n];
        for (int i = 0; i < n; i++) {
            coordinates[i] = scanner.nextInt();
        }

        // Сортировка массива координат
        Arrays.sort(coordinates);

        // Вычисление длины кратчайшего маршрута
        int shortestRouteLength = 0;
        for (int i = 1; i < n; i++) {
            shortestRouteLength += Math.abs(coordinates[i] - coordinates[i - 1]);
        }

        // Вывод результата
        System.out.println(shortestRouteLength);

        scanner.close();
    }
}
