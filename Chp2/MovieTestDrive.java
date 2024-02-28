package Chp2;

class Movie{
    String title;
    String genre;
    int rating;
    void play(){
        System.out.println("Playing the movie : "+title);
    }
    void next(){
        System.out.println("Will Play next : "+title);
}
}
public class MovieTestDrive {
    public static void main(String[] args) {
        Movie m1 = new Movie();
        m1.title = "Titanic";
        m1.genre = "Romance & Adventure";
        m1.rating = 91;
        Movie m2 = new Movie();
        m2.title = "Lost in Space";
        m2.genre = "Comedy";
        m2.rating = 100;
        m2.play();
        Movie m3 = new Movie();
        m3.title = "Byte Club";
        m3.genre = "Tragic";
        m3.rating = 100;
        m3.next();
    }
}
