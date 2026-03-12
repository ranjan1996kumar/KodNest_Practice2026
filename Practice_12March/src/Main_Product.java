class Product {
    String productName;
    double productPrice;
    String productCategory;

    public Product(String productName, double productPrice, String productCategory) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
    }

    public void displayDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: $" + productPrice);
        System.out.println("Product Category: " + productCategory);
    }
}

public class Main_Product {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1200.50, "Electronics");
        Product product2 = new Product("Chair", 150.75, "Furniture");
        Product product3 = new Product("Book", 25.99, "Education");

        product1.displayDetails();
        product2.displayDetails();
        product3.displayDetails();
    }
}
