package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        String[][] board = new String[10][8];
        int coins = random.nextInt(1000);
        int pointX = random.nextInt(10);
        int pointY = random.nextInt(8);
        boolean coinsFound;
        coinsFound = false;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = "[]";
                System.out.print(board[i][j]);
            }
            System.out.println("");
        }

    }
}
