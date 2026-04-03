import java.util.*;
public class Average_of_3 {
    public static int average(int a,int b,int c){
        return (a + b + c) / 3;
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number:");
    int x = sc.nextInt();
    System.out.print("Enter the second number:");
    int y = sc.nextInt();
    System.out.print("Enter the third number:");
    int z = sc.nextInt();
    System.out.print("The average value is : " + average(x,y,z) +"\n");
    sc.close();
    }
}
