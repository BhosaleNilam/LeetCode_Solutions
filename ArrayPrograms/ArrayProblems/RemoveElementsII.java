package ArrayProblems;

public class RemoveElementsII {
    public static class Duplicates2 {

        public int removeDuplicates(int[] num, int val) {

            int count =0;

            for(int i =0; i<num.length; i++){
                if(num[i]!=val){
                    num[count]= num[i];
                    count++;
                }
            }
            return count;
        }
    }
    public static void main(String args[]){
        int [] num = {3,2,2,3};
        int val=3;

        Duplicates2 dup = new Duplicates2();
        int result = dup.removeDuplicates(num, val);
        System.out.println("Result" +result);

        for (int i = 0; i < result; i++) {
            System.out.print(num[i]);
        }

    }
}
