
class HelloWorld {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        int n = arr.length;
        int mini;
        
       for(int i =0;i < n-2; i++){
           
           mini = i;
           for(int j =i; j<=n-1; j++){
               if(arr[j]<arr[mini]){
                   mini = j;
               }
               int temp = arr[mini];
               arr[mini] = arr[i];
               arr[i] = temp;
              
           }
       }
       
       for(int i =0;i < n; i++){
           System.out.print(arr[i] +",");
           
       }
       

}

}

