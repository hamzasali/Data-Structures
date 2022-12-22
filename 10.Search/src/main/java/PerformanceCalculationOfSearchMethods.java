import java.util.Arrays;

public class PerformanceCalculationOfSearchMethods {
    public static void main(String[] args) {
        long[] numbers = new long[1000000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        System.out.println(Arrays.toString(linear(numbers, 333333)));
    }

    public static long[] linear(long[] nums, int data) {
        long[] result = new long[2];
        long start = System.currentTimeMillis();
        int comparison = 0;
        for (int i = 0; i < nums.length; i++) {
            comparison++;
            if (nums[i] == data) {
                result[0] = System.currentTimeMillis() - start;
                result[1] = comparison;
                return result;
            }
        }

        return new long[2];
    }

    public static long[] binarySearch(int[] array, int data) {
        long[] result = new long[2];
        long start = System.currentTimeMillis();
        int comparison = 0;

        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            comparison++;
            if (array[middle] == data) {
                result[0] = System.currentTimeMillis() - start;
                result[1] = comparison;
                return result;
            }
            comparison++;
            if (data < array[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return new long[2];
    }

    public static long[] ternarySearch(int[] array, int data) {
        long[] result = new long[2];
        long start = System.currentTimeMillis();
        int comparison = 0;

        int left = 0;
        int right = array.length - 1;
        while (right >= left) {
            int partitionSize = (right - left) / 3;
            int mid1 = left + partitionSize;
            int mid2 = right - partitionSize;

            if (array[mid1] == data) {
                result[0] = System.currentTimeMillis() - start;
                result[1] = comparison;
                return result;
            }
            if (array[mid2] == data) {
                result[0] = System.currentTimeMillis() - start;
                result[1] = comparison;
                return result;
            }
            comparison++;
            if (data < array[mid1]) {
                right = mid1 - 1;
            } else if (data > array[mid2]) {
                left = mid2 + 1;
            } else {
                left = mid1 + 1;
                right = mid2 - 1;
            }
            comparison++;
        }
        return new long[2];
    }



}
