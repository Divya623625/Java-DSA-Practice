import java.util.*;
public class JavaBasics9 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Float rad=sc.nextFloat();
        System.out.println("Radius is" + rad);
        Float area=3.14f * rad * rad;
        System.out.println("Area of a circle" + area);
        sc.close();
    }    
}
// If you dont give 3.14f interpreter will assume that it is double 