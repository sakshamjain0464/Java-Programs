// Write a program to calculate simple interest with function
//19/01/24 

import java.util.*;
class simpleInterest2 {
    double calculate(double p, double r, double t){
        return (p*r*t)/100;
    }
    
    public static void main(String[] args) {
        double p,r,t;
        Scanner S = new Scanner(System.in);
        System.out.print("Enter Principal Amount : ");
        p = S.nextDouble();
        System.out.print("Enter rate (in %): ");
        r = S.nextDouble();
        System.out.print("Enter Time (in years) : ");
        t = S.nextDouble();
        simpleInterest2 calculator = new simpleInterest2();
        System.out.println("Simple Interest : " + calculator.calculate(p,r,t));
    }
}