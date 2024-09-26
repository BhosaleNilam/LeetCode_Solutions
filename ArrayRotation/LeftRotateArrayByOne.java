class LeftRotateArrayByOne {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 4, 1};
        int temp = arr[0];
        int n = arr.length;
        for(int i =1; i<n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        for(int i =0; i<n; i++){
            System.out.print(arr[i] +",");
        }
        
    }
}