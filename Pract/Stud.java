package Pract;

import java.util.Scanner;

class Divi {
    Scanner sc = new Scanner(System.in);
    private int roll;
    private String name = sc.next();

    public void setRoll(int r) {
        roll = r;
    }
    public void setName(String n){
        name = n;
    }
    public int getRoll(){
        return roll;
    }
    public String getName(){
        return name;
    }

    void info(){
        System.out.println("Roll no : "+roll);
        System.out.println("Name of student is : "+getName());
    }
}
public class Stud {
    public static void main(String[] args) {
        Divi[] Div = new Divi[2];
        for(int i = 0;i<Div.length;i++){
            Div[i] = new Divi();
        }
        for(int i = 0;i<Div.length;i++){
            Div[i].setRoll(i+1);
        }
        for(int i = 0;i<Div.length;i++){
            Div[i].info();
        }
    }
}
