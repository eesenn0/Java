import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        // create a new warehouse object and add some products to it
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("coffee", 5, 10);
        warehouse.addProduct("milk", 3, 20);
        warehouse.addProduct("cream", 2, 55);
        warehouse.addProduct("bread", 7, 8);

        // create a new scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // create a new store object and pass in the warehouse and scanner objects
        Store store = new Store(warehouse, scanner);

        // call the shop method on the store object, passing in the customer name
        store.shop("Emre");
    }

}

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    Map<String, Integer> prices; // a map of products and their prices
    Map<String, Integer> stocks; // a map of products and their current stock levels

    public Warehouse() {
        // initialize the prices and stocks maps
        this.prices = new HashMap<>();
        this.stocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        // add a product to the prices and stocks maps
        this.prices.put(product, price);
        this.stocks.put(product, stock);
    }

    public int price(String product) {
        // get the price of a product
        if (!this.prices.containsKey(product)) {
            return -99; // return a negative number to indicate the product doesn't exist
        }
        return this.prices.get(product);
    }

    public int stock(String product) {
        // get the stock level of a product
        if (!this.stocks.containsKey(product)) {
            return 0; // return 0 to indicate the product doesn't exist
        }
        return this.stocks.get(product);
    }

    public boolean take(String product) {               
        // decrease the stock level of a product by 1
        if (this.stocks.containsKey(product) && this.stocks.get(product) > 0) {
            int stockNumber = this.stocks.get(product);
            stockNumber -= 1;
            this.stocks.put(product, stockNumber);
            return true; // return true to indicate the product was successfully taken
        }
        return false; // return false to indicate the product couldn't be taken (out of stock or doesn't exist)
    }
    
    public Set<String> products() {
        // get a set of all the products in the warehouse
        return this.prices.keySet();
    }
}

public class Item {
    
    protected String product; // the name of the product
    protected int qty; // the quantity of the product
    private int unitPrice; // the unit price of the product
    
    public Item(String product, int qty, int unitPrice) {
        // create a new item object with a product name, quantity, and unit price
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    
    public int price() {
        // calculate the total price of the item (quantity * unit price)
        return this.unitPrice * this.qty;
    }
    
    public void increaseQuantity() {
        // increase the quantity of the item by 1
        this.qty += 1;
    }
    
    public String toString() {
        // convert the item to a string representation (product name: quantity)
        return this.product + ": " + this.qty;
    }
}
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> list;

    public ShoppingCart() {
        this.list = new ArrayList<>();
    }

    public void add(String product, int price) {
        boolean itemFound = false;

        // Search for an item in the cart with the same name as the one being added.
        // If found, increase the quantity of that item. Otherwise, add a new item.
        for (Item item : list) {
            if (item.product.equals(product)) {
                item.increaseQuantity();
                itemFound = true;
                break;
            }
        }

        if (!itemFound) {
            Item newItem = new Item(product, 1, price);
            this.list.add(newItem);
        }
    }

    public int price() {
        int sum = 0;

        // Calculate the total price of all items in the cart.
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).price();
        }

        return sum;
    }

    public void print() {
        // Print the name and quantity of each item in the cart.
        for (Item item : list) {
            System.out.println(item.product + ": " + item.qty);
        }
    }
}
import java.util.Scanner;

public class Store {

    private Warehouse warehouse;
    private Scanner scanner;

    // Constructor that takes a Warehouse and Scanner object and initializes them
    public Store(Warehouse warehouse, Scanner scanner) {
        this.warehouse = warehouse;
        this.scanner = scanner;
    }

    // Method that simulates a shopping experience for a customer
    public void shop(String customer) {
        ShoppingCart cart = new ShoppingCart();
        System.out.println("Welcome to the store " + customer);
        System.out.println("our selection:");

        // Prints out the list of products available in the warehouse
        for (String product : this.warehouse.products()) {
            System.out.println(product);
        }

        // Loop that prompts the user to add products to their shopping cart
        while (true) {
            System.out.print("What to put in the cart (press enter to go to the register): ");
            String product = scanner.nextLine();
            if (product.isEmpty()) {
                break;
            } else {
                // Checks if the selected product is available in the warehouse
                if (warehouse.stocks.get(product) == 0) {
                    System.out.println("Product not found!");
                } else {
                    // If the product is available, decrement its stock in the warehouse and add it to the cart
                    int stocks = warehouse.stocks.get(product);
                    stocks -= 1;
                    warehouse.stocks.put(product, stocks);
                    cart.add(product, warehouse.price(product));
                }
            }
            
        }

        // Prints out the contents of the shopping cart and the total price
        System.out.println("your shoppingcart contents:");
        cart.print();
        System.out.println("total: " + cart.price());
    }
}

