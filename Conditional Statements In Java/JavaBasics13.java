import java.util.*;
public class JavaBasics13 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // Input the week number from user
        System.out.println("Enter week number(1-7):");
        int week = sc.nextInt();
        switch(week){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Input is Invalid! Please enter the week number between 1-7.");
        }
        sc.close();
    }
}
