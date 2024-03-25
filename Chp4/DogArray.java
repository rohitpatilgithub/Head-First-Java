package Chp4;
class MyDog{
    private int size;

    public int getSize() {
        return size;
    }
    public void setSize(int DogSize){
        size = DogSize;
    }
}
public class DogArray {
    public static void main(String[] args) {
        MyDog[] Dogs = new MyDog[3];
        // ----- instead of below hardwork -----
          /*
        Dogs[0] = new MyDog();
        Dogs[1] = new MyDog();
        Dogs[2] = new MyDog();
          */
        // ----- can we do this ------
        for(int i = 0;i<Dogs.length;i++) {
            Dogs[i] = new MyDog();
        }
        Dogs[0].setSize(20);
        Dogs[1].setSize(3);
        Dogs[2].setSize(4);
        for (int i = 0;i<Dogs.length;i++){
            System.out.println("Your Dog "+(i+1)+" size is : "+Dogs[i].getSize());
        }
    }
}
