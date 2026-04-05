public class LinearSearch{
    public static int linear_search(int numbers[],int key){
        for(int i=0 ; i<=numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    
    public static int linearsearch(String menu[],String key1){
        for(int j=0; j<=menu.length; j++){
            if(menu[j].equals(key1)){
                return j;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = { 2,4,6,7,10,65,34,12,19,87,36 };
        int key = 87;
        int index = linear_search(numbers,key);
        if( index == -1){
            System.out.println("Key Not Found");
        } else {
            System.out.println("Key Found at : " + index);
        }

        String menu[] = {"dosa","chole bhature","samosa","idli","puri","vada","puliogare"};
        String key1 = "vada";
        int index1 = linearsearch(menu,key1);
        if(index1 == -1){
            System.out.println("Key Not Found");
        } else {
            System.out.println("Key Found at : " + index1);
        }
    }
}