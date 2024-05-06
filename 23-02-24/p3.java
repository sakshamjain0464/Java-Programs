// Write a program for creating object through another object
// 		Box b1 = new Box();
// 		Box b2 = b1;

class Box{
    int length, breadth, height;
    Box(){
        length = 10;
        breadth = 20;
        height = 30;
    }
}

class p3{
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = b1;
        System.out.println("b1: " + b1.length + " " + b1.breadth + " " + b1.height);
        System.out.println("b2: " + b2.length + " " + b2.breadth + " " + b2.height);
    }
}