import java.util.*;
public class Even_Odd {
    public static boolean isEven(int number){
        return number % 2 == 0;
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        if(isEven(num)){
                System.out.print(num + " is Even");
        } else {
                System.out.print(num + " is Odd");
        }
        sc.close();
    }
}
