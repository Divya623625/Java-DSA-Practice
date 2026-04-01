import java.util.*;
public class Loops15 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if (n==2) {
            System.out.println("2 is prime");
        } else {
            boolean isPrime=true;
            for(int i=2; i<=Math.sqrt(n); i++){ 
                if(n % i == 0){ // N is the multiple of i (i is not equal to 1 or n)
                    isPrime=false;
            }
        }
            if(isPrime==true){
                System.out.println(n + "is prime");
            } else {
                System.out.println(n + "is not prime");
        }
        sc.close();
        }
    }
}

// for(int i=2;i<=Math.sqrt(n);i++)
/*
A prime number:
Divisible by 1 and itself only
Not divisible by any other number
So we check numbers between 2 and n-1
Because:
We don’t check 1 (every number is divisible by 1 ❌ useless)
We don’t check n (every number divides itself ❌ useless)

🔎 Example: n = 7

We check:

7 % 2 → not 0
7 % 3 → not 0
7 % 4 → not 0
7 % 5 → not 0
7 % 6 → not 0

None give 0 ✅
So 7 is prime.

🚀 But why not check till n-1? Why √n?
Take example: n = 36
Factors of 36:
1 × 36
2 × 18
3 × 12
4 × 9
6 × 6

After 6, numbers repeat in reverse.
√36 = 6

So after √n, factors repeat.

That means:
If a number has a factor, one factor will always be ≤ √n

So we check only till √n.*/