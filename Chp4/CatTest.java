package Chp4;
class Cat{
    private int height;
    int getHeight(){
        return height;
    }
    void setHeight(int h){
        if(h>3){
            height = h;
            System.out.print("Your cat height is : "+height);//is it ok to use height
        }
        else{
            System.out.println("Enter proper height of your cat because height is : "+h);
        }
    }
}
public class CatTest {
    public static void main(String[] args) {
        Cat Milo = new Cat();
        Milo.setHeight(1);
        System.out.println("Cat height is : "+Milo.getHeight());//how is getHeight is being accessed does it use pass by value
        Cat Piqo = new Cat();
        Piqo.setHeight(5);
        System.out.println("Cat height is : "+Piqo.getHeight());
    }
}
