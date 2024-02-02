// Write a program for instance variable

import java.util.*;

class instanceVariable{
    int n;
    String a;

    instanceVariable(){
        this.n = 5;
        this.a = "Hello Saksham";
    }

    public static void main(String[] args) {
        instanceVariable o = new instanceVariable();

        System.out.println(o.n);
        System.out.println(o.a);
    }
}
