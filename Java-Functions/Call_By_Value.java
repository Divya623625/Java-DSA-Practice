public class Call_By_Value {
    public static void swap(int a,int b){
        //swap
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void main(String[] args) {
        //swap-values exchange
        int a=10;
        int b=5;
        swap(a,b);
    }
}
/* 
📌 Call by Value in Java 
👉 Java is always call by value
🔹 Meaning:
A copy of the value is passed to function
Original variable will NOT change

📊 Example:
public class Test {
    public static void change(int x){
        x = 10;
    }

    public static void main(String[] args){
        int a = 5;
        change(a);
        System.out.println(a);
    }
}

👉 Output: 5 (not 10)

🔁 Why?
a value (5) is copied into x
Changes happen only in x, not in a
*/