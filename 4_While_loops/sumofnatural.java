
import java.util.*;

public class sumofnatural {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;

        }
        System.out.println(sum);

    }
}
