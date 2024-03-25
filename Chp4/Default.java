package Chp4;
class Def{
    private int integer;
    private String what;

    public int getDef(){
        return integer;
    }

    public void setInteger(int inr) {
        integer = inr;
    }

    public String getWhat(){
        return what;
    }
    public void setWhat(String wht){
        what = wht;
    }
}
public class Default {
    public static void main(String[] args) {
        Def ok = new Def();
        int a = ok.getDef();
        System.out.println("Integer default value : "+a);
        String b = ok.getWhat();
        System.out.println("String default value : "+b);
    }
}
