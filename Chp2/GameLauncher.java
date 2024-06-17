package Chp2;
class Player {
    int number ;
    int guessNumber() {
        number = ( int )( Math.random() * 9 + 1 );
        return number;
    }
}
class GuessGame{
    Player p1;
    Player p2;
    Player p3;
    int guess = (int)(Math.random() * 9 + 1 );
    void startGame(){
        System.out.print("Playing the game & you have to guessNumber number : ");
        System.out.println( guess );
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        int a = p1.guessNumber();
        int b = p2.guessNumber();
        int c = p3.guessNumber();
        System.out.print( a == guess );
        System.out.println(", Player 1 guessed number : " + a );
        System.out.print( b == guess );
        System.out.println(", Player 2 guessed number : " + b );
        System.out.print( c == guess );
        System.out.println(", Player 3 guessed number : " + c );
    }
}

public class GameLauncher {
    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        game.startGame();
    }
}