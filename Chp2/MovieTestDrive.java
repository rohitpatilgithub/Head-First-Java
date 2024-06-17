package Chp2;

class Movie {
    String title;
    String genre;
    int rating;
    void playMovie() {
        System.out.println("Playing the movie : " + title);
    }
    void nextMovie() {
        System.out.println("Next movie : " + title);
}
}
public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Titanic";
        one.genre = "Romance & Adventure";
        one.rating = 91;
        Movie two = new Movie();
        two.title = "Lost in Space";
        two.genre = "Comedy";
        two.rating = 100;
        two.playMovie();
        Movie three = new Movie();
        three.title = "Byte Club";
        three.genre = "Tragic";
        three.rating = 100;
        three.nextMovie();
    }
}
