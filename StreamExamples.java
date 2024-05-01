import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamExamples {

    public static void main(String a[]){
        List<Integer> nums = Arrays.asList(4,7,9,10,2,15,6,3);

        Consumer<Integer> con = new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {

                System.out.println(n);

            }
        };
        nums.forEach(con);
        int sum =0;
        for(int n: nums){
            if(n%2==0){
                n = n*2;
                sum = sum +n;

            }
        }
       // System.out.println(sum);



    }
}
