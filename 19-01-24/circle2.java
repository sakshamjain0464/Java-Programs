import java.util.Scanner;

class circle2 {
    double area(double r){
        return 3.14*r*r;
    }
    public static void main(String[] args) {
        double r, a;
        Scanner S = new Scanner(System.in);

        System.out.print("Enter Radius : ");
        r = S.nextDouble();

        circle2 myCircle = new circle2();
        a = myCircle.area(r);

        System.out.println("Area of circle is : " + a);
    }
}

// Write  program to calculate Area of circle using function 19/1/24
