/*Question 2: In a program, input the side of a square. You have to output the area of the
square.
(Hint : area of a square is (side x side))
*/
import java.util.*;
public class JavaBasics16 {
    public static void main(String args[]){
    @SuppressWarnings("ConvertToTryWithResources")
        Scanner sc=new Scanner(System.in);
        int side=sc.nextInt();
        int area = side*side;
        System.out.println("Area of square is: "+area);
        sc.close();
    }
    
}
