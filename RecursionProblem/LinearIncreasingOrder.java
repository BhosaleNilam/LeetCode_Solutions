class RecursionProblem {
    public static void main(String[] args) {
        int n =4;
        printName(3, 3);
    }
    
    public static void printName(int i, int n){
        if(i < 1){
            return;
        }
        printName(i-1, n);
        System.out.println(i);
    }
}