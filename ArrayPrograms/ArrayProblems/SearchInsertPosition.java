package ArrayProblems;

public class SearchInsertPosition {

    public static class Search{
        public int searchInsert(int[] nums, int target) {

            int start = 0;
            int end = nums.length-1;

            while(start < end){
                int mid = (start +end)/2;
                if(nums[mid]==target){
                    return mid;

                }else if(nums[mid]>target){
                    end = mid -1;
                }else{
                    start = mid+1;
                }
            }
            return start;
        }
    }

    public static void main(String args[]) {

        int [] num = {1,3,5,6};
        int val=5;

        Search search = new Search();
        int result = search.searchInsert(num, val);
        System.out.print(result);

    }

    }

