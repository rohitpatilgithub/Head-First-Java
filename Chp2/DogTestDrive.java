package Chp2;

class Dog{
    int size;
    String breed;
    String Name;
    void bark(){
        System.out.println("Whoof!!!!");
    }
}

class DogTestDrive{
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.Name = "Tommy";
        System.out.println(d1.Name);
        d1.size = 40;
        System.out.println(d1.size);
        d1.breed = "G.Shepherd";
        System.out.println(d1.breed);
        d1.bark();
    }
}
