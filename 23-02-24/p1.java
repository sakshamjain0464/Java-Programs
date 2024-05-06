// Write a program for DataInputStream to calculate the area of circle. 

import java.io.DataInputStream;

public class p1 {
    public static void main(String[] args) {
           try{
            DataInputStream dis = new DataInputStream(System.in);

            System.out.print("Enter the radius of the circle: ");
            int radius = dis.readInt();

            double area = Math.PI * radius * radius;

            System.out.println("The area of the circle is: " + area);
           }catch(Exception e){
               System.out.println("Error: " + e);
           }
    }
}