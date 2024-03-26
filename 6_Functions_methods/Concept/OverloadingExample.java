public class OverloadingExample{

  public void display(int num){
    System.out.println("Displaying integer: " + num);
  }

  public void display(String str , int num){
    System.out.println("Displaying string and integer: " + str + ", " + num);
  }

  public void display(double num1, double num2){
    System.out.println("Displaying doubles" + num1 + " and " + num2);
  }

  public void display(char ch){
    System.out.println("Displaying char: " + ch);
  }

  public static void main(String[] args){
    OverloadingExample example = new OverloadingExample();


    example.display(10);
    example.display("Hello", 20);
    example.display(3.23, 3.14);
    example.display('A');
  }
}

// In the above example:

// We have defined multiple methods named display, but each method has a different parameter list.
// The first display method takes an integer parameter, the second one takes a string and an integer, the third one takes two double parameters, and the fourth one takes a character parameter.
// All these methods have the same name but perform different tasks based on their parameter lists.
// In the main method, we call these overloaded methods with different sets of arguments.
// Function overloading provides flexibility and improves code readability by allowing methods to have the same name but perform different operations based on the type or number of parameters they receive.






