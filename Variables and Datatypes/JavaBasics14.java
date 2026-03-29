public class JavaBasics14 {
    public static void main(String args[]){
        short a = 5;
        byte b = 25;
        char c = 'c';
        // byte bt = a+b+c; Error
        byte bt = (byte)(a+b+c);
        int bt2 = a+b+c;
        System.out.println(bt);
        System.out.println(bt2);

        int d = 10;
        float e = 20.25f;
        long f = 25000;
        double g = 23.78999;
        double ans=d+e+f+g;
        System.out.println(ans);

        byte z = 5;
        // byte a = b*2; => Error
        byte h = (byte)(z*2);
        System.out.println(h);
    }       
}
 /*
1.Write Code → You write .java file in Java (source code).
2.Compile → Java compiler (javac) converts .java → bytecode (.class file).
3.Bytecode → This bytecode is platform-independent.
4.Run → Java Virtual Machine (JVM) reads the bytecode and converts it into machine code your computer can understand.

So the flow is:
Source Code (.java) → Compiler → Bytecode (.class) → JVM → Machine Code → Output
 */