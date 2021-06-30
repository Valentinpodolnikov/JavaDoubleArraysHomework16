package com.company;

import java.util.Random;
import java.util.Scanner;

public class Task_12_5 {

    public static void main(String[] args) {
        int column = 8;
        int line = 8;
        int number[][] = new int[line][column];


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


		System.out.println("-----------");
		System.out.println("Все элементы пятой строки массива: ");

            for (int j = 0; j < column; j++) {

				System.out.printf("%-5d",+ number[5-1][j]);
            }
            System.out.println();

		System.out.println("-----------");

		Scanner input = new Scanner(System.in);
		System.out.print("Введите номер столбца массива: ");
		int enter = input.nextInt();

		for (int i = 0; i < line; i++) {

			System.out.printf("%-5d",+ number[i][enter-1]);
		}

        }



    }

