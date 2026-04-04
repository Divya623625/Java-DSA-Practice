public class butterfly_pattern {
    public static void Butterfly_pattern(int n){
        // first half
        for(int i=1;i<=n;i++){
                // stars - i
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            // spaces - 2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            // stars - i 
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
            // 2nd half
            for(int i=n;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print("*"+" ");
            }
            // stars - i
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            // spaces - 2*(n-i)
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            // stars - i
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Butterfly_pattern(5);
    }
}


