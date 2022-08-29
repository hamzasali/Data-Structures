import java.util.Arrays;

public class Assignment1_TwoSumSolution1 {
    public static void main(String[] args) {
        int[] array = new int[]{2, 7, 9, 11};
        System.out.println(Arrays.toString(twoSumSolution1(array, 9)));
    }

    public static int[] twoSumSolution1(int[] array, int targetValue) {

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
