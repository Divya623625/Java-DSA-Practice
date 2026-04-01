public class Operators4 {
    public static void main(String[] args){
        
        System.out.println(3<2 && 5>3); //False
        System.out.println(3>2 && 5>3); //True
        System.out.println(3<2 && 5<3); //False
        System.out.println(3>2 && 5<3); //False

        System.out.println(3<2 || 5>3); //True
        System.out.println(3>2 || 5>3); //True
        System.out.println(3<2 || 5<3); //False
        System.out.println(3>2 || 5<3); //True

        System.out.println(!(3>2)); //False
        System.out.println(!(0>5)); //True
    }
}
/* 
1. Logical AND (&&)
Evaluates to true only if both operands are true.
If any operand is false, the result is false.

2. Logical OR (||)
Evaluates to true if at least one operand is true.
Only false if both operands are false.

3. Logical NOT (!)
Reverses the boolean value.
true becomes false, and false becomes true.
*/

