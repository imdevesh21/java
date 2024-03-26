public class Binary_Search {
    
    public static int binarySearch(int numbers[], int key){
        int start = 0, end = numbers.length-1;
        while(start<=end){
            int mid = (start+end)/2;

            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){
                start = (mid+1);
            } else {
                end = (mid -1);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
         
        int numbers[]= {2, 4, 8, 16, 32, 64};
        int key = 16;
        System.out.println("Index for key is found at = "+binarySearch(numbers,key));
    }
}