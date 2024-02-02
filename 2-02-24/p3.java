// Write a program for this keyword with constructor

import java.util.*;

class thisConstructor{
    int n;

    thisConstructor(int n){
        this.n = n;
        System.out.println(this.n);
    }

    public static void main(String[] args) {
        int x = 10;
        thisConstructor n = new thisConstructor(x);
    }
}
