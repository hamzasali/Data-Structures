public class KthLargest {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 5, 6, 8, 21, 0};
        System.out.println(getKthLargest(numbers, 2));
    }

    public static int getKthLargest(int[] array, int k) {
        MyHeap heap = new MyHeap(array.length);
        for (int i = 0; i < array.length; i++) {
            heap.insert(array[i]);
        }
        for (int i = 0; i < k - 1; i++) {
            heap.remove();
        }
        return heap.peek();
    }
}
