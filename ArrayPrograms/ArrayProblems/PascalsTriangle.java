package ArrayProblems;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    static int numRows = 5;
    public static void main(String args[]) {

        List<Integer> rows, prev = null;
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for(int i =0; i<numRows; i++){
            rows = new ArrayList<>();
            for(int j=0; j<=i; j++ ){
                if(j==0 || j==i){
                    rows.add(1);
                }else{
                    rows.add(prev.get(j-1)+prev.get(j));
                }
            }
            result.add(rows);
            prev = rows;
        }
        System.out.println(result);
    }

}
