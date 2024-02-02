import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        double r, a;
        Scanner S = new Scanner(System.in);

        System.out.print("Enter Radius : ");
        r = S.nextDouble();

        a = 3.14 * r * r;

        System.out.println("Area of circle is : " + a);
    }
}

// Write  program to calculate Area of circle 12/1/24

