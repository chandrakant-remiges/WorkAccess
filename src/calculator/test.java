public class Calculator {
    
    // Method to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }
    
    // Method to subtract two numbers
    public static int subtract(int a, int b) {
        return a - b;
    }
    
    // Method to multiply two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    // Method to divide two numbers (returns double)
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        // Testing the Calculator class
        int num1 = 10;
        int num2 = 5;
        
        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));
    }
}
