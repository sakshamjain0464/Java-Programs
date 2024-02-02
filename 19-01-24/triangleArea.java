
import java.util.*;
class triangleArea {
    double area(double b, double h){
        return (b*h)/2;
    }

    public static void main(String[] args) {
        double b, h;
        Scanner S = new Scanner(System.in);
        System.out.print("Enter Base - > ");
        b = S.nextDouble();
        System.out.print("Enter Height - > ");
        h = S.nextDouble();
        triangleArea triangle = new triangleArea();
        System.out.println("Area is - > " + triangle.area(b, h));
    }
}
