public class TwoSum {


    public static int[] twoSum(int[] numbers, int target){
        int start = 0;
        int end = numbers.length-1;

        while(start <= end){
            int sum = numbers[start]+numbers[end];

            if(sum>target){
                end--;

            } else if (sum < target) {
                start++;

            }else{
                return new int[]{start+1, end-1};
            }
        }
        return new int[]{start+1, end-1};




    }
    public static void main(String args[]){

        int[] numArray = new int[]{2, 7, 11, 15};
        int[] result = twoSum(numArray,9);
        for (int i =0; i<result.length;i++){
            System.out.println(result[i]);
        }

    }
}
