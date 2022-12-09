public class LinearSearch {
    public int linear(int[] nums, int data) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == data) {
                return i;
            }
        }
        return -1;
    }
}
