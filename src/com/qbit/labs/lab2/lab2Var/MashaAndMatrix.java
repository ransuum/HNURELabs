package com.qbit.labs.lab2.lab2Var;

import java.util.Scanner;

public class MashaAndMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод размера матрицы
        int n = scanner.nextInt();

        // Создание и ввод элементов матрицы
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Вычисление суммы хороших элементов матрицы
        int sum = calculateGoodElementsSum(matrix);

        // Вывод результата
        System.out.println(sum);

        // Закрытие сканнера
        scanner.close();
    }

    // Метод для вычисления суммы хороших элементов матрицы
    private static int calculateGoodElementsSum(int[][] matrix) {
        int n = matrix.length;
        int sum = 0;

        // Суммирование элементов главной диагонали
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
        }

        // Суммирование элементов побочной диагонали
        for (int i = 0; i < n; i++) {
            sum += matrix[i][n - 1 - i];
        }

        // Суммирование элементов "средней" строки
        int middleRow = n / 2;
        for (int j = 0; j < n; j++) {
            sum += matrix[middleRow][j];
        }

        // Суммирование элементов "среднего" столбца
        int middleColumn = n / 2;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][middleColumn];
        }

        // Исключение повторного учета центрального элемента
        sum -= matrix[middleRow][middleColumn];

        return sum;
    }
}
