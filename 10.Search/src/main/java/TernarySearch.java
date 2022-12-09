public class TernarySearch {
    public static int ternarySearch(int[] array, int data) {
        int left = 0;
        int right = array.length - 1;
        while (right >= left) {
            int partitionSize = (right - left) / 3;
            int mid1 = left + partitionSize;
            int mid2 = right - partitionSize;

            if (array[mid1] == data) return mid1;
            if (array[mid2] == data) return mid2;

            if (data < array[mid1]) {
                right = mid1 - 1;
            } else if (data > array[mid2]) {
                left = mid2 + 1;
            } else {
                left = mid1 + 1;
                right = mid2 - 1;
            }
        }
        return -1;
    }

    public static int ternarySearchRecursive(int[] array, int data, int left, int right) {
        if (left > right) {
            return -1;
        }
        int partitionSize = (right - left) / 3;
        int mid1 = left + partitionSize;
        int mid2 = right - partitionSize;
        if (array[mid1] == data) return mid1;
        if (array[mid2] == data) return mid2;

        if (data < array[mid1]) {
            return ternarySearchRecursive(array, data, left, mid1 - 1);
        }
        if (data > array[mid2]) {
            return ternarySearchRecursive(array, data, mid2 + 1, right);
        } else {
            return ternarySearchRecursive(array, data, mid1 + 1, mid2 - 1);
        }


    }
}
