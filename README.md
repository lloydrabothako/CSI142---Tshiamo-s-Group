We created Product and Vendor for our Local Farmers scenario

//Product.java

public class Product{
  private String name;
  private String category;
  private double price;
  private int quantity;

  //constructor
  public Product(String name, String category, double price, int quantity){
    this.productName = name;
    this.category = category;
    this.price = price;
    this.quantity = quantity;
  }

  //getters and setters
  public String getname() {
    return name;
  }
  public void setname(String productname){
    this.name = name;
  }
  public String getcategory(){
    return category;
  }
  public void setcategory(String category){
    this.category = category;
  }
  public double getprice(){
    return price;
  }
  public void setprice(double price){
    this.price = price;
  }
  public int getquantity(){
    return quantity;
  }
  public void setquantity(int quantity){
    this.quantity = quantity;
  }

  //Vendor.java
  
  public class Vendor {
    private String name;
    private String region;
    private double rating;

    // Default constructor
    public Vendor() {
    }

    // Constructor with fields
    public Vendor(String name, String region, double rating) {
        this.name = name;
        this.region = region;
        this.rating = rating;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for region
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    // Getter and Setter for rating
    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    // Override toString() method for easy display of the vendor details
    @Override
    public String toString() {
        return "Vendor [Name: " + name + ", Region: " + region + ", Rating: " + rating + "]";
    }
}
