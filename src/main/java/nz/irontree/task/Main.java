package nz.irontree.task;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        extraTask1();
        extraTask2();
    }

    private static void extraTask1() {
        int[] arr = new int[]{5, -3, 2, 1, 7, 11, 12, -4, 1, 10};
        ArraySolution1 arraySolution = new ArraySolution1();
        System.out.println(arraySolution.evenNumbers(arr));
        System.out.println(arraySolution.oddNumbers(arr));
        System.out.println(arraySolution.primeNumber(arr));
        System.out.println(arraySolution.sumNumbers(arr));
        System.out.println(arraySolution.indexDifference(arr));
        System.out.println(arraySolution.countZero(arr));
    }

    private static void extraTask2() {
        int[] arr = new int[]{2, -3, 1, 5, 1, 4};
        ArraySolution2 arraySolution2 = new ArraySolution2();
        System.out.println(Arrays.toString(arraySolution2.sortArray(arr)));
    }
}