// Arrays in Java

public class p8 {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = { 1, 2, 3, 4, 5 };

        // Accessing elements of the array
        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);
        System.out.println("Third element: " + numbers[2]);

        // Modifying elements of the array
        numbers[3] = 10;
        System.out.println("Modified fourth element: " + numbers[3]);

        // Length of the array
        System.out.println("Length of the array: " + numbers.length);
    }
}
