// Write a program to calculate area of rectangle using function and JDK 19/1/24

import java.util.*;

class rectangleArea {
    double area(double l, double w){
        return l*w;
    }

    public static void main(String[] args) {
        double l,w;
        Scanner S = new Scanner(System.in);
        System.out.print("Enter Length - > ");
        l = S.nextDouble();
        System.out.print("Enter Width - > ");
        w = S.nextDouble();
        rectangleArea rectangle = new rectangleArea();
        System.out.println("Area is - > " + rectangle.area(l, w));
    }
}
