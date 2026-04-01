public class JavaBasics13 {
    public static void main(String args[]){
        char a = 'a';
        char b = 'b';
       // char c = a-b; Error
       int c = a-b;
       System.out.println(c);
       System.out.println((int)(a));
       System.out.println((int)(b));
       System.out.println(a);
       System.out.println(b-a);
    }
    
}
/*
Java Type Promotion
Type promotion happens when smaller data types are automatically converted to a larger type 
during arithmetic operations to avoid data loss.
1. Automatic Type Promotion Rules
a. byte, short, char → int during any arithmetic operation.
b. If one operand is long → result promoted to long.
c. If one operand is float → result promoted to float.
d. If one operand is double → result promoted to double.

2. Examples
byte b1 = 10, b2 = 20;
int sum = b1 + b2;   // b1 and b2 promoted to int automatically

int i = 100;
long l = 200;
long result = i + l; // i promoted to long

float f = 5.5f;
double d = 10.5;
double res = f + d;  // f promoted to double

3. Key Points
Arithmetic operations on byte, short, char → int
No automatic promotion to smaller types
Manual casting needed if assigning back to smaller type
Example - 
byte b3 = (byte)(b1 + b2); // must cast back to byte
 */