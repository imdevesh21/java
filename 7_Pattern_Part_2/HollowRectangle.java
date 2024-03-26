
public class HollowRectangle {

    public static void hollow_rectangle(int totRow, int totCols) {
        //outer loop
        for (int i = 1; i <= totRow; i++) {
            //inner-colums
            for (int j = 1; j <= totCols; j++) {
                //cell-(i,j)
                if (i == 1 || i == totRow || j == 1 || j == totCols) {
                    //bounary cells
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollow_rectangle(4, 5);
    }
}
