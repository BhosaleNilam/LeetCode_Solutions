
//Optimal Solution to find second largest

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int [] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        int largest = arr[0];
        int secondLargest = getSecondLargest(arr);
        int secondSmallest = getSecondSmallest(arr);
        System.out.println("Second largest element in the array is " + secondLargest);
         System.out.println("Second smallest element in the array is " + secondSmallest);
    }
    
    public static int getSecondLargest(int [] arr){
        
        int largest = arr[0];
        int slargest = -1;
        
        for(int i =0; i< arr.length; i++){
            if(arr[i]> largest){
                slargest = largest;
                largest = arr[i];
            }else if (arr[i]< largest && arr[i] > slargest){
                slargest = arr[i];
            }
            
        }
        return slargest;
    }
    
        public static int getSecondSmallest(int [] arr){
            int smallest = arr[0];
            int secondSmallest = Integer.MAX_VALUE;
            
            for(int i =1; i<arr.length; i++){
                
                if(arr[i]<smallest){
                    secondSmallest = smallest;
                    smallest = arr[i];
                }else if(arr[i] != smallest && arr[i] < secondSmallest){
                   secondSmallest = arr[i];

                }
                
            }
            return secondSmallest;
        }
}

