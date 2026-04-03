public class Product_Of_A_B {
    public static int multiply(int a,int b){
        int product = a*b;
        return product;
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        int a=10;
        int b=8;
        int prod=multiply(a,b);
        System.out.println("Product of a and b is : " + prod);
        int mul=multiply(10,20);
        System.out.println("Product of a and b is : " + mul);
    }
}
