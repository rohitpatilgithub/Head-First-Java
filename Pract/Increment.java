package Pract;
class increase{
    int number;
    increase(int number){       // can we use     class type(parameter)
        this.number = number;   // this.ref means
    }
    void out(){
        System.out.println(number);
    }
}

public class Increment {
    public static void main(String[] args) {
        increase[] one = new increase[5];
        for (int i = 0;i<one.length;i++){
            one[i] = new increase(i+1); //is this possible one[] = new increase(argument)
        }
        int x = 0;
        while(x<one.length){
            one[x].out();
            x+=1;
        }
    }
}
