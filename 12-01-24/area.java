import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        double b, h, w, l, at, ar;
        Scanner S = new Scanner(System.in);

        System.out.print("Enter base : ");
        b = S.nextDouble();
        System.out.print("Enter height : ");
        h = S.nextDouble();

        at =  (b*h)/2;

        System.out.println("Area of triangle is : " + at);

        System.out.print("Enter length : ");
        l = S.nextDouble();
        System.out.print("Enter width : ");
        w = S.nextDouble();

        ar =  l*w;

        System.out.println("Area of triangle is : " + ar);
    }
}
