// This line defines the MainProgram class
public class MainProgram {

    // This is the main method, which is the entry point for the program
    public static void main(String[] args) {
        
        // Create a new Menu object and assign it to the menu variable
        Menu menu = new Menu();
        
        // Add some meals to the menu
        menu.addMeal("Tofu ratatouille");
        menu.addMeal("Chilli coconut chicken");
        // This meal is a duplicate, so it won't be added again
        menu.addMeal("Chilli coconut chicken"); 
        menu.addMeal("Meatballs with mustard sauce");
        
        // Print the current list of meals in the menu
        menu.printMeals();
        
        // Clear the menu of all meals
        menu.clearMenu();
        
        // Add a new meal to the menu
        System.out.println();
        menu.addMeal("Tomate and mozerella salad");
        
        // Print the current list of meals in the menu (should only contain the new salad)
        menu.printMeals();
    }
    
}

// This line defines the Menu class
class Menu {

    // This is a private ArrayList that stores the meals in the menu
    private ArrayList<String> meals;

    // This is the constructor for the Menu class, which initializes the meals ArrayList
    public Menu() {
        this.meals = new ArrayList<>();
    }

    // This method returns the entire meals ArrayList
    public ArrayList<String> getMenu() {
        return this.meals;
    }

    // This method adds a new meal to the menu if it doesn't already exist
    public void addMeal(String meal) {
        if (!meals.contains(meal)) {
            meals.add(meal);
        }
    }

    // This method prints out each meal in the meals ArrayList
    public void printMeals() {
        for (String meal : meals) {
            System.out.println(meal);
        }
    }

    // This method removes all meals from the meals ArrayList
    public void clearMenu() {
        while (!meals.isEmpty()) {
            meals.remove(meals.size() - 1);
        }
    }
}
