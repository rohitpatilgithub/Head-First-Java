package Chp2;
// this code gives me output
// Movie : Lost in Cubicle Space
// Genre : Comedy
// Rating = 5
// Playing the movie
class Movie {
    //instance variables --> start
    String title;
    String genre;
    int rating;
    //instance variables --> end

    //methods --> start
    void playIt() {

        System.out.println("Currently Playing the movie");
    }
    void title(){
        System.out.println("Movie : Lost in Cubicle Space");
    }
    void genre(){

        System.out.println("Genre : Comedy");
    }
    void rating() {
        System.out.println("Rating = 5");
    }
    //methods --> end
}

public class ObjectsTestDrive {
    public static void main(String[] args) {
        Movie one;
        one = new Movie();
        one.title = "Gone with the Stock";
        one.genre = "Tragic";
        one.rating = -2;
        Movie two = new Movie();
        two.title();    // method to display movie name
        two.genre();    // method to display genre
        two.rating();   // method to display know the rating
        two.playIt();   // method to display movie currently playing
        Movie three;
        three = new Movie();
        three.title = "Byte Club";
        three.genre = "Tragic but ultimately uplifting";
        three.rating = 127;

        //NOTE : We have to substitute the values from movie's section to methods to be displayed
    }
}