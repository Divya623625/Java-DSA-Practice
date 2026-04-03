public class Function_Overloading_Parameters {
    // func to calc sum of 2 nums
    public static int sum(int a,int b){
        return a + b;
    }
    // func to cal sum of 3 nums
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(sum(5,10));
        System.out.println(sum(20,3));
    }
}
/*
📌 Function Overloading 
👉 Same function name + different parameters

🔹 How it changes?
Number of parameters
Type of parameters 
*/
