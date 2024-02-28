package Chp2;
class Player {
    int number ;
    int guess(){
        number = (int)(Math.random()*9+1);
        return number;
    }
}
class GuessGame{
    Player p1;
    Player p2;
    Player p3;
    int guess = (int)(Math.random()*9+1);
    void startGame(){
        System.out.println("Playing the game ");
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        int a = p1.guess();
        int b = p2.guess();
        int c = p3.guess();
        System.out.println("Player 1 guessed number : "+a);
        System.out.println("Player 2 guessed number : "+b);
        System.out.println("Player 3 guessed number : "+c);
        System.out.println(guess);
        System.out.println(a==guess);
        System.out.println(b==guess);
        System.out.println(c==guess);
    }
}

public class GameLauncher {
    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        game.startGame();
    }
}