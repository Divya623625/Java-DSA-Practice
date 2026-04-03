public class Operators11 {
    public static void main(String[] args) {
        int a = 5; // 101
        int b = 3; // 011

        System.out.println("AND: " + (a & b));
        System.out.println("OR: " + (a | b));
        System.out.println("XOR: " + (a ^ b));
        System.out.println("NOT a: " + (~a));
        System.out.println("Left Shift: " + (a << 1));
        System.out.println("Right Shift: " + (a >> 1));
    }
}
/*
a = 5 → 101
b = 3 → 011
1. AND &
  101
& 011
-----
  001 = 1

  Output: 1

🔸 2. OR |
  101
| 011
-----
  111 = 7

  Output: 7

🔸 3. XOR ^
  101
^ 011
-----
  110 = 6

  Output: 6

🔸 4. NOT ~
Formula: ~n = -(n+1)
 ~5 = -6

🔸 5. Left Shift <<
101 << 1 → 1010 = 10
 Multiply by 2

🔸 6. Right Shift >>
101 >> 1 → 10 = 2
 Divide by 2
 */