import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Assignment1_TwoSumOptimal {
    public static void main(String[] args) {
        int[] array = new int[]{2, 7, 9, 11};
        System.out.println(Arrays.toString(twoSumOptimalSolution(array, 9)));
    }

    public static int[] twoSumOptimalSolution(int[] array, int targetValue) {

        int[] result = new int[2];
        for (int each : array) {
            for (int j : array) {
                if (each == j) {
                    continue;
                }
                if (each + j == targetValue) {
                    result[0] = each;
                    result[1] = j;
                }
            }
        }

        return result;
    }
}
