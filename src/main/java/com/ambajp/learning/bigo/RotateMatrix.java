package com.ambajp.learning.bigo;

public class RotateMatrix {

    public static void main(String args[]) {

        int [][] input = randomMatrix(4,5,0,15);
        printMatrix(input);

        boolean row[] = new boolean[input.length];
        boolean column[] = new boolean[input[0].length];

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if (input[i][j] ==  0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        for (int i = 0; i < row.length; i++) {
            if (row[i]) {
                for (int p = 0; p < input[0].length; p++)
                    input[i][p] = 0;
            }
        }

        for (int i = 0; i < column.length; i++) {
            if(column[i]) {
                for (int p = 0; p < input.length; p++)
                    input[p][i] = 0;
            }
        }

        System.out.println("\n\n ====================== \n\n");
        printMatrix(input);
    }

    public static int[][] randomMatrix(int M, int N, int min, int max) {
        int[][] matrix = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = randomIntInRange(min, max);
            }
        }
        return matrix;
    }

    public static int randomInt(int n) {
        return (int) (Math.random() * n);
    }

    public static int randomIntInRange(int min, int max) {
        return randomInt(max + 1 - min) + min;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 10 && matrix[i][j] > -10) {
                    System.out.print(" ");
                }
                if (matrix[i][j] < 100 && matrix[i][j] > -100) {
                    System.out.print(" ");
                }
                if (matrix[i][j] >= 0) {
                    System.out.print(" ");
                }
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
    }
}
