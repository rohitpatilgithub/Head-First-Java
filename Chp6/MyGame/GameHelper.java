package MyGame;

import Chp6.Startup;

import java.util.ArrayList;
import java.util.Random;

public class GameHelper {
    ArrayList<String> grid = new ArrayList<String>();
    Random sc = new Random();

    void calculateLocation() {                                  //grid is calculated and set up is done
        String[] characters = {"a","b","c","d","e","f","g"};
        for(int i = 0 ; i < 7 ; i++) {
            for(int j = 0 ; j < 7 ; j++) {
                grid.add(characters[i] + (j));
            }
        } // end of for loop

        for(int i = 0 ; i < 49 ; i++) {
            if( ( i % 7 == 0 ) && ( i > 1) ) {
                System.out.println();
            }                                                    // visual representation of grid
            System.out.print("[" + grid.get(i) + "]" + " ");
        } // end of for loop
        System.out.println();
    }

    void startupLocations () {                                  // randomly assign location to startups
        StartUp one = new StartUp();
        StartUp two = new StartUp();
        StartUp three = new StartUp();
        ArrayList<String> ok = new ArrayList<String>();         // arrayList which holds startup locations and assigns to startups
        int random = sc.nextInt(0,20);
        int random1 = sc.nextInt(21,28);
        int random2 = sc.nextInt(42,47);
        System.out.print("\nRandom 1 : " + random+"\nRandom 2 : " + +random1+"\nRandom 3 : "+random2+"\n");   // origin random number by computer

        // 1 : Startup one

        // conditions for random int which won't overlap on each other startup

        if(random > 1 && random%2 != 0 && random <= 7 ) {
            random = random - 3;
        } else if (random%2 != 0 && random > 7 && random < 14) {
            random = random - 2;
        } else if (random%2 != 0 && random > 14) {
            random = random - 1;
        }

        for(int i = 0 ; i < 3 ; i++) {                          // modified or origin random number is picked up and 3 grid elements are assigned to startup
            ok.add(grid.get(random + i));
        } // end of for loop

        one.locations = ok;
        System.out.println("\nStartup one : " + one.locations);
        ok.clear();                                             // after every loop we destroy arrayList ok which will hold elements for next startup

        // 2 : Startup two

        // below for loop calculates for vertical grid elements which is assigned to startup

        for(int i = 0 ; i < 1 ; i++) {
            ok.add(grid.get(random1 + i));
            if(random1 < 28) {
                ok.add(grid.get(random1 + 7));
                ok.add(grid.get(random1 + 14));
            }
            else{
                for(int k = 1 ; k < 3 ; k++) {
                    ok.add(grid.get(random1 + k));
                }
            }
        }   // end of for loop

        two.locations = ok;
        System.out.println("Startup two : " + two.locations);
        ok.clear();

        // 3 : Startup three

        // conditions are similar aim of not overlap startup

        if(random2%2 != 0 && random2 > 43) {
            random2 = random2 - 3;
        }

        for(int i = 0 ; i < 3 ; i++) {
            ok.add(grid.get(random2 + i));
        }   // end of for looop

        three.locations = ok;
        System.out.println("Startup three : " + three.locations);
        ok.clear();

        // below random variables are returned once again to review the changes

        System.out.println("\nRandon 1 : " + random);
        System.out.println("Randon 2 : " + random1);
        System.out.println("Randon 3 : " + random2 );
    }

    public static void main(String[] args) {
        GameHelper ok = new GameHelper();
        ok.calculateLocation();
        ok.startupLocations();

        // for loop is to know index number of each grid element

        System.out.println("\nGrid index numbers\n");

        for(int i = 0 ; i < 49 ; i++) {
            if( ( i % 7 == 0 ) && ( i > 1) ) {
                System.out.println();
            }
            System.out.print(i + " ,");
        }
    }
}
