package Chp2;

import java.util.Scanner;

class Area {
    Scanner sc = new Scanner(System.in);
    int length;
    int breadth;
    int setDim(){
        System.out.print("Enter length : ");
        length = sc.nextInt();
        System.out.print("Enter breadth : ");
        breadth = sc.nextInt();
        return length + breadth;
    }
    int getArea(){
        int area = length*breadth;
        System.out.println("Area of rectangle is : "+area);
        return area;
    }
}
class AreaOfRectangle {
    public static void main(String[] args) {
        Area rec = new Area();
        rec.setDim();
        rec.getArea();
    }
}
