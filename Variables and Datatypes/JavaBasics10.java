public class JavaBasics10 {
    public static void main(String args[]){
        int a = 25;
        long b = a;
        // long a = 25;
        // int b = a;
        System.out.println(b);       
    }
}
/*
Type Conversion in Java
Type conversion is the process of converting a value from one data type to another.
There are two types of type conversion -

1. Widening Conversion (Implicit/Automatic)
Smaller data type → Larger data type
Done automatically by Java.
No data loss.

Example:
int i = 100;
long l = i;   // int → long
float f = i;  // int → float

Order of widening:
byte → short → int → long → float → double
char → int → long → float → double

2. Narrowing Conversion (Explicit/Manual)
Larger data type → Smaller data type
Must be done manually using casting
Possible data loss if value doesn’t fit.

Syntax:
datatype variable = (datatype) value;

double d = 100.04;
int i = (int) d;  // double → int, value becomes 100
long l = 1000;
short s = (short) l;  // long → short

Key Points =>
Widening = safe, automatic.
Narrowing = risky, manual casting needed.
char can convert to int automatically but not to boolean.
boolean cannot be converted to any other type.

Type conversion happens when:
Type compatible - Two data types can work together in an assignment or operation without causing an error.
destination type > source type
*/