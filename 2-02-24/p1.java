// Write a program for this keyword with variable

import java.util.*;

class thisVariable{
    int n;
    thisVariable(int n){
        this.n = n;
    }

    public static void main(String[] args) {
        int x = 10;
        thisVariable n = new thisVariable(x);
        System.err.println(n.n);
    }
}