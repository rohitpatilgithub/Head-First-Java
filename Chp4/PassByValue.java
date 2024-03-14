package Chp4;

class Value{
    void go(int z){
        z = 0;
    }
}
public class PassByValue {
    public static void main(String[] args) {
        Value v = new Value();
        int x = 2; // what was purpose of this assignment to variable x
        v.go(x);   // how does it compile here & can we get the output in print format
    }
}
