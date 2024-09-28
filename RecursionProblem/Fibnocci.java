class RecursionProblem {
    public static void main(String[] args) {
        int num = 4;
        var result = fibnocci(num);
        System.out.println(result);
        
    }

    public static int fibnocci(int num) {
        
        if (num <=1) {
            return num;
        }
        int last = fibnocci(num-1);
        int sLast = fibnocci(num-2);
        return last + sLast;
    }
}
