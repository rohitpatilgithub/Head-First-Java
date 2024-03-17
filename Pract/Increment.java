package Pract;
class increase{
    int number;
    increase(int number){
        this.number = number;
    }
    void out(){
        System.out.println(number);
    }
}

public class Increment {
    public static void main(String[] args) {
        increase[] one = new increase[5];
        for (int i = 0;i<one.length;i++){
            one[i] = new increase(i+1);
        }
        int x = 0;
        while(x<one.length){
            one[x].out();
            x+=1;
        }
    }
}
