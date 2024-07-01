package Chp5;

import java.util.Random;

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
        for (int i = 0; i <= 6 ; i++) {
            System.out.println(locationCells[i]);
        }
    }
}
public class StartupTest {
    public static void main(String[] args) {
        Startup my = new Startup();
        my.setupLocations();
    }
}