package Pract;

class Product{
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String ProdName) {
        name = ProdName;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int ProdPrice){
        price = ProdPrice;
    }
}
public class Pract3 {
    public static void main(String[] args) {
        Product Juice = new Product();
        Juice.setName("Real Juice");
        String a = Juice.getName();
        System.out.println("Product Name is : "+a);
        Juice.setPrice(1);
        int b = Juice.getPrice();
        System.out.println("Product Price is : $"+b);
    }
}
