
class HelloWorld {
    public static void main(String[] args) {
        int [] arr = {1, 4, 5, 2, 3, 9, 7, 15};
        int d = 3;
        int n = arr.length;
        int [] temp = new int[d];
        for(int i =n-d; i<n; i++){
            temp[i-(n-d)] = arr[i];
        }
        
       for (int i = n - d - 1; i >= 0; i--) {
            arr[i + d] = arr[i];
        }
        
        for (int i = 0; i < d; i++) {
            arr[i] = temp[i];
        }
        
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
}