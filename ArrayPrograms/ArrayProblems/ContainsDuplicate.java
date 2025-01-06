package ArrayProblems;

import java.util.HashMap;

public class ContainsDuplicate {

    static int [] nums = {1,2,3,1};

    public static void main(String args[]) {
        HashMap<Integer, Integer> hashMap = new HashMap();
        for(int num : nums){
            if(hashMap.containsKey(num)){
                System.out.println("Array contains duplicates");

            }else{
                hashMap.put(num, 1);
            }
        }


    }


    }
