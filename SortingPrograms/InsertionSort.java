class HelloWorld {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        int n = arr.length;
        insertion_Sort(arr,n);
        for(int i =0;i < n; i++){
           System.out.print(arr[i] +",");
           
       }
    }
    
    public static void insertion_Sort(int[] arr, int n){
        for(int i= 0; i<=n-1; i++){
            int j =i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
           }
       }

}
