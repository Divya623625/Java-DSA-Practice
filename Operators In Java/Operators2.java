public class Operators2 {
    public static void main(String args[]){
        // Pre increment
        int a=10;
        int b=++a; //Value change and value use
        System.out.println(a); // 11
        System.out.println(b); // 11

        // Post increment
        int c=10;
        int d=c++; //Value use and value change
        System.out.println(c); // 11
        System.out.println(d);  // 10

        // Pre decrement
        int e=10;
        int f=--e; //Value change and value use
        System.out.println(e); // 9
        System.out.println(f); // 9

        // Post decrement
        int g=10;
        int h=g--; //Value use and value change
        System.out.println(g); // 9
        System.out.println(h); // 10
    } 
}
