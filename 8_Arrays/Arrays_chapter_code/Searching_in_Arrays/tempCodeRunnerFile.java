public static class pairs_in_array{

    public static void printPair(int numbers[]){
        for(int i = 0; i < numbers.length; i++){
            int curr = numbers[i];
            for(int j = i+1; j < numbers.length; j++){
                System.out.println("(" + curr + "," + numbers[j] + ")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int number[] = {2,4,5,8,10};
        printPair(number);
    }
}