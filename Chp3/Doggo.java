package Chp3;

import java.util.Scanner;

class DOg{
    Scanner sc = new Scanner(System.in);
    String name;
    String breed;
    void info(){
        System.out.print("Enter your doggo's name : ");
        name = sc.next();
        System.out.print("Enter your doggo's breed : ");
        breed = sc.next();
        System.out.println("Your dog's name is "+name+" and his breed is "+breed);
    }
    void bark0(){
        System.out.println("Barks like west");
    }
    void bark1(){
        System.out.println("Barks like east");
    }
}
public class Doggo {
    public static void main(String[] args) {
          DOg[] pets ;
          pets = new DOg[2];
          pets[0] = new DOg();
          pets[1] = new DOg();
          pets[0].info();
          pets[1].info();
        int x = 0;
        while (x < pets.length) {
            pets[x].bark0();
            pets[x].bark1();
            x = x + 1;
        }
//        DOg[] pet = new DOg[2];
//        pet[0] = new DOg();
//        pet[1] = new DOg();
    }
}
