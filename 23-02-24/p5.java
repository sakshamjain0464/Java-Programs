// Write a program for parameterized constructor using scanner class.

import java.util.Scanner;
public class p5 {
    private String name;
    private int age;

    public p5(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        p5 obj = new p5(name, age);

        System.out.println("Name: " + obj.name);
        System.out.println("Age: " + obj.age);

        scanner.close();
    }
}
