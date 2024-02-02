// Write a program for static variable

import java.util.*;

class staticVariable{
    static int count = 0;
    staticVariable(){
        System.out.println("Object " + count + " Created");
        count++;
    }

    public static void main(String[] args) {
        staticVariable o1 = new staticVariable();
        staticVariable o2 = new staticVariable();
        staticVariable o3 = new staticVariable();
        System.err.println("No. of Objects : " + o1.count);
    }
}