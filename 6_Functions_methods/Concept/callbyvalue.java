
public class callbyvalue {

  public static void main(String[] args) {

    int num = 10;
    System.out.println("Before calling method: " + num);
    modifyValue(num);
    System.out.println("After calling method: " + num);
  }

  public static void modifyValue(int value) {
    value = 20;
    System.out.println("Inside method :" + value);
  }

}


// We declare and initialize the variable num with the value 10.
// We print the value of num, which is 10.
// We call the modifyValue() method and pass num as an argument.
// Inside the modifyValue() method, the parameter value receives a copy of the value of num, which is 10.
// We then modify the value of value to 20 inside the modifyValue() method.
// We print the value of value inside the method, which is 20.
// After returning from the modifyValue() method, we print the value of num again in the main() method.
// The key point to understand here is that even though we modified the value of the parameter value inside the modifyValue() method, it did not affect the original variable num outside the method. This is because Java passes parameters by value by default, which means a copy of the value is passed to the method, and modifications made to the parameter inside the method do not affect the original variable.

// So, in conclusion, call by value means passing a copy of the value of a variable to a method. Any modifications made to the parameter inside the method do not affect the original variable outside the method.