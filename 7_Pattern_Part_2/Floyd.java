public class Floyd{

    public static void floyd_Triangle(int n){
        //outer 

        int counter = 1;
        for(int i = 1; i<= n;i++){
            // inner- hoe many times will counter will be printed

            for(int j = 1; j<= i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        floyd_Triangle(5);
    }
}