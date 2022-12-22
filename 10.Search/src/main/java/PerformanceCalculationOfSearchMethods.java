import java.util.Arrays;

public class PerformanceCalculationOfSearchMethods {
    public static void main(String[] args) {
        int[] numbers = new int[1000000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        long[] linearSearchResults = linearSearch(numbers, 333333);
        System.out.println("Linear Search Results:  " + linearSearchResults[0] + " miliseconds and " + linearSearchResults[1] + " comparisons..");
        long[] binarySearchResults = binarySearch(numbers, 333333);
        System.out.println("binary Search Results:  " + binarySearchResults[0] + " miliseconds and " + binarySearchResults[1] + " comparisons..");
        long[] ternarySearchResults = ternarySearch(numbers, 333333);
        System.out.println("Ternary Search Results:  " + ternarySearchResults[0] + " miliseconds and " + ternarySearchResults[1] + " comparisons..");
        long[] jumpSearchResults = jumpSearch(numbers, 333333);
        System.out.println("Jump Search Results:  " + jumpSearchResults[0] + " miliseconds and " + jumpSearchResults[1] + " comparisons..");
    }

    public static long[] linearSearch(int[] nums, int data) {
        long[] result = new long[2];
        long startTime = System.currentTimeMillis();
        int comparison = 0;
        for (int i = 0; i < nums.length; i++) {
            comparison++;
            if (nums[i] == data) {
                result[0] = System.currentTimeMillis() - startTime;
                result[1] = comparison;
                return result;
            }
        }

        return new long[2];
    }

    public static long[] binarySearch(int[] array, int data) {
        long[] result = new long[2];
        long startTime = System.currentTimeMillis();
        int comparison = 0;

        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            comparison++;
            if (array[middle] == data) {
                result[0] = System.currentTimeMillis() - startTime;
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
        long startTime = System.currentTimeMillis();
        int comparison = 0;

        int left = 0;
        int right = array.length - 1;
        while (right >= left) {
            int partitionSize = (right - left) / 3;
            int mid1 = left + partitionSize;
            int mid2 = right - partitionSize;
            comparison++;
            if (array[mid1] == data) {
                result[0] = System.currentTimeMillis() - startTime;
                result[1] = comparison;
                return result;
            }
            comparison++;
            if (array[mid2] == data) {
                result[0] = System.currentTimeMillis() - startTime;
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

    public static long[] jumpSearch(int[] array, int data) {
        long[] result = new long[2];
        long startTime = System.currentTimeMillis();
        int comparisons = 0;
        int blockSize = (int) Math.sqrt(array.length);
        int start = 0;
        int next = blockSize;
        while (start < array.length && array[next - 1] < data) {
            start = next;
            next += blockSize;
            comparisons++;
            if (next > array.length) next = array.length;
        }
        for (int i = start; i < next; i++) {
            comparisons++;
            if (array[i] == data) {
                result[0] = System.currentTimeMillis() - startTime;
                result[1] = comparisons;
                return result;
            }

        }
        return new long[2];
    }

}
