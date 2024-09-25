
class HelloWorld {
    public static void main(String[] args) {
        int[] arr = {1,4,6,8,9};
        
        boolean val = checkIfArrayIsSorted(arr);
        System.out.println(val);
        
    }
    
    public static boolean checkIfArrayIsSorted(int [] arr){
        
        for(int i =1; i<arr.length; i++){
            if(arr[i]>=arr[i-1]){
                
            }else{
                return false;
            }
        }
        return true;
        
    }
}