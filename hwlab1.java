//overall class for examples
public class hwlab1 {
    //example 1: Hello World
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        //example 2: variable and data types
        int x = 10;
        System.out.println(message(x));
        //example 3: if-else statement
        int num = 15;
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        //example 4: loops
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        //example 5:methods
        System.out.println(greet("Alice"));
        //example 6: arrays and list
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }
        //example 6: error handling
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        }
    }
    //overall methods 
    //method for example 2 
    public static String message(int x) {
        //print statement for example 2
        return "The number is " + x + ".";
    }
    //method for example 5 
    public static String greet(String name) {
        //print statement for example 5
        return "Hello, " + name + "!";

    }
}