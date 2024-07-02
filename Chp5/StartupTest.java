package Chp5;

import java.util.Random;
import java.util.Scanner;

class Startup{
    int [] locationCells = new int[7];       // location of Startup cells
    int numOfHits;                          // how many hits ?
    void setupLocations(){
        Random ok = new Random();
        int a = ok.nextInt(5);       // it generates random number
        for(int i = 1 ; i <= 3; i++ ) {    // allocates location in consecutive way
            locationCells[a] = a+1;
            a++;
        }
        System.out.println("Array elements are : ");
        for (int i = 0; i < 7 ; i++) {
            System.out.print(" ["+locationCells[i]+"] ");
        }
    }
    void startGame(){
        Scanner sc = new Scanner(System.in);
        while(numOfHits != 3) {                 // till we get 3 hits
            System.out.print("\nGuess : ");
            int a = sc.nextInt();               //  takes input
            if( a <= 7 ) {                       // your number must be less than 7
                for(int i = 0 ; i < 7 ; i++) {  //  'a' is checked in every array element possible
                    if(locationCells[i] == a){  //  if it finds any element equals to 'a' then it returns Hit
                        System.out.println("Hit");
                        numOfHits++;
                    }
                }
            }
        }
        System.out.println("Kill");
    }
}
public class StartupTest {
    public static void main(String[] args) {
        Startup my = new Startup();
        my.setupLocations();
        my.startGame();
    }
}