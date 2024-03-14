package Chp4;

class Secret{
    int giveSecret(){
        return 42;
    }
}
public class SecretTest {
    public static void main(String[] args) {
        Secret Person1 = new Secret();
        int a = Person1.giveSecret();   //why doesn't it return anything here
        System.out.println(a);          //but it returns here
    }
}
