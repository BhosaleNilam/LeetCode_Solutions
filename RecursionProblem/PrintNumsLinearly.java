class RecursionProblems {
    public static void main(String[] args) {
        int n =4;
        printName(1, 4);
    }
    
    public static void printName(int i, int n){
        if(i > n){
            return;
        }
        System.out.println(i);
        printName(i+1, n);
        
    }
}