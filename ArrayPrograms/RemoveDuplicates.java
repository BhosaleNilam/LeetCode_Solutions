
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3};
        
        int k = removeDuplicates(arr);
        System.out.println(k);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
        
        int newArr[] = {1,1,2,2,2,3,3};

        int m = removeDuplicatesOptimalSolution(newArr);
        
        for (int i = 0; i < m; i++) {
            System.out.print(newArr[i] + " ");
        }

        
    }
    
    //Brute Force
    public static int  removeDuplicates(int [] arr){
        
        HashSet<Integer> hashSet = new HashSet();
    
        for(int i =0; i<arr.length; i++){
            hashSet.add(arr[i]);
        }
        int k = hashSet.size();
        int j =0;
        for(int x : hashSet){
            
            arr[j] = x;
            j++;
        }
        return k;
        
    }
    
    //optimal solution 
    
     public static int  removeDuplicatesOptimalSolution(int [] arr){
        
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
        
    }
}