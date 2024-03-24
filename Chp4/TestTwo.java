package Chp4;

class Two{
    int TakeTwo(int a,int b){
        //how to print a and b only if we don't want addition of it just value
        int z = a+b;
        return z;
    }
    /*String TakeTwo(String a,String b){
        String z = a+b;
        return z;
    }*/
}
public class TestTwo {
    public static void main(String[] args) {
        Two n = new Two();
        int s = n.TakeTwo(12,3);
        System.out.println(s);
    }
}
