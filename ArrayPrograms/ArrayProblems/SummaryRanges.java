package ArrayProblems;

import java.util.ArrayList;

public class SummaryRanges {

    static int [] nums = {0,1,2,4,5,7};
    public static void main(String args[]) {

        ArrayList<String> a=new ArrayList<String>();

        int n = nums.length;

        for(int i =0; i<n; i++){
            int temp = nums[i];
            while(i+1<n && nums[i]+1 == nums[i+1]){
                i++;
            }
            if(temp != nums[i]){
                a.add(""+temp+"->"+nums[i]);
            }else{
                a.add(""+temp);
            }
        }
        System.out.println(a);



    }

    }
