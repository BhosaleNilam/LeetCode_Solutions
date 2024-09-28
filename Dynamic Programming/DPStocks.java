import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        
        int mini = arr[0];
        int maxprofit = 0;
        
        for(int i=1; i<arr.length; i++){
            
            int curProfit = arr[i]-mini;
            maxprofit = Math.max(maxprofit, curProfit);
            mini = Math.min(arr[i], mini);
        }
        System.out.println(maxprofit);
    }
    
}