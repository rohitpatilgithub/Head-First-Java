package Chp4;
class ElectricGuitar{
    String brand;
    String getBrand(){
        return brand;
    }
    void setBrand(String newBrand){
        brand = newBrand;
    }
}
public class GuitarTest {
    public static void main(String[] args) {
        ElectricGuitar ok = new ElectricGuitar();
        ok.setBrand("Kawasaki");
        String a = ok.getBrand();
        System.out.println("Guitar brand is : "+a);
    }
}
