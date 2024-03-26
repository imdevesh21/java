
public class CallByReferenceExample {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        System.out.println("Before calling method: " + str);
        modifyReference(str);
        System.out.println("After calling method: " + str);
    }

    public static void modifyReference(StringBuilder reference) {
        reference.append(" World!"); // Modifying the reference parameter
        System.out.println("Inside method: " + reference);
    }
}

// In summary, call by value involves passing a copy of the variable's value to the method, keeping the original variable unchanged, while call by reference involves passing a reference to the variable's memory location, allowing modifications inside the method to affect the original variable. Each method has its use cases and implications, depending on the programming scenario.