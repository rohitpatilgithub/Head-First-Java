package Chp2;
class Playerr {
    int number ;
    int guess(){
        number = (int)(Math.random()*9+1);
        return number;
    }
}
class GuessGam{
    Playerr p1;
    Playerr p2;
    Playerr p3;
    int guess = (int)(Math.random()*9+1);
    void startGame(){
        System.out.println("Playing the game ");
        p1 = new Playerr();
        p2 = new Playerr();
        p3 = new Playerr();
        int a = p1.guess();
        int b = p2.guess();
        int c = p3.guess();
        System.out.println("Player 1 guessed number : "+a);
        System.out.println("Player 2 guessed number : "+b);
        System.out.println("Player 3 guessed number : "+c);
        System.out.println(guess);
    }
}

public class NewLauncher {
    public static void main(String[] args) {
        GuessGam game = new GuessGam();
        game.startGame();
    }
}
//what if we want guess to be constant for all players to know that which player guessed right