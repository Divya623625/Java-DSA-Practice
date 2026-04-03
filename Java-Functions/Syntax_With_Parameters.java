import java.util.*;
public class Syntax_With_Parameters {
    public static int calculateSum(int num1,int num2){ // parameters or formal parameters 
        int sum=num1 + num2;
        return sum;
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a,b); // arguments or actual parameters
        System.out.println("Sum is: " + sum);
        sc.close();
    } 
}

/*
Syntax With Parameters
returnType methodName(dataType param1, dataType param2) {
    // code
    return statement;

Parameters (Formal Parameters) -
Parameters are variables inside a function that receive values.
public static void sum(int a, int b)  // a, b are parameters
{
    System.out.println(a + b);
}

Actual Parameters -
👉 Actual parameters are the real values you pass while calling a function.
public static void sum(int a, int b)
{
    System.out.println(a + b);
}

Call Stack in Java 
Call stack = memory area where Java stores function calls
Works like a stack (LIFO → Last In First Out)

🔁 What happens step by step:
main() starts → pushed into stack
main() calls another function → new block added on top
That function runs
When it finishes → it is removed (popped)
Control goes back to previous function
} */
