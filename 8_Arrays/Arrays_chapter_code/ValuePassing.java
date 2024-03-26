public class ValuePassing {
    public static void update(int marks[], int nonChangable){

        //call by reference
        nonChangable = 10;
        for(int i=0;i<marks.length;i++){
            marks[i] = marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {34,56,66};
        int nonChangable = 5;

        update(marks,nonChangable);
        System.out.println(nonChangable);   

        //To print our marks
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();    
    }   
}
