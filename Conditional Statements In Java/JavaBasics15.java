import java.util.*;
public class JavaBasics15 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input the year: ");
        int year=sc.nextInt();
        boolean x = (year % 4) ==0;
        boolean y = (year % 100) !=0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));
        if(x && (y || z)) {
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not a leapyear");
        }
        sc.close();
    }
}
/*
Step 1
👉 A leap year has 1 extra day (Feb 29)

Step 2
👉 We don’t add that extra day every year
👉 We add it after 4 years
So first logic:
👉 Year ÷ 4 = no remainder → leap year
That’s the MAIN logic.

Step 3 (small problem)
Some years like 1900:
1900 ÷ 4 = yes
BUT calendar says ❌ not leap
So we add ONE correction.

Step 4 (correction)
👉 If year ends with 00 → ❌ not leap

Step 5 (final correction)
But 2000 ends with 00
Still calendar says ✅ leap
So last rule:
👉 If year ÷ 400 = yes → ✅ leap

FINAL LOGIC (read slowly)
If divisible by 400 → Leap
Else if divisible by 100 → Not leap
Else if divisible by 4 → Leap
Else → Not leap

ONE-LINE MEMORY 🧠

👉 400 yes → 100 no → 4 yes

That’s the complete logic.
*/

