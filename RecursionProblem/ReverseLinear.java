class RecursionProblem {
    public static void main(String[] args) {
        int n =4;
        printName(4, 1);
    }
    
    public static void printName(int i, int n){
        if(i < n){
            return;
        }
        System.out.println(i);
        printName(i-1, n);
        
    }
}