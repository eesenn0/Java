// This is the main class that will be executed when the program runs
public class MainProgram {

    // The main method is the entry point of the program
    public static void main(String[] args) {
        // Create a new Dog object and assign it to a NoiseCapable variable named dog
        NoiseCapable dog = new Dog();
        // Call the makeNoise method on the dog object, which will call the bark method of the Dog class
        dog.makeNoise();        

        // Create a new Cat object with name "Garfield" and assign it to a NoiseCapable variable named cat
        NoiseCapable cat = new Cat("Garfield");
        // Call the makeNoise method on the cat object, which will call the purr method of the Cat class
        cat.makeNoise();
        // Cast the cat object to a Cat variable named c
        Cat c = (Cat) cat;
        // Call the purr method on the c object
        c.purr();
    }
}

// This is the Animal class, which is an abstract class because it has at least one abstract method (makeNoise)
public abstract class Animal {
    
    // The name of the animal
    public String name;
    
    // Constructor method for creating a new Animal object with a given name
    public Animal(String name) {
        this.name = name;
    }
    
    // The eat method, which simply prints that the animal is eating
    public void eat() {
        System.out.println(this.name + " eats");
    }
    
    // The sleep method, which simply prints that the animal is sleeping
    public void sleep() {
        System.out.println(this.name + " sleeps");
    }
    
    // Getter method for the name property
    public String getName() {
        return this.name;
    }
}

// This is the Dog class, which extends the Animal class and implements the NoiseCapable interface
public class Dog extends Animal implements NoiseCapable {

    // Constructor method for creating a new Dog object with default name "Dog"
    public Dog() {
        super("Dog");
    }

    // Constructor method for creating a new Dog object with a given name
    public Dog(String name) {
        super(name);
    }
    
    // The bark method, which simply prints that the dog is barking
    public void bark() {
        System.out.println(super.name + " barks");
    }

    // The makeNoise method, which is required by the NoiseCapable interface and calls the bark method of the Dog class
    @Override
    public void makeNoise() {
        bark();
    }
}

// This is the Cat class, which extends the Animal class and implements the NoiseCapable interface
public class Cat extends Animal implements NoiseCapable {
    
    // Constructor method for creating a new Cat object with default name "Cat"
    public Cat() {
        super("Cat");
    }
    
    // Constructor method for creating a new Cat object with a given name
    public Cat(String name) {
        super(name);
    }
    
    // The purr method, which simply prints that the cat is purring
    public void purr() {
        System.out.println(super.name + " purrs");
    }

    // The makeNoise method, which is required by the NoiseCapable interface and calls the purr method of the Cat class
    @Override
    public void makeNoise() {
        purr();                
    }
}

// This is the NoiseCapable interface, which requires any implementing class to have a makeNoise method
public interface NoiseCapable {
    
    public void makeNoise();    
}
