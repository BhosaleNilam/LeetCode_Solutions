package ArrayProblems;

import java.util.HashMap;

public class MajorityElement {

    static int [] nums = {2,2,1,1,1,2,2};
    public static void main(String args[]) {

        int num;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i : nums){
            if(!hashMap.containsKey(i)){
                hashMap.put(i,1);
            }else{
                hashMap.put(i,hashMap.get(i)+1);
            }
            if(hashMap.get(i)>nums.length/2){
                System.out.println(i);
            }
        }
    }


    }
