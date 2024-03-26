package Pract;
class Divison{
    private int roll;
    private String name;

    public void setRoll(int r) {
        roll = r;
    }
    public void setName(String n){
        name = n;
    }
    public int getRoll(){
        return roll;
    }
    public String getName(){
        return name;
    }
    void info(){
        System.out.println("Roll no : "+roll);
        System.out.println("Name of student is : "+name);
    }
}
public class Students {
    public static void main(String[] args) {
        Divison[] Div = new Divison[2];
        for(int i = 0;i<Div.length;i++){
            Div[i] = new Divison();
        }
        Div[0].setName("Rohit");
        Div[1].setName("Rahul");
        for(int i = 0;i<Div.length;i++){
            Div[i].setRoll(i+1);
        }
        for(int i = 0;i<Div.length;i++){
            Div[i].info();
        }
    }
}
