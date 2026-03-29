public class JavaBasics3 {
    public static void main(String args[]){
        int a = 10;
        int b = 15;
        String name = "Tony Stark";
        System.out.println("a");
        System.out.println(a);
        System.out.println(b);
        System.out.println(name);
        a=50;
        System.out.println(a);
        a=b;
        System.out.println(a);
    }  
}
/* 
Variable - 
A variable is like a container used to store value in memory.
Example - int age = 20
int is data type, age is variable name, 20 is the value stored in the variable
Definition of Variable -
A named storage location that can hold data container = value change = variable 
for example : a=20,b=10,c=10 you can change c value to 5

Literals -
Literal - universal - cannot change
A fixed value written directly in code
1 2 3 4 5 => number literals
'a','b','c','d','e','@','*' => character literals

Number literals → fixed numbers
Examples: 5, 10, -3, 3.14

Character literals → single character inside single quotes
Examples: 'a', 'A', '1', '@'

Think of literals as the actual values written in the code  like 10 or 5 they are fixed
What changes is the variable that holds a literal

x = 5   ← 5 is a literal
x = 10  ← literal changed, but by assigning a new one
👉 What changes is the value stored in the variable, not the literal itself.

int a = 10
int b = 5
a and b are variable names
10 and 5 are literals

Identifiers in Java are the names used to identify variables, methods, classes, etc.
Examples: 'age', 'totalMarks', 'Student', 'calculateSum'

How values are stored in memory ?
* Memory has small boxes (locations)
* Variable name → points to a box
* Value is stored inside that box

Example:
int x = 5;

👉 'x' → memory box → '5'
Change value:
x = 10;
👉 same box, new value stored

Every memory box has an address (number like 0x100A)
Variable name hides the address from us
Java uses the address internally
int x = 5;
👉 x → address 0x100A → value 5
You don’t see addresses in Java (unlike C) because Java handles them safely for you.
Memory varies depends on the data type.

public static void main(String args[]) meaning -
public → JVM can access this method from anywhere
static → JVM can run it without creating an object
void → returns nothing
main → program starts execution here
String args[] → used to take input from command line
👉 In short - This is the starting point of a Java program.

public class JavaBasics means:
👉 We are creating a class named JavaBasics that can be used from anywhere.
* public → accessible to all
* class → a blueprint
* JavaBasics → class name


*/