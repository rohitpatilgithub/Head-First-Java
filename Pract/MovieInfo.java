package Pract;

import java.util.Scanner;

class Movie{
    Scanner sc = new Scanner(System.in);
    String Movie;
    int Rating;
    String Genre;
    int num;

    void info(){
        System.out.print("Enter movie name : ");
        Movie = sc.next();
        System.out.print("Enter movie rating : ");
        Rating = sc.nextInt();
        System.out.print("Enter movie genre : ");
        Genre = sc.next();
    }
    Movie(int num){
        this.num = num;
    }
    void output(){
        System.out.println("movie number is :"+num);
        System.out.println("Movie is : "+Movie);
        System.out.println("Rating is : "+Rating);
        System.out.println("Genre is : "+Genre);
    }
}
public class MovieInfo {

    public static void main(String[] args) {
        int x = 0;
        Movie[] movi = new Movie[3];
        for(int i = 0;i<= movi.length-1;i++){
            movi[i] = new Movie(i+1);
            movi[i].info();
        }
        x = 0;
        while(x<3){
            movi[x].output();
            x+=1;
        }
    }
}
