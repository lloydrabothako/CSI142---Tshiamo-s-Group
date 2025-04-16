public class Product{
    String name;
    String category;
    double price;
    int quantity;

    //constructor
    public Product(String name,String category, double price,int quantity){
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }
    //Method display
    public void display(){
    System.out.println("Product Name: "+ name);
    System.out.println("Category: " + category);
    System.out.println("Price: "+ price);
    System.out.println("Quantity: " + quantity);
    }
}