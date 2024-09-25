
//Better Solution to find second largest

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int [] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        
        int largest = arr[0];
        
        for(int i =0; i<arr.length; i++){
            if(arr[i]> largest){
                largest = arr[i];
            }
        }
        
        int slargest = -1;
        
        for(int i =0; i<arr.length; i++){
            if(arr[i]> slargest && arr[i] != largest){
                slargest = arr[i];
            }
        }
        
    
        System.out.println("Second Largest element in the array is :" +slargest);
       
        
    }
}

