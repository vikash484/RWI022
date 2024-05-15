@FunctionalInterface
interface Adder {
    int add(int a, int b);
}

public class Basiclamda {
    public static void main(String[] args) {
        // Using lambda expression to define the add method
        Adder adder = (a, b) -> a + b;

        // Adding two numbers
        int result = adder.add(5, 3);

        // Printing the result
        System.out.println("The sum is: " + result);
    }
}

