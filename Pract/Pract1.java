package Pract;

import java.util.Scanner;

class College{
    String Name (){
        return "Pratibha";
    }
    int Rating(){
        return 8;
    }
    void info(){
        System.out.println("Name of college is : "+Name()+" \nRating of college is : "+Rating());
    }
}
public class Pract1 {
    public static void main(String[] args) {
        College one = new College();
        one.info();//declaration
    }
}
