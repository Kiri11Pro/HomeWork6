package com.pronchenko.top.homework6_1;

import com.pronchenko.top.homework6_1.tasks.Task1;
import com.pronchenko.top.homework6_1.tasks.Task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        int[][] idenityMatrix = Task1.identityMatrix(5);
        System.out.println(Arrays.deepToString(idenityMatrix));

        int[][] zeroMatrix = Task1.zeroMatrix(3,4);
        System.out.println(Arrays.deepToString(zeroMatrix));

        int[][] firstMatrix = {{2,1},{-3,0}, {4,-1}};
        int[][] secondMatrix = {{5,-1,6}, {-3,0,7}};
        int [][]sumMatrix = Task1.matrixAdditin(firstMatrix,secondMatrix);
        System.out.println(Arrays.deepToString(sumMatrix));
        int[][]matrixMul = Task1.matrixMultiplication(firstMatrix,secondMatrix);
        System.out.println(Arrays.deepToString(matrixMul));
        int[][]matrix ={{2,1,0},{3,4,5},{2,9,-4}};
        int[][]mulScal = Task1.multiplicationScalar(matrix,4);
        System.out.println(Arrays.deepToString(mulScal));

        System.out.println("Task2");
        int arrayInt[] = {1, 3, 0, -2, 7, 9};
        String arrayStr[]={"a","b","c"};
        int twoArrayInt[][] = {{2,1,0},{3,4,5}};
        float twoArrayFloat[][]= {{2.2f,1.1f,0f},{3.2f,4.6f,5f}};
        Task2.outputArray(arrayInt);
        Task2.outputArray(arrayStr);
        Task2.outputArray(twoArrayInt);
        Task2.outputArray(twoArrayFloat);



    }
}
