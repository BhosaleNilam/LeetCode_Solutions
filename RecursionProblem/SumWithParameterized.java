class RecursionProblem {
    public static void main(String[] args) {
        int sum =0;
        totalSum(3, sum);
    }
    
    public static void totalSum(int i, int sum){
        if(i < 1){
         System.out.println(sum);
         return;
        }
        totalSum(i-1, sum+i);
    }
}