public class JavaBasics4 {
    public static void main(String args[]){
        byte b = 8;
        System.out.println(b);
        char ch='A';
        System.out.println(ch);
        boolean var=true ; // Or False
        System.out.println(var);
        float price = 10.2f; // Why f is needed in Java - 3.14 → double (default) - 3.14f → float 
        // => Java does not allow automatic double → float conversion
        System.out.println(price);
        int number=25;
        System.out.println(number);
        long distance = 123456789L;
        System.out.println(distance);
        double price1 = 99.99;
        System.out.println(price1);
        short age = 25;
        System.out.println(age);
    }
}

/*
Data Types in Java
Data type = tells Java what type of value a variable can store.

1) Primitive Data Types (8 types)
Store simple values.
byte → 1 byte → stores small integers
short → 2 bytes → stores bigger integers than byte
int → 4 bytes → most commonly used integer
long → 8 bytes → very large integers
float → 4 bytes → decimal numbers (single precision)
double → 8 bytes → decimal numbers (more accurate)
char → 2 bytes → single character ('A', '1')
boolean → 1 bit → true or false

👉 Example:
int age = 20;
float marks = 85.5f;
char grade = 'A';
boolean pass = true;

2) Non-Primitive Data Types
Store multiple values or complex data.
String → stores text
Array → stores multiple values of same type
Class → blueprint of objects
Object → instance of a class
Interface

👉 Example:
String name = "Divya";
int[] nums = {1, 2, 3};

Java is a Typed Language
Typed language = you must tell the data type of a variable before using it.
👉 In Java-
int age = 20;
Here, int is the data type → Java knows age stores only integers.

Why Java is typed?
Prevents errors
Makes programs safe
Checks types at compile time
Java is a statically typed language.

Non-typed language = you do NOT declare data type explicitly.
👉 Example (Python)-
age = 20
age = "twenty"
Same variable can store different types.

Features -
Easy to write
Type decided at runtime
More flexible but less strict
These are also called dynamically typed languages.

Typed Languages -
(You must declare the data type)
C → Typed (statically typed)
C++ → Typed (statically typed)
Java → Typed (statically typed)

Non-Typed Languages -
(Data type not declared explicitly)
Python → Non-typed (dynamically typed)
JavaScript → Non-typed (dynamically typed)

Java data type sizes 
byte → 1 byte
short → 2 bytes
int → 4 bytes => -2B to 2B => −2,147,483,648 to +2,147,483,647 
long → 8 bytes
float → 4 bytes
double → 8 bytes
char → 2 bytes => 'a' to 'z', 'A' to 'Z', '@', '%', ','
boolean → 1 bit (depends on JVM, but logically 1 bit) => true or false
1 Byte = 8 bits

What are Non-Primitive Data Types?
* Also called Reference Data Types
* They store address/reference, not actual value
* Size is not fixed
* Can store multiple values and methods
Examples -
String
Array
Class
Object
Interface

 */