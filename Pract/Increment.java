package Pract;
class increase{
    int num;

}

public class Increment {
    public static void main(String[] args) {
        increase[] one = new increase[5];
        int a = 0;
        int b = 0;
        for(int i = 0;i< one.length;i++){
            one[i] = new increase();
            a = one[i].num;
            b = a;
        }
        for(int i = 0;i< one.length;i++){
            b = b+1;
            System.out.println("Num : "+b);
        }
    }
}
