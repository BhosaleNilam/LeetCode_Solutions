class RecursionProblem {
    public static void main(String[] args) {
        var result = totalSum(3);
        System.out.println(result);
    }
    
    public static int totalSum(int n){
        if(n==0){
         return 0;
        }
        return n + totalSum(n-1);
    }
}