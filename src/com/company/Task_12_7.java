package com.company;

import java.util.Random;
import java.util.Scanner;

public class Task_12_7 {
    public static void main(String[] args) {
        int column = 8;
        int line = 8;
        int number[][] = new int[line][column];
        int change = 1949;
        int temp[] = new int[];


        Random random = new Random();

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                number[i][j] = random.nextInt(99) + 1;
            }

        }

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("%-5d", number[i][j]);
            }
            System.out.println();

        }
        Scanner input = new Scanner(System.in);
        System.out.print("Введите номер элемента, который необходимо заменить в 5-ой строке: ");
        for (int j = 0; j < column; j++) {
            int co[j] = input.nextInt();

            temp[j] = number[5 - 1][j];
            number[5 - 1][j] = change;
            change = temp[j];
            System.out.printf("%-5d", +number[5 - 1][j]);
        }
        System.out.println();

    }
}
