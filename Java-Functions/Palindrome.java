import java.util.*;
public class Palindrome {
    public static boolean isPalindrome(int number){
        int Palindrome = number; // Copied number into variable
        int reverse = 0;
        while(Palindrome != 0){
            int remainder = Palindrome % 10;
            reverse = reverse * 10 + remainder;
            Palindrome = Palindrome / 10;
            // If original and reverse of a number is equal means number is palindrome in Java
            if(number == reverse){
                    return true;
            } 
        }
        return false;
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        System.out.print("Please enter a number : ");
        Scanner sc = new Scanner(System.in);
        int Palindrome = sc.nextInt();
        if(isPalindrome(Palindrome)){
            System.out.println(Palindrome + " is a Palindrome");
        } else {
            System.out.println(Palindrome + " is not a Palindrome");
        }
        sc.close();
    }
}
