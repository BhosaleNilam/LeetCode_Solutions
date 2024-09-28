class RecursionProblem {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 8, 3, 9, 4, 5};  
        reverseArray(0, numbers, numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void reverseArray(int i, int[] arr, int n) {
        // Base case: when we reach the middle of the array
        if (i >= n / 2) {
            return;
        }

        // Swap elements at index i and n-i-1
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;

        // Recursive call with incremented index
        reverseArray(i + 1, arr, n);
    }
}
