import java.util.*;

public class Input {
    public static void main(String[] args) {
        int a,b,c;
        Scanner S = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        a = S.nextInt();
        b = S.nextInt();
        c = a+b;
        System.out.println("The sum is : " + c);
    }
}
