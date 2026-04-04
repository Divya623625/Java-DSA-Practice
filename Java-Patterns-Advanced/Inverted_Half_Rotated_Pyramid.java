public class Inverted_Half_Rotated_Pyramid {
    public static void inverted_half_rotated_pyramid(int n){
        // outer
        for(int i=1; i<=n; i++){
            //print spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("   ");
            }
            //print stars
            for(int j=1; j<=i; j++){
                System.out.print("*"+"  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inverted_half_rotated_pyramid(5);
    }
}
    

