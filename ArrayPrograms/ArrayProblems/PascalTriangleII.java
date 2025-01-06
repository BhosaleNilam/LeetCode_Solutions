package ArrayProblems;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {

    static int rowIndex = 5;

    public static void main(String args[]) {

        List<Integer> result = new ArrayList<>();
        result.add(1);

        for(int i =1; i<=rowIndex; i++){
            for(int j = result.size()-1; j>0; j--){

                result.set(j, result.get(j-1)+result.get(j));
            }
            result.add(1);
        }
        System.out.println(result);
    }


}
