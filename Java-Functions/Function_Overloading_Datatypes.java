public class Function_Overloading_Datatypes {
    // func to calc int sum
    public static int sum(int a,int b){
        return a+b;
    }
    // func to calc float sum
    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(10,5));
        System.out.println(sum(3.5f, 5.5f));
    }
}
