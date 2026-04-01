import java.util.*;
public class JavaBasics6 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word");
        String input = sc.next();
        System.out.println(input);

        sc.nextLine();

        System.out.print("Enter a line");
        String input1 = sc.nextLine();
        System.out.println(input1);

        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println(name);
        
        System.out.println("Enter a integer");
        int number = sc.nextInt();
        System.out.println(number);
        
        System.out.println("Enter a float");
        float price=sc.nextFloat();
        System.out.println(price);
        
        System.out.println("Enter a double");
        double d=sc.nextDouble();
        System.out.println(d);
        
        System.out.println("Enter a long");
        long l = sc.nextLong();
        System.out.println(l);
        
        System.out.println("Enter a character");
        char c = sc.next().charAt(0);
        System.out.println(c);

        System.out.println("Enter a byte");
        byte b = sc.nextByte();
        System.out.println(b);

        System.out.println("Enter a short");
        short s = sc.nextShort();
        System.out.println(s);

        System.out.println("Enter true/false");
        boolean bool = sc.nextBoolean();
        System.out.println(bool);

        sc.close();
    } 
}

/*
Input in Java means taking values from the user at runtime.

Common input methods-
nextInt() → integer
nextFloat() → float
nextDouble() → double
nextLong() → long
next() → single word String
nextLine() → full line String
nextChar() → ❌ (not directly, use next().charAt(0)) => char ch = sc.next().charAt(0);
nextBoolean 
nextShort
nextByte

Scanner class is a Java class used to take input from the user (keyboard).
Scanner → input class
sc → reference variable
new Scanner(System.in) → creates object to read keyboard input

next()
Reads only one word
Stops at space
Example input: Hello World → reads Hello

nextLine()
Reads the entire line
Includes spaces
Example input: Hello World → reads Hello World

Difference between long and double
Use long for big integers.
Use double for decimal numbers.

In Java, byte means a very small integer type.
Size: 1 byte = 8 bits
Range: -128 to 127

In Java, short is also an integer type, but bigger than byte.
Size: 2 bytes = 16 bits
Range: -32,768 to 32,767

byte → 1 byte → from -128 to 127
short → 2 bytes → from -32,768 to 32,767
int → 4 bytes → from -2,147,483,648 to 2,147,483,647
long → 8 bytes → from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float → 4 bytes → approximately ±3.4 × 10^-38 to ±3.4 × 10^38
double → 8 bytes → approximately ±1.7 × 10^-308 to ±1.7 × 10^308
char → 2 bytes → 0 to 65,535 (Unicode characters)
boolean → 1 bit → true or false

Methods that leave the leftover Enter (\n) in the buffer:
nextInt() → reads only number, leaves Enter
nextDouble() → reads only number, leaves Enter
nextFloat() → reads only number, leaves Enter
nextLong() → reads only number, leaves Enter
nextShort() → reads only number, leaves Enter
nextByte() → reads only number, leaves Enter

Methods that DO NOT leave leftover Enter:
next() → reads a single word (stops at space), leaves Enter if you press Enter, so sometimes you clear it before nextLine()
nextLine() → reads everything until Enter, consumes Enter
next().charAt(0) → reads a single character, leaves Enter
*/
