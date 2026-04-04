public class diamond_pattern {
    public static void diamondpattern(int n) {
        // half height of the diamond ( no of rows in top half )
        // upper half - print spaces , print stars
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        // lowwer half
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            // print stars
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        diamondpattern(5);
    }
}
