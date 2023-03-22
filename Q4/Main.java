package Q4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner shape = new Scanner(System.in);
        System.out.println("Enter 3 sides:");
        double x = shape.nextDouble();
        double y = shape.nextDouble();
        double z = shape.nextDouble();
        System.out.print("Enter color: ");
        String c = shape.next();
        System.out.print("Enter is filled: ");
        boolean isfill = shape.nextBoolean();
        Triangle mine = new Triangle(x,y,z,c,isfill);
        System.out.println(mine.toString());
    }
}
