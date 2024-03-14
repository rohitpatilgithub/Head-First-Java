package Chp4;

class Dog{
    int size;
    void bark(int noofbarks){
        while(noofbarks>0){
        System.out.print("Whoff!!! ");
            System.out.println(noofbarks);
        noofbarks = noofbarks - 1;
        }
    }
}
public class DogTest {
    public static void main(String[] args) {
        Dog D = new Dog();
        D.bark(5);
    }
}
