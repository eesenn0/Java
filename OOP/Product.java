public class MainClass { // MainClass class

    public static void main(String[] args) { // main method

        // creates a new instance of the Product class
        Product store_product = new Product("Banana", 1.1, 13);

        // calls the printProduct method on the product instance
        store_product.printProduct();
    } // end main method
} // end MainClass class

// The Product class represents a product, with a name, price, and quantity.
class Product {

    // The price of the product
    double price;

    // The quantity of the product
    int quantity;

    // The name of the product
    String name;

    // Constructor that sets the name, price, and quantity of the product
    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.price = initialPrice;
        this.quantity = initialQuantity;
        this.name = initialName;
    }

    // Method that outputs the information of the product to the console
    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", " + this.quantity + " pcs");
    }
} // end Product class
