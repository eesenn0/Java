import java.util.Scanner;
import java.util.ArrayList;

public class MainProgram {
    
    public static void main(String[] args) {
        // Create a new TodoList object
        TodoList list = new TodoList();
        // Create a new Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Create a new UserInterface object and pass in the TodoList and Scanner objects
        UserInterface userinterface = new UserInterface(list, scanner);
        
        // Call the start() method on the UserInterface object to begin the program
        userinterface.start();
    }
}
class TodoList {
    // Declare an ArrayList to store the tasks
    private ArrayList<String> list;
    
    public TodoList() {
        // Initialize the ArrayList
        this.list = new ArrayList<>();
    }
    
    // Add a task to the list
    public void add(String task) {
        this.list.add(task);
    }
    
    // Print the tasks in the list
    public void print() {
        int i = 1;
        while(i <= this.list.size()) {
            System.out.println(i + ":" + this.list.get(i - 1));
            i++;
        }                   
    }

    // Remove a task from the list
    public void remove(int number) {
        this.list.remove(number - 1);
    }
}
class UserInterface {
    // Declare a TodoList object and a Scanner object
    private TodoList todoList;
    private Scanner scanner;
    
    // Constructor that takes in a TodoList and Scanner object and sets them as instance variables
    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }
    
    // Start the user interface
    public void start() {
        // Loop until the user enters "stop"
        while(true) {
            System.out.print("Command: ");
            
            // Read the user's input
            String command = scanner.nextLine();
            
            // If the user enters "stop", break out of the loop
            if(command.equals("stop")) {
                break;
            }
            
            // If the user enters "add", prompt for a new task and add it to the list
            if(command.equals("add")) {
                System.out.print("To add: ");
                String add = scanner.nextLine();
                todoList.add(add);
            }
            
            // If the user enters "list", print the tasks in the list
            if(command.equals("list")) {
                todoList.print();
            }
            
            // If the user enters "remove", prompt for the task number to remove and remove it from the list
            if(command.equals("remove")) {
                System.out.print("Which one is removed?");
                int remove = Integer.parseInt(scanner.nextLine());
                todoList.remove(remove);
            }
        }
    }
}
