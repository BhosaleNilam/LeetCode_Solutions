class Main {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 4, 1,9,7};
        
        int n = arr.length;
        int d = 3;
        
        leftRotateArrayByDPlaces(arr, n, d);
        
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    
    public static void leftRotateArrayByDPlaces (int arr[], int n, int d){
        
        if(n == 0){
            return;
        }
        
        d = d % n;
        
        if(d == 0) {
            return;
        }
        
        int [] temp = new int[d];
        
        for(int i =0; i<d; i++){
            temp[i] = arr[i];
        }
        
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        int j =0;
        for(int i = n-d; i<n; i++){
            arr[i] = temp[j];
            j++;
        }
    }
}