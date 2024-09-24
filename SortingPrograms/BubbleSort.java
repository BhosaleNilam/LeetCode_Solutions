class HelloWorld {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        int n = arr.length;
        bubble_Sort(arr,n);
        for(int i =0;i < n; i++){
           System.out.print(arr[i] +",");
           
       }
    }
    
    public static void bubble_Sort(int[] arr, int n){
        int swapCounter =0;
        for(int i=n-1; i >0; i--){
           for(int j =0; j<=i-1; j++){
               if(arr[j]> arr[j+1]){
                   int temp = arr[j];
               arr[j] = arr[j+1];
               arr[j+1] = temp;
                  swapCounter++;
               }
           }
           if(swapCounter == 0){
               break;
           }
       }
    }

}