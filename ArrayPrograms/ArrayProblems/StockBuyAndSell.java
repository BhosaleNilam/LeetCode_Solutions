package ArrayProblems;

public class StockBuyAndSell {

    public static void main(String args[]) {
        int [] prices = {7,1,5,3,6,4};

        int max = 0, min = prices[0];

        for(int i =0; i<prices.length; i++){
            if(min < prices[i]){
                max = Math.max(prices[i]-max, max);
            }else{
                min = prices[i];
            }
        }
        System.out.println(max);
    }

}
