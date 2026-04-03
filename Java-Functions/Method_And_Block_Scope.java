/* 1. Method Scope
👉 Variable declared inside a method
👉 Used anywhere inside that method only

Example -
void test(){
    int a = 10;  // method scope
    System.out.println(a);
}
❌ Cannot use a outside this method

🔹 2. Block Scope
👉 Variable declared inside { } block (if, loop, etc.)
👉 Used only inside that block

Example:
void test(){
    if(true){
        int b = 20; // block scope
        System.out.println(b);
    }
    // System.out.println(b); ❌ error
}
 */

