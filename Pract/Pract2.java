package Pract;

public class Pract2 {
    void next(int roll){
        roll = roll+1;
        System.out.println("Next roll number is : "+roll); //can't we use it from particular class besides main
    }
    public static void main(String[] args) {
        int current_roll = 25;
        System.out.println("Current roll number is : "+current_roll);
        Pract2 upcoming = new Pract2();
        upcoming.next(current_roll);
        System.out.println("Previous roll number was : "+current_roll);
    }
}
