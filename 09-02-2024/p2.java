// Write a program for if....else, if...elseif....else, Nested if....else

import java.util.Scanner;

class main{
    public static void main(String[] args) {
        int a;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter Your Age");
        a = S.nextInt();

        if(a < 18){
            System.out.println("You are child");
        }
        else if(a > 18 && a < 50){
            System.out.println("You are adult");
            if(a < 30){
                System.out.println("You are young now");
            }
            else{
                System.out.println("You are getting old");
            }
        }
        else{
            System.out.println("You are od");
        }
    }
}