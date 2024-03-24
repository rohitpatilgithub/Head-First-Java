package Chp4;

class Secret{
    int num;
    int giveSecret(){
        return 42;
    }
    void giveSecre(){
        num = 42;
        System.out.println(num);
    }
}
public class SecretTest {
    public static void main(String[] args) {
        Secret Person1 = new Secret();
        //Person1.giveSecret();          //why doesn't it return anything here
        Person1.giveSecre();             //it returns here even it is void
        int a = Person1.giveSecret();   //here
        System.out.println(a);          //but it returns here

    }
}
