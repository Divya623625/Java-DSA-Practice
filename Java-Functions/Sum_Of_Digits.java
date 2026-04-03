import java.util.*;
public class Sum_Of_Digits {
    public static int sum(int n){
        int sumOfdigits = 0;
        while(n > 0){
            int lastDigit = n % 10;
            sumOfdigits += lastDigit;
            n /= 10;
        }
        return sumOfdigits;
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an Integer : ");
        int digits = sc.nextInt();
        System.out.println("The Sum is : " + sum(digits));
        sc.close();
    }   
}
    