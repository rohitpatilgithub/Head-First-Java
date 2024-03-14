package Chp4;

class Two{
    void TakeTwo(int a,int b){  //return type here needed or not
        int z = a+b;
        System.out.println(z); //how to print a and b only if we don't want addition of it just value
    }
}
public class TestTwo {
    public static void main(String[] args) {
        Two n = new Two();
        n.TakeTwo(2,3);
    }
}
