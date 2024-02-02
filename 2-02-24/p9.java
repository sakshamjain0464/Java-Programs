// Write a program for implicit and explicit type casting

import java.util.*;

class casting{
    public static void main(String[] args) {
        // Implicit Casting
        System.out.println("Implicit Casting");
        int n = 100;
        float num = n;

        System.out.println("Befor Casting : " + n);
        System.out.println("After Casting" + num);

        // Explicit Casting
        System.out.println("\n\nExplicit Casting");
        double numd = 100;
        float numf = (float)numd;

        System.out.println("Befor Casting : " + numd);
        System.out.println("After Casting : " + numf);
    }
}
