public class Scopes {

    // Class-level variable
    static int classVariable = 10;

    // Class-level method
    public static void classMethod() {
        // Accessing class-level variable
        System.out.println("Inside classMethod(): " + classVariable);
    }

    public static void main(String[] args) {
        // Accessing class-level variable directly
        System.out.println("Inside main(): " + classVariable);

        // Calling class-level method
        classMethod();

        // Method-level variable
        int methodVariable = 20;
        System.out.println("Inside main(): " + methodVariable);

        // Block-level variable
        {
            int blockVariable = 30;
            System.out.println("Inside main() block: " + blockVariable);
        }

        // Local variable
        int localVar = 40;
        System.out.println("Inside main(): " + localVar);
    }
}
