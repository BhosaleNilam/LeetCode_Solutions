package ArrayProblems;

import java.util.HashMap;

public class ContainsDuplicateII {

    static int [] nums = {1,2,3,1};
    static int k = 3;

    public static void main(String args[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i =0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                if(Math.abs(i - map.get(nums[i]))<=k){
                    System.out.println("Array contains duplicates");

                }
            }
            map.put(nums[i], i);
        }
    }


}
