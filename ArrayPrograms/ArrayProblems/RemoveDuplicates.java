package ArrayProblems;

public class RemoveDuplicates {
    public static class Duplicates {

        public int removeDuplicates(int[] num) {

            int i =0;

            for(int j=1;j<num.length; j++){
                if(num[i]!=num[j]){
                    num[i+1]=num[j];
                    i++;
                }
            }
            return i+1;

        }
    }
    public static void main(String args[]){
        int [] num = {0,0,1,1,1,2,2,3,3,4};

        Duplicates dup = new Duplicates();
        int result = dup.removeDuplicates(num);
        System.out.println("Result" +result);

        for (int i = 0; i < result; i++) {
            System.out.print(num[i]);
        }

    }
}
