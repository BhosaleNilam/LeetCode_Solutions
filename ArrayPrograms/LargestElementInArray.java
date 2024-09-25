
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
        
        System.out.println("Largest element in the array is :" +largest);
       
        
    }

}

