package com.pronchenko.top.homework6_1.tasks;

import java.util.Arrays;

public class Task2 {
    public static void outputArray(int[]arrayInt){
        System.out.println(Arrays.toString(arrayInt));
    }
    public static void outputArray(String[]arrayStr){
        System.out.println(Arrays.toString(arrayStr));
    }
    public static void outputArray(int[][]twoArrayInt){
        System.out.println(Arrays.deepToString(twoArrayInt));
    }
    public static void outputArray(float[][]twoArrayFloat){
        System.out.println(Arrays.deepToString(twoArrayFloat));
    }
}
