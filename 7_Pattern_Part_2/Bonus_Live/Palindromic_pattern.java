
public class Palindromic_pattern {

    public static void Palin_pattern(int n){
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //Decending
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            //Acending
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Palin_pattern(5);
    }
}
