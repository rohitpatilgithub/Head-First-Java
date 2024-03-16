package Chp4;


public class PassByValue {
    public static void main(String[] args) {
        int a = 2;
        System.out.println("Before method call : "+a); //here value is 2

        PassByValue exp = new PassByValue();
        exp.modify(a);

        System.out.println("After method call : "+a); //same here
    }
    void modify(int z){
        z = z+1;
        System.out.println("Inside the method : "+z); //we just copy the value here
    }
}
