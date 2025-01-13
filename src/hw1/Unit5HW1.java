package hw1;

import java.util.Random;
import java.util.Scanner;

public class Unit5HW1 {
    public static void main(String[]args){
        //unit5HW();
        twoDArrayPractice();
    }
    public static void unit5HW() {
        Random rand = new Random();

        //R7.6


        //R7.7

        //a) 1 2 3 4 5 6 7 8 9 10
        int numAddedA = 1;
        int[] arrayA = new int[10];
        for (int i = 0; i < 10; i++) {
            arrayA[i] = numAddedA;
            numAddedA++;
        }

        //b) 0 2 4 6 8 10 12 14 16 18 20
        int numAddedB = 0;
        int[] arrayB = new int[11];
        for (int i = 0; i < 11; i++){
            arrayB[i] = numAddedB;
            numAddedB += 2;
        }

        //c) 1 4 9 16 25 36 49 64 81 100
        int numAddedC = 1;
        int[] arrayC = new int[10];
        for (int i = 0; i < 10; i++){
            arrayC[i] = (numAddedC)^2;
            numAddedC++;
        }

        //d) 0 0 0 0 0 0 0 0 0 0
        int[] arrayD = new int[10];

        //e)
        int[] arrayE = {1, 4, 9, 16, 9, 7, 4, 9, 11};

        //R7.8
        int[] array8 = new int[10];
        int toAdd = 0;
        array8[0] = rand.nextInt(0,100);
        for (int i = 1; i < 10; i++){
            toAdd = rand.nextInt(0,100);
            if(toAdd != array8[i-1]){
                array8[i] = toAdd;
            }else{
                toAdd = rand.nextInt(0,100);
                array8[i] = toAdd;
            }
        }

        //R7.9


        //R7.10


        //R7.11


        //R7.12
    }
    public static void twoDArrayPractice(){
        Scanner input = new Scanner(System.in);

        String r1c1 = "1";
        String r1c2 = "2";
        String r1c3 = "3";
        String r2c1 = "4";
        String r2c2 = "5";
        String r2c3 = "6";
        String r3c1 = "7";
        String r3c2 = "8";
        String r3c3 = "9";

        String[][] ticTacToe = {{r1c1,r1c2,r1c3},{r2c1,r2c2,r2c3},{r3c1,r3c2,r3c3}};
        int count = 0;
        int userMove = 0;
        while (count < 8) {
            for (int i = 0; i < 3; i++) {
                System.out.print(ticTacToe[0][i] + " | ");
            }
            System.out.println("\n----------");
            for (int i = 0; i < 3; i++) {
                System.out.print(ticTacToe[1][i] + " | ");
            }
            System.out.println("\n----------");
            for (int i = 0; i < 3; i++) {
                System.out.print(ticTacToe[2][i] + " | ");
            }

            System.out.println("\nMove for X:");
             userMove = input.nextInt();
            switch (userMove) {
                case 1:
                    r1c1 = "X";
                    break;
                case 2:
                    r1c2 = "X";
                    break;
                case 3:
                    r1c3 = "X";
                    break;
                case 4:
                    r2c1 = "X";
                    break;
                case 5:
                    r2c2 = "X";
                    break;
                case 6:
                    r2c3 = "X";
                    break;
                case 7:
                    r3c1 = "X";
                    break;
                case 8:
                    r3c2 = "X";
                    break;
                case 9:
                    r3c3 = "X";
                    break;
            }
            for (int i = 0; i < 3; i++){
                System.out.print(ticTacToe[0][i] +" | ");
            }
            System.out.println("\n----------");
            for (int i = 0; i < 3; i++){
                System.out.print(ticTacToe[1][i] +" | ");
            }
            System.out.println("\n----------");
            for (int i = 0; i < 3; i++){
                System.out.print(ticTacToe[2][i] +" | ");
            }

            count ++;

            System.out.println("\nMove for O:");
            userMove = input.nextInt();
            switch (userMove) {
                case 1:
                    r1c1 = "O";
                    break;
                case 2:
                    r1c2 = "O";
                    break;
                case 3:
                    r1c3 = "O";
                    break;
                case 4:
                    r2c1 = "O";
                    break;
                case 5:
                    r2c2 = "O";
                    break;
                case 6:
                    r2c3 = "O";
                    break;
                case 7:
                    r3c1 = "O";
                    break;
                case 8:
                    r3c2 = "O";
                    break;
                case 9:
                    r3c3 = "O";
                    break;
            }

            for (int i = 0; i < 3; i++){
                System.out.print(ticTacToe[0][i] +" | ");
            }
            System.out.println("\n----------");
            for (int i = 0; i < 3; i++){
                System.out.print(ticTacToe[1][i] +" | ");
            }
            System.out.println("\n----------");
            for (int i = 0; i < 3; i++){
                System.out.print(ticTacToe[2][i] +" | ");
            }

            count ++;

        }
    }
}
