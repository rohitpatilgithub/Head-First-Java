package Chp3;

public class TestArrays {
    public static void main(String[] args) {
        int [] index = new int[4];
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;
        String [] island = new String[4];
        island[0] = "Bermuda";
        island[1] = "Fuji";
        island[2] = "Azores";
        island[3] = "Cozumel";
        int y = 0;
        int ref;
        //ref = index[y]; --->HERE<---
        while(y<4){
            ref = index[y];// why it doesn't update when it put outside while loop
            System.out.print("island = ");
            System.out.println(island[ref]);
            y = y+1;
        }
    }
}
