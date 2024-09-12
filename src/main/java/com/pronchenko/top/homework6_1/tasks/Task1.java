package com.pronchenko.top.homework6_1.tasks;

public class Task1 {
    public static int[][] identityMatrix(int size) {
        int[][] idenityMatrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            idenityMatrix[i][i] = 1;
        }
        return idenityMatrix;
    }

    public static int[][] zeroMatrix(int m, int n) {
        int[][] zeroMatrix = new int[m][n];
        return zeroMatrix;
    }

    public static int[][] matrixAdditin(int[][] firstMatrix, int[][] secondMatrix) {
        int rowFirst = firstMatrix.length;
        int columnFirst = firstMatrix[0].length;
        int rowSecond = secondMatrix.length;
        int columnSecond = secondMatrix[0].length;
        int[][] matrixAddition = new int[rowFirst][columnFirst];
        if (rowFirst == rowSecond && columnFirst == columnSecond) {
            for (int i = 0; i < rowFirst; i++) {
                for (int j = 0; j < columnFirst; j++) {
                    matrixAddition[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
                }
            }
        }
        return matrixAddition;
    }

    public static int[][] matrixMultiplication(int[][] firstMatrix, int[][] secondMatrix) {
        int rowFirst = firstMatrix.length;
        int columnFirst = firstMatrix[0].length;
        int rowSecond = secondMatrix.length;
        int columnSecond = secondMatrix[0].length;
        int row, column, columnMin, c, sum, n;
        if (rowFirst >= rowSecond) {
            row = rowFirst;
        } else {
            row = rowSecond;
        }
        if (columnFirst >= columnSecond) {
            column = columnFirst;
            columnMin = columnSecond;
        } else {
            column = columnSecond;
            columnMin = columnFirst;
        }
        int[][] matrixMultiplication = new int[row][column];
        if (rowSecond == columnFirst) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    n = 0;
                    sum = 0;
                    for (int k = 0; k < columnMin; k++) {
                        c = firstMatrix[i][n] * secondMatrix[n][j];
                        sum += c;
                        n++;
                    }
                    matrixMultiplication[i][j] = sum;
                }
            }
        }
        return matrixMultiplication;
    }

    public static int[][] multiplicationScalar(int[][] matrix, int scalar) {
        int row = matrix.length;
        int column = matrix[0].length;
        int[][] multiplicationScalar = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                multiplicationScalar[i][j] = matrix[i][j] * scalar;
            }
        }
        return multiplicationScalar;
    }

//    public static int detMatrix(int[][] matrix) {
//        int row = matrix.length;
//        int column = matrix[0].length;
//        int detMatrix;
//        int m = 0;
//        int n = 0;
//        if (row < 2 && row == column) {
//            detMatrix = matrix[m][n] * matrix[m + 1][n + 1] - matrix[m][n + 1] * matrix[m + 1][n];
//        }
//        if(row<3 && row ==column){
//            int detThree =1;
//            for (int i =0;i<row;i++){
//                for (int j =0 ; j<column;j++){
//                     detThree *=matrix[i][j];
//                     i++;
//                     j++;
//                     if (j=column){
//                         j=0;
//                     }
//                }
//            }
//        }
//
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < column; j++) {
//            }
//        }
//    }
}


