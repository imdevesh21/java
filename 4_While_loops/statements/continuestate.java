
import java.util.*;

public class continuestate {

    public static void main(String[] args) {
        // for (int i = 0; i <= 5; i++) {
        //     if (i == 3) {
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        Scanner input = new Scanner(System.in);

        do{
          System.out.println("Enetr your number");
          int n = input.nextInt();

          if(n % 10 ==0){
            continue;
          }
          System.out.println("number was:" + n);
        } while(true);
    }
}
