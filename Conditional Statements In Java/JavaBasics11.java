import java.util.*;
public class JavaBasics11 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x>0){
            System.out.println("X is greater than 0");
        }
        else{
            System.out.println("X is less than or equal to 0");
        }
        sc.close();
    }  
}
