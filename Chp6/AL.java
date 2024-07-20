package Chp6;

import java.util.ArrayList;
import java.util.Scanner;

public class AL {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        int numOfHits = 0;
        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        System.out.println("Original :" + myList);
        while (numOfHits != 4) {
            System.out.print("Enter your number : ");
            Scanner sc = new Scanner(System.in);
            String a = sc.next();           // user enters the number
            for(String cell : myList) {
                if(cell.equals(a)) {        // does it check where String cell
                    myList.remove(a);
                    numOfHits++;
                    System.out.println("Updated : " + myList);    // prints updated ArrayList
                    break;
                }
            }
        }
    }
}
