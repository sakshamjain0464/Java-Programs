// Write a program for this keyword with method

import java.util.*;

class thisMethod{
    int n;
    thisMethod(int n){
        this.n = n;
    }
    void print(){
        System.err.println(this.n);
    }

    public static void main(String[] args) {
        int x = 10;
        thisMethod n = new thisMethod(x);
        n.print();
    }
}