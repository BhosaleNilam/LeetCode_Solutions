
import java.util.*;

class UnionOfArray {
    public static void main(String[] args) {
        int [] arr = {1, 1,2,3,4,5};
        int [] arr2 = {2,3,4,4,5,6};
        
        HashSet <Integer> set =new HashSet<>();
        
        for(int i =0; i<arr.length; i++){
            set.add(arr[i]);
        }
        
        for(int i =0; i<arr2.length; i++){
            set.add(arr2[i]);
        }
        
        int arr3[] = new int[set.size()];
        
        int j =0;
        for(int i : set){
            arr3[j] = i;
            j++;
        }
        
        for(int i =0; i< arr3.length; i++){
                System.out.print(arr3[i]+" ");
        }


     
    }
    
}