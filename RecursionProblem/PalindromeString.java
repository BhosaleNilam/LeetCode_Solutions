class RecursionProblem {
    public static void main(String[] args) {
        String name = "madam"; 
        var ispalindrome = palindrome(0,name);
        if(ispalindrome){
            System.out.println("String is Palindrome");
        }else{
          System.out.println("String is not Palindrome") ;
        }
        
    }

    public static boolean palindrome(int i, String name) {
        
        if (i >= name.length() / 2) {
            return true;
        }

        if(name.charAt(i) != name.charAt(name.length()-i-1)){
            return false;
        }
        return palindrome(i+1,name);
    }
}