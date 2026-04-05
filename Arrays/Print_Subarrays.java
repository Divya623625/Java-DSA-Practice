public class Print_Subarrays{
    public static void printSubarrays(int numbers[]){
        int ts = 0;
        
        for(int i=0; i<numbers.length; i++){
                int start = i;

            for(int j=i; j<numbers.length; j++){
                int end = j;
                int sum = 0;

                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;

                for(int k=start; k<=end; k++){ // print
                    System.out.print(numbers[k] + " "); // subarray
                    sum += numbers[k]; 

                     if(numbers[k] < min){
                        min = numbers[k];
                    }
                    if(numbers[k] > max){
                        max = numbers[k];
                }
            }
                ts++;
                System.out.print(" Sum " + " = " + sum );
                System.out.print(" Min = " + min + " Max = " + max );
                System.out.println();
            }
            System.out.println();
        } 
        System.out.println("Total Subarrays = " + ts);
    }

    public static void main(String[] args){
       int numbers[] = {2,4,6,8,3,5,8,10};
       printSubarrays(numbers);
    }
}