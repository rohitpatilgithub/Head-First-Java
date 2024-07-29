package MyGame;

import java.util.ArrayList;

public class StartUpBust {
    ArrayList<StartUp> startups = new ArrayList<StartUp>();     //startup objects are stored
    int numOfGuesses;                                           // number of guess by user
    public void setupStartups() {                               // setting up startup
        StartUp one = new StartUp();
        one.name = "Poniez";
        StartUp two = new StartUp();
        two.name = "Cabista";
        StartUp three = new StartUp();
        three.name = "Hacqi";
        startups.add(one);
        startups.add(two);
        startups.add(three);
    }
}
