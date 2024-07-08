package Chp5;

import java.util.Scanner;

class People {
    Scanner sc = new Scanner(System.in);
    String name = sc.next();
}
public class Hashcode {
    public static void main(String[] args) {
        System.out.print("Person 1 : ");
        People ok = new People();
        System.out.print("Person 2 : ");
        People ko = new People();
        String a = ok.name;
        String b = ko.name;
        System.out.println(System.identityHashCode(ok));
        System.out.println(System.identityHashCode(ko));
        System.out.println("Person 1 hash code : " + (a).hashCode());   // hash code of person 1
        System.out.println("Person 2 hash code : " + (b).hashCode());   // hash code of person 2
        System.out.println("Person 1 identity hash code : " + System.identityHashCode(a));  // identity hash code person 1
        System.out.println("Person 2 identity hash code : " + System.identityHashCode(b));  // identity hash code person 2
    }
}
