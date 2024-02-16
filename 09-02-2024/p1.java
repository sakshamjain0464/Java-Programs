// Write a program to use super.

class A{
    int a;
    A(int a){
        this.a = a;
    }
    void display(){
        System.out.println("Value of a: " + a);
    }
}

class B extends A{

    

    B(int a){
        super(a);
    }

    void display(){
        super.display();
    }
}
