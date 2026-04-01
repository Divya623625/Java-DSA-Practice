import java.util.*;
public class JavaBasics11 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float number=sc.nextInt();
        System.out.println(number);
        // int number = sc.nextFloat(); //Error
        sc.close();
    }
}
