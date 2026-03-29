public class JavaBasics5 {
    public static void main(String args[]){
        
        int A = 10;
        A=A+10; // A+=10
        System.out.println(A);

        int B = 5;
        B-=5; // B=B-5
        System.out.println(B);

        int C = 10;
        C*=5; //C=C*5
        System.out.println(C);

        int D = 10;
        D/=5; //D=D*5
        System.out.println(D);

        int E = 10;
        E%=2; //E=E%2
        System.out.println(E);
    }
    
}

/*
OPERATOR PRECEDENCE IN JAVA 

Meaning of Operator Precedence
* Operator precedence defines the priority of operators.
* When an expression contains more than one operator, Java decides which one to execute first using precedence rules.
* Wrong understanding of precedence can lead to wrong output.

Why Operator Precedence is Needed
Example:
int x = 10 + 2 * 3;

=>  * has higher precedence than +
=>  Multiplication happens first
=>  Result = 16

Operator Precedence Order (Highest → Lowest)
1. Postfix: expr++, expr--
2. Unary: ++expr, --expr, +expr, -expr, ~, !
3. Multiplicative: *, /, %
4. Additive: +, -
5. Shift: <<, >>, >>>
6. Relational: <, >, <=, >=, instanceof
7. Equality: ==, !=
8. Bitwise AND: &
9. Bitwise XOR: ^
10. Bitwise OR: |
11. Logical AND: &&
12. Logical OR: ||
13. Ternary: ? :
14. Assignment: =, +=, -=, *=, /=, %= etc.

Tip: Operators higher in the list get executed first.

Associativity of Operators -
👉 It tells which side (left or right) the expression is solved when same priority operators come together.

Here is associativity of Java operators (with direction):
Postfix (expr++, expr--) → Left to Right
Unary (++expr, --expr, +, -, !, ~) → Right to Left
Multiplicative (*, /, %) → Left to Right
Additive (+, -) → Left to Right
Shift (<<, >>, >>>) → Left to Right
Relational (<, >, <=, >=, instanceof) → Left to Right
Equality (==, !=) → Left to Right
Bitwise AND (&) → Left to Right
Bitwise XOR (^) → Left to Right
Bitwise OR (|) → Left to Right
Logical AND (&&) → Left to Right
Logical OR (||) → Left to Right
Ternary (?:) → Right to Left
Assignment (=, +=, -=, etc.) → Right to Left

💡 Super simple memory:
👉 Only Unary, Ternary, Assignment → Right to Left
👉 All others → Left to Right
*/