class RecursionProblem {
    public static void main(String[] args) {
        var fact = factorial(4);
        System.out.println(fact);
    }
    
    public static int factorial(int n){
        if(n==1){
         return 1;
        }
        return n * factorial(n-1);
    }
}