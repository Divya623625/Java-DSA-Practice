public class Prime_Or_Not{
    // only for n>=2
    public static boolean isPrime(int n){
        boolean isPrime = true;
        //corner cases
        //2
        if(n==2){
            return isPrime;
        }
        for(int i=2; i<=n-1; i++){
            if( n % i == 0){ // completely dividing
                isPrime=false;
                break;
            } 
        }
        return isPrime;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(10));
    }
}