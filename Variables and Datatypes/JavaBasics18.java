// Question 4: What will be the type of result in the following Java code?
// (Hint : Look at the largest data type among these)
public class JavaBasics18{
    public static void main(String args[]){
        byte b=4;
        char ch='a';
        short s=512;
        int i =1000;
        float f=3.14f;
        double d=99.9954;
        double result=(f*d)+(i%ch-(d*s)+b);
        System.out.println(result);
    }
}
// In the mentioned code, the result variable will be of double type because of type conversion

/*
Question 5: (Advanced) Will the following statement give any error in Java
int $ = 24;
No, the statement will not give any error.
Names of variables are called identifiers in Java. 
Identifier rule says:
identifiers can start with any alphabet or underscore (“_”) or dollar (“$”).
According to the rule the given variable name is a valid identifier
 */