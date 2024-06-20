package nz.irontree.task;

public class ArraySolution1 {

    public int evenNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int oddNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public int primeNumber(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0 || num == 1 || num == -1) {
                continue;
            }
            boolean isNotPrime = false;
            for (int j = 2; j < Math.abs(num) / 2; j++) {
                if (num % j == 0) {
                    isNotPrime = true;
                    break;
                }
            }
            if (!isNotPrime) {
                count++;
            }
        }
        return count;
    }

    public int sumNumbers(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public int indexDifference(int[] arr) {
        int oddIndex = 0;
        int evenIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenIndex += arr[i];
            } else {
                oddIndex += arr[i];
            }
        }
        return evenIndex - oddIndex;
    }

    public int countZero(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num == 0) {
                count++;
            }
        }
        return count;
    }
}
