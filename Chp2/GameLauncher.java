package Chp2;

class Player{
    int number;  // created instance variable
    void guess(){ // no logic behind it just random stuff as per my IQ
        int x = (int)(Math.random()*9)+1; // random number for x variable
        System.out.println(x); // print x
        if(number==x){ // loop explained below in gamelauncher class
            System.out.println("Player guessed right number");
        }
        else{
            System.out.println("Player did not guessed right number");
        }
    }
}
class GameLauncher{
    public static void main(String[] args) {
        class GuessGame{
            //as per instructions added class guessgame in gamelauncher
            Player p1; //instance var for player
            Player p2;
            Player p3;
            void startGame(){  //startgame method to start the game
                System.out.println("Game is Started");
                p1 = new Player(); // as per my logic new player p1
                p2 = new Player(); // p2
                p3 = new Player(); // p3
                p1.guess(); // did p1 guesses number == x
                p2.guess(); // same
                p3.guess(); // same // if correct it will print it is correct
                //if condition is not true in guess method it will return not correct
            }
        }
        GuessGame game = new GuessGame();// this is copied one idk how it works
        game.startGame();
    }
}