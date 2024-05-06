// Write a program for default constructor that display the default values.

public class p4 {
    int intValue = 0;
    double doubleValue = 0;
    boolean booleanValue = false;
    char charValue = 'A';
    
    public p4() {
        System.out.println("Default values:");
        System.out.println("int: " + intValue);
        System.out.println("double: " + doubleValue);
        System.out.println("boolean: " + booleanValue);
        System.out.println("char: " + charValue);
    }

    public static void main(String[] args) {
        p4 o1 = new p4();
    }
}
