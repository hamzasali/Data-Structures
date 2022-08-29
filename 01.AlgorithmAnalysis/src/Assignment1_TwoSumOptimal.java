import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Assignment1_TwoSumOptimal {
    public static void main(String[] args) {
        int[] array = new int[]{3, 7, 2, 11};
        System.out.println(Arrays.toString(twoSumOptimalSolution(array, 9)));
    }

    public static int[] twoSumOptimalSolution(int[] array, int targetValue) {

//        int[] result = new int[2];
//        for (int each : array) {
//            for (int j : array) {
//                if (each == j) {
//                    continue;
//                }
//                if (each + j == targetValue) {
//                    result[0] = each;
//                    result[1] = j;
//                }
//            }
//        }
//
//        return result;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (i != j) {
                    if (array[i] + array[j] == targetValue) return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }
}
