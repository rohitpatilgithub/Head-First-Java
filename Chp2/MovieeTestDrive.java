package Chp2;

class Moviee{
    String title;
    String genre;
    int rating;
    void play(){
        System.out.println("Playing the movie : "+title);// is this good practice or not
    }
    void next(){
        System.out.println("Will Play next : "+title); // same here
    }
}
public class MovieeTestDrive {
    public static void main(String[] args) {
        Moviee m1 = new Moviee();
        m1.title = "Titanic";
        m1.genre = "Romance & Adventure";
        m1.rating = 91;
        Moviee m2 = new Moviee();
        m2.title = "Lost in Space";
        m2.genre = "Comedy";
        m2.rating = 100;
        m2.play();
        Moviee m3 = new Moviee();
        m3.title = "Byte Club";
        m3.genre = "Tragic";
        m3.rating = 100;
        m3.next();
    }
}
