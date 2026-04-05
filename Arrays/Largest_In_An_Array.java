public class Largest_In_An_Array{
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE; // -infinity
        for(int i = 0; i < numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static int getSmallest(int numbers[]){
        int smallest = Integer.MAX_VALUE; // +infinity
        for(int j = 0; j < numbers.length; j++){
            if(smallest > numbers[j]){
                smallest = numbers[j];
            }
        }
        return smallest;
    }
        public static void main(String[] args) {
        int numbers[] = {2,1,5,3,7,4,9,6,8,10,15,100,-10};
        System.out.println("Largest value is : " + getLargest(numbers));
        System.out.println("Smallest value is : " + getSmallest(numbers));
    }
}

    