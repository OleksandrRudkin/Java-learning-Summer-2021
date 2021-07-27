package com.rudkin.intsreamhomework;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Random;

public class IntStreamHomeWork {
    private int[] intStrArr;

    public IntStreamHomeWork(int[] intStrArr) {
        this.intStrArr = intStrArr;
    }

    public int[] getIntStrArr() {
        return intStrArr;
    }

    public void setIntStrArr(int[] intStrArr) {
        this.intStrArr = intStrArr;
    }


    public static void fillArrRangeInclusiveZeroTen(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(10);
        }
    }

    public static long countGreaterThanZeroElem(int[] array) {
                return Arrays.stream(array)
                        .filter(s -> s > 0)
                        .count();
    }
    public static long countZeroElem(int[] array) {
               return Arrays.stream(array)
                        .filter(s -> s == 0)
                        .count();
    }

    public static int[] multiplyElem(int[] array, int factor) {
        return Arrays.stream(array)
                .map(x -> x * factor)
                .toArray();
    }

    public static double averageElem(int[] array) throws NoSuchElementException {
        return Arrays.stream(array)
                .average()
                .getAsDouble();
    }


}
