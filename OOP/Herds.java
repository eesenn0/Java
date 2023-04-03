public class MainProgram {

    public static void main(String[] args) {
        // create a new Herd object
        Herd herd = new Herd();
        
        // add four Organism objects to the herd
        herd.addToHerd(new Organism(57, 66));
        herd.addToHerd(new Organism(73, 56));
        herd.addToHerd(new Organism(46, 52));
        herd.addToHerd(new Organism(19, 107));
        
        // move the herd by (10, 10)
        herd.move(10, 10);
        
        // print the herd's current state
        System.out.println(herd);
    }

}

public interface Movable {
    void move(int dx, int dy);
}

public class Organism implements Movable {
    
    private int x;
    private int y;
    
    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }           
    
    @Override
    public void move(int dx, int dy) {
        // update the organism's position by (dx, dy)
        this.x += dx;
        this.y += dy;
    }
    
    @Override
    public String toString() {
        // return a string representation of the organism's position
        return "x: " + this.x + "; y: " + this.y;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {
    
    private List<Movable> list;
    
    public Herd() {
        // create a new empty list of Movable objects
        this.list = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable) {
        // add a new Movable object to the herd's list
        this.list.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        // move the entire herd by (dx, dy) by calling each Movable object's move method
        for (Movable movable : list) {
            movable.move(dx, dy);
        }
    }
    
    @Override
    public String toString() {
        String result = "";
        // create a string representation of the entire herd by calling each Movable object's toString method
        for (Movable movable : list) {
            result += movable.toString() + "\n";
        }
        
        // return the string representation of the entire herd
        return result;
    }
}
