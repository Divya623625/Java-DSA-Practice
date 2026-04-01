import java.util.*;
public class Operators1{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println("Addition = " +  (A + B));
        System.out.println("Subtraction = " +  (A - B));
        System.out.println("Multiplication = " +  (A * B));
        System.out.println("Division = " +  (A / B));
        System.out.println("Modulus = " +  (A % B));
        sc.close();
    }
}
/*
Java Operators
1. What are Operators?
Operators are special symbols in Java that are used to perform operations on variables and values.
They are like shortcuts for common operations such as addition, comparison, or logical tests.
Example: +, -, *, /, %, ==, && are all operators.

2. Types of Operators in Java
Java operators are broadly divided into 8 types:

2.1 Arithmetic Operators
Used to perform basic math operations.
Operators: +, -, *, /, %
Explanation:
+ → Addition, e.g., 5 + 3 = 8
- → Subtraction, e.g., 5 - 2 = 3
* → Multiplication, e.g., 5 * 2 = 10
/ → Division, e.g., 5 / 2 = 2 (integer division)
% → Modulus (remainder), e.g., 5 % 2 = 1

2.2 Unary Operators
Used with one operand only.
Operators: +, -, ++, --, !
Explanation:
+ → unary plus (positive number, rarely used)
- → unary minus (negative number)
++ → increment by 1
Pre-increment: ++x → increase first, then use
Post-increment: x++ → use first, then increase
-- → decrement by 1 (works like increment)
! → logical NOT (reverses boolean value)

2.3 Assignment Operators
Used to assign values to variables.
Operators: =, +=, -=, *=, /=, %=
Explanation:
= → simple assignment, e.g., x = 5
+= → add and assign, e.g., x += 3 is same as x = x + 3
-= → subtract and assign
*= → multiply and assign
/= → divide and assign
%= → remainder and assign

2.4 Relational Operators
Used to compare two values.
Operators: ==, !=, >, <, >=, <=
Explanation:
== → checks if two values are equal
!= → checks if two values are not equal
> → greater than
< → less than
>= → greater than or equal to
<= → less than or equal to
Result: always true or false

2.5 Logical Operators
Used to combine multiple boolean expressions.
Operators: &&, ||, !
Explanation:
&& → AND → true if both conditions are true
|| → OR → true if any one condition is true
! → NOT → reverses the boolean value

2.6 Bitwise Operators
Operate at the binary (bit) level of integers.
Operators: &, |, ^, ~, <<, >>, >>>
Explanation:
& → AND → 1 if both bits are 1
| → OR → 1 if any bit is 1
^ → XOR → 1 if bits are different
~ → NOT → inverts bits
<< → left shift → shifts bits to left, multiplies by 2
>> → right shift → shifts bits to right, divides by 2
>>> → unsigned right shift → shifts right, fills 0

2.7 Ternary Operator (?:)
Shortcut for if-else statements.
Syntax: (condition) ? value_if_true : value_if_false
Example:
int max = (a > b) ? a : b;
Checks if a > b, if yes assigns a to max, else assigns b.

2.8 instanceof Operator
Used to check object type.
Syntax: object instanceof ClassName
Example:if(obj instanceof String) {
    System.out.println("It is a String");
}
“Is the object name a String?” → Yes → true

✅ Summary:
Operators are symbols for operations.
Java operators can be Arithmetic, Unary, Assignment, Relational, Logical, Bitwise, Ternary, and instanceof.
Choosing the correct operator depends on the type of operation you want to perform.*/