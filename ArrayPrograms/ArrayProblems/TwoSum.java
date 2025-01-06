package ArrayProblems;

import java.util.HashMap;

public class TwoSum {

    public static class Solution {

        public int[] twoSum(int[] arr, int target) {
            HashMap<Integer, Integer> hashMap = new HashMap<>();

            for (int i = 0; i < arr.length; i++) {
                int diff = target - arr[i];
                if (hashMap.containsKey(diff)) {
                    return new int[]{hashMap.get(diff), i};
                } else {
                    hashMap.put(arr[i], 1);
                }
            }
            return new int[]{};
        }
    }

    public static void main(String args[]){
        int [] num = {2,7,11,15};
        int target = 9;

        Solution solution = new Solution();
        int [] result = solution.twoSum(num, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");


    }
}

