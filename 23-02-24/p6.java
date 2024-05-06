// Java does not support copy constructor but there are many ways to copy the values so write a program for the same.
// •	By using constructor.
// •	By assuming the values of one object to another object.

public class p6 {
    private int value;

    // Constructor to initialize the value
    public p6(int value) {
        this.value = value;
    }

    // Copy constructor using constructor
    public p6(p6 obj) {
        this.value = obj.value;
    }

    // Method to copy values by assuming
    public void copyValues(p6 obj) {
        this.value = obj.value;
    }

    public static void main(String[] args) {
        // Creating an object
        p6 obj1 = new p6(10);

        // Copying values using constructor
        p6 obj2 = new p6(obj1);

        // Copying values by assuming
        p6 obj3 = new p6(0);
        obj3.copyValues(obj1);

        // Printing the values
        System.out.println("obj1 value: " + obj1.value);
        System.out.println("obj2 value: " + obj2.value);
        System.out.println("obj3 value: " + obj3.value);
    }
}
