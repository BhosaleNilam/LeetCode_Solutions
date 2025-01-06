package ArrayProblems;

public class PlusOne {

    public static class AddLastDigits{
        public int[] plusOne(int[] digits) {

            int n = digits.length;
            for(int i=n-1; i>=0; i--) {
                if (digits[i] < 9) {
                    digits[i]++;
                    return digits;
                }
                digits[i]=0;
            }
                digits = new int[digits.length+1];
                digits[0]=1;
                return digits;
            }
        }
    public static void main(String args[]) {

        int[] num = {4,3,2,1};
        int val = 5;
        AddLastDigits add = new AddLastDigits();
        int[] result = add.plusOne(num);
        System.out.print(result[0]);


    }
}
