import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {


    public static boolean containsDuplicate(int[] nums){
        HashSet<Integer> hashSet = new HashSet<>();

        for (int num : nums) {
            if (hashSet.contains(num)) {
                return true;
            } else {
                hashSet.add(num);
            }
        }
        return false;

        /*Solution Second;

        Arrays.sort(nums);
        for (int i =0; i<nums.length; i++){
            if(nums[i] ==nums[i+1]) return true;
        }
        return false*/
    }

    public static void main(){

        int[]nums = {'1','3','5','1'};
        containsDuplicate(nums);
    }
}
