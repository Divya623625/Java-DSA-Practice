// What will be the output of the following questions
// 3rd Question

public class JavaBasics8 {
    public static void main(String[] args){

        int x, y, z;
        x = y = z = 2;
        x += y;
        y -= z;
        z /= (x + y);
        System.out.println(x + " " + y + " " + z); // 4 0 0
    }
}

