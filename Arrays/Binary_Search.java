public class Binary_Search{
    public static int binarysearch(int numbers[],int key){
        int start = 0;
        int end = numbers.length - 1;

        while(start <= end){
            int mid = (start + end) / 2;
            // comparisions
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){ // right
                start = mid + 1; 
            } else { // left
                end = mid - 1;
            }
        }
        return -1;
    }
        public static void main(String[] args) {
        int numbers[] = {12,34,38,54,56,56,74,76,98};
        int key = 38; 
        System.out.println("Index for key is : " + binarysearch(numbers, key));
    }
}
    
