public class JavaBasics12 {
    public static void main(String args[]){
        float a = 25.7f;
        int b = (int)a;
        System.out.println(b);

        float marks = 25.99999f;
        int marks2 = (int)marks;
        System.out.println(marks2);

        float number=99.9999f;
        int number2=(int)number;
        System.out.println(number2);

        char ch = 'A';
        char ch2 = 'B';
        int number4=ch;
        int number5=ch2;
        System.out.println(number4);
        System.out.println(number5);
    }
}
/*
Type Casting - Narrowing Casting (Explicit / Manual)
Bigger type → Smaller type
Must use (datatype)
Can cause data loss

Example -
double d = 100.5;
int i = (int) d;    // i = 100

long l = 40000;
short s = (short) l;  // s = -25536 (overflow)
//  */