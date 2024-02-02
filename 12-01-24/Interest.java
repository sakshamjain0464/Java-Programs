import java.util.*;

public class Interest{
    public static void main(String[] args) {
        double p,t,r, i;
        Scanner S = new Scanner(System.in);
        System.out.print("Enter Principal Amount : ");
        p = S.nextDouble();
        System.out.print("Enter Rate : ");
        r = S.nextDouble();
        System.out.print("Enter Time : ");
        t = S.nextDouble();

        i = (p*r*t)/100;
        System.out.println("Simple Interest : " + i);
    }
}

// Write a program to calculate simple interest 12/1/24