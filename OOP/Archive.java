import java.util.Scanner;
import java.util.ArrayList;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> list = new ArrayList<>();
        
        // Loop until the user enters an empty identifier or name
        while(true){
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            
            // If the identifier is empty, break out of the loop
            if(id.isBlank()) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            
            // If the name is empty, break out of the loop
            if(name.isBlank()) {
                break;
            }
            
            // Create an Archive object with the given identifier and name
            Archive archive = new Archive(id, name);
            
            // Check if an Archive with the same identifier already exists in the list
            boolean isExist = false;
            
            for(Archive a : list) {
                if(a.equals(archive)) {
                    isExist = true;
                    break;
                }
            }
            
            // If the Archive does not exist in the list, add it
            if(!isExist) {
                list.add(archive);                
            }
        }
                        
        System.out.println("==Items==");
        
        // Print out the contents of the list
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getID() + ": " + list.get(i).getName());
        }
    }
    
}

// Class representing an archive with an identifier and a name
public class Archive {
    String id, name;
    
    // Constructor to create an Archive object with the given identifier and name
    public Archive(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    // Method to get the identifier of the Archive
    public String getID() {
        return this.id;
    }
    
    // Method to get the name of the Archive
    public String getName() {
        return this.name;
    }
    
    // Override the equals method to compare two Archive objects based on their identifiers
    @Override
    public boolean equals(Object compared) {
        // Check if the two objects are the same
        if(this == compared) {
            return true;
        }
        
        // Check if the compared object is an Archive object
        if(!(compared instanceof Archive)) {
            return false;
        }
        
        // Cast the compared object to an Archive object
        Archive compID = (Archive) compared;
        
        // Compare the identifiers of the two Archive objects
        if(this.getID().equals(compID.getID())) {
            return true;
        }
        
        return false;
    }
}
