import java.util.Arrays;

public class PerformanceCalculationOfLinearSearch {
    public static void main(String[] args) {
        long[] numbers = new long[1000000];
        System.out.println(numbers.length);
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
}
