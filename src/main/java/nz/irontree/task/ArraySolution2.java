package nz.irontree.task;

public class ArraySolution2 {
    public int[] sortArray(int[] arr) {
        int num;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    num = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = num;
                    swapped = true;
                }
            }
        } while (swapped);
        return arr;
    }
}
