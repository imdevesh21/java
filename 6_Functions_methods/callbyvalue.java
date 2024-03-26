
public class callbyvalue {

    public static void valueCall(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

    public static void main(String[] args) {

        int a = 4;
        int b = 5;
        valueCall(a, b);
    }

}
