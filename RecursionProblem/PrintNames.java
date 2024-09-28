class HelloWorld {
    public static void main(String[] args) {
        int counter =0;
        printName(counter);
    }
    
    public static void printName(int counter){
        if(counter == 5){
            return;
        }
        counter++;
        System.out.println("My name is Nilam");
        printName(counter);
        
    }
}