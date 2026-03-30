public class Loops13 {
    public static void main(String args[]){
        for(int i=1; i<=5; i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
    } 
}

/*
Why we write Scanner sc = new Scanner(System.in);
Scanner → class used to take input
sc → variable name (we can name it anything)
new Scanner(System.in) → creates Scanner object
System.in → takes input from keyboard */  
