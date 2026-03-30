import java.util.*;
public class Loops14{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        do { 
            System.out.println("Enter your number or press(-1) to exit.");
            int n=sc.nextInt();

            if (n == -1) {
                break;   // stop loop
            }

            if(n % 10==0){
                continue;
            }
            System.out.println("number was: " + n);
        }while(true);
        sc.close();
    }
}

    
