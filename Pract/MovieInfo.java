package Pract;

import java.util.Scanner;

class Movie{
    Scanner sc = new Scanner(System.in);
    String Movie;
    int Rating;
    String Genre;

    void info(){
        System.out.print("Enter movie name : ");
        Movie = sc.next();
        System.out.print("Enter movie rating : ");
        Rating = sc.nextInt();
        System.out.print("Enter movie genre : ");
        Genre = sc.next();
    }
    void output(){
        System.out.println("Movie is : "+Movie);
        System.out.println("Rating is : "+Rating);
        System.out.println("Genre is : "+Genre);
    }
}
public class MovieInfo {
    public static void main(String[] args) {
        int x = 0;
        Movie[] movi = new Movie[3];
        while(x<3){
            movi[x] = new Movie();
            movi[x].info();
            movi[x].output();
            x+=1;
        }// can't we gather the info in first place and then display all at once
    }
}
