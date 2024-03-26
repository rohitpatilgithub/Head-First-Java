package Chp4;
class Test{
    void go(int x,int y){
        int z = x+y;
        System.out.println("Total is : "+z);
    }
}
public class TestStuff {
    public static void main(String[] args) {
        Test ok = new Test();
        //first type to get output
        ok.go(3,5);
        //second type to get output
        Test ko = new Test();
        int q = 5;
        int a = 10;
        ko.go(q,a);
    }
}
