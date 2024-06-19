package Chp4;

class Person {
    String name;
    int id;
    String nameIs(){
        return name;
    }
    int idIs(){
        return id;
    }
}
public class ObjectReference {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Rohit";
        p1.id = 25;
        Person p2 = p1;
        System.out.println(p2.nameIs());
        System.out.println(p2.idIs());
    }
}
