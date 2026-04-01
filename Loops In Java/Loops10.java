public class Loops10 {
    public static void main(String args[]){
        int counter=1;
        do { 
            System.out.println("Hello World!");
            counter++;
        } while(counter<=10);
    }    
}
/*
A do-while loop is used when you want the code to run at least one time, 
even if the condition is false, because the condition is checked after executing 
the loop body.

In simple words
First do the work
Then check the condition
If true → repeat
If false → stop

do{
//do something
} while(condition) */