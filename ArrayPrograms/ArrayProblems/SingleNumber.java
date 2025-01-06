package ArrayProblems;

import java.util.Arrays;

public class SingleNumber {

    static int [] num = {4,1,2,1,2};

    public static void main(String args[]) {

        Arrays.sort(num);

        for(int i =0; i<num.length-1; i+=2){
            if(num[i]!= num[i+1]){
                System.out.println(num[i]);
                break;
            }
        }

        System.out.println(num.length-1);


    }

}
