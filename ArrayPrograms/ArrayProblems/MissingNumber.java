package ArrayProblems;

public class MissingNumber {

    public static void main(String args[]) {

       int [] nums = {9,6,4,2,3,5,7,0,1};
        int n = nums.length;

        int expectedSum = n*(n+1)/2;
        int actualSum = 0;

        for(int i =0; i<n; i++){
            actualSum = actualSum+nums[i];
        }
        System.out.println("Missing Number: " + (expectedSum - actualSum));
    }
}
