// Pairs in an array
public class Print_Pairs{
    public static void print_pairs(int numbers[]){
        int tp = 0;
        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("(" + curr + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs : " + tp);
    }
    public static void main(String[] args) {
        int numbers[] = { 1,2,3,4,5,6 };
        print_pairs(numbers);
    }
}
/* 
✅ Formula for total pairs
If array size = n
Total pairs = n(n - 1) / 2

✅ Time Complexity
O(n²)
👉 Because 2 loops run
👉 For each element, you compare with remaining elements

✅ Space Complexity
O(1) (constant space)
👉 No extra memory used (only variables like i, j, curr, tp)
*/