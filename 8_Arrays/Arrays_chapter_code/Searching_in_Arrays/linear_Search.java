
public class linear_Search {

    // public static int linearSearch(int number[], int key){

    //     for(int i=0;i<number.length;i++){
    //         if(number[i] == key){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    // we have a string of array like apple mango graps
   
    // public static void main(String[] args) {
    //     int number[] = {2,4,5,6,8,10,12,14,16};
    //     int key = 10;
    //     int index = linearSearch(number, key);
    //     if(index == -1){
    //         System.out.println("No linear search found");
    //     } else {
    //         System.out.println("key is at index = "+ index);   
    //     }
    // }


    //iterative approach in linear search
    public static void main(String[] args) {
        int arr[] = {4,2,1,5,3};

        int target = 5;
        int resultIndex = -1; //Initialize  the result to -1

        // Iterate through each element of the array
        for(int i=0;i<arr.length;i++){
        //If the current element matches the target, store its index and break the loop
            if(arr[i]==target){
                resultIndex = i;
                break;
            }
        }
        // Check if the target was found
        if(resultIndex != -1){
            System.out.println("Element " + target + " Found at index = " + resultIndex);
        } else {
            System.out.println("Element" + target +"Not found in array");
        }
    }
}
