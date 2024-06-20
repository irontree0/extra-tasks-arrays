package nz.irontree.task;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        extraTask1();
        extraTask2();
    }

    private static void extraTask1() {
        // Дополнительное задание Работа с массивами 1
        int[] arr = new int[]{5, -3, 2, 1, 7, 11, 12, -4, 1, 10};

        ArraySolution1 arraySolution = new ArraySolution1();
        // 1. количество четных чисел в массиве
        System.out.println(arraySolution.evenNumbers(arr));
        // 2. количество нечетных чисел в массиве
        System.out.println(arraySolution.oddNumbers(arr));
        // 3. количество простых чисел в массиве
        System.out.println(arraySolution.primeNumber(arr));
        // 4. сумму всех чисел в массиве
        System.out.println(arraySolution.sumNumbers(arr));
        // 5. разность между суммой чисел имеющих четный индекс и суммой чисел имеющих нечетный индекс в массиве
        System.out.println(arraySolution.indexDifference(arr));
        // 6. количество 0 (сколько раз встречается число "0") в массиве
        System.out.println(arraySolution.countZero(arr));
    }

    private static void extraTask2() {
        // Дополнительное задание Работа с массивами 2
        int[] arr = new int[]{2, -3, 1, 5, 1, 4};

        ArraySolution2 arraySolution2 = new ArraySolution2();
        System.out.println(Arrays.toString(arraySolution2.sortArray(arr)));
    }
}