// This code defines a class called Main1
public class Main1 {

    // This is the main method that will be executed when the program runs
    public static void main(String[] args) {

        // Create a new instance of the HealthStation class called childrensHospital
        HealthStation childrensHospital = new HealthStation();

        // Create two new instances of the Person class called ethan and peter
        Person ethan = new Person("Ethan", 1, 110, 7);
        Person peter = new Person("Peter", 33, 176, 85);

        // Print the number of weighings performed by the children's hospital
        System.out.println("weighings performed: " + childrensHospital.weighings());

        // Weigh the two people using the children's hospital and print the number of weighings again
        childrensHospital.weigh(ethan);
        childrensHospital.weigh(peter);
        System.out.println("weighings performed: " + childrensHospital.weighings());

        // Weigh ethan four more times and print the number of weighings again
        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);
        System.out.println("weighings performed: " + childrensHospital.weighings());
    }
}
// This code defines a class called Person
class Person {

    // These are private instance variables that can only be accessed within this class
    private String name;
    private int age;
    private int weight;
    private int height;

    // This constructor initializes a new Person object with a name but no other information
    public Person(String name) {
        this(name, 0, 0, 0);
    }

    // This constructor initializes a new Person object with a name, age, height, and weight
    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    // This method returns the name of the person
    public String getName() {
        return this.name;
    }

    // This method returns the age of the person
    public int getAge() {
        return this.age;
    }

    // This method increases the age of the person by 1 and returns the new age
    public int growOlder() {
        return this.age += 1;
    }
    
    // This method returns a boolean indicating whether the person is of legal age (over 18 years old)
    public boolean isOfLegalAge() {
        if(this.age > 17) {
            return true;
        }
        
        return false;
    }

    // This method sets the height of the person to a new value
    public void setHeight(int newHeight) {
        this.height = newHeight;
    }
    
    // This method returns the height of the person
    public int getHeight() {
        return this.height;
    }

    // This method sets the weight of the person to a new value
    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }
    
    // This method returns the weight of the person
    public int getWeight() {
        return this.weight;
    }

    // This method calculates and returns the body mass index (BMI) of the person
    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }

    // This method returns a string representation of the person's name and age
    @Override
    public String toString() {
        return this.name + ", age " + this.age + " years";
    }
}
// This code defines a class called HealthStation
class HealthStation {
    // This is a private instance variable that can only be accessed within this class
    private int weighings;
    
    // This method weighs a Person object and increments the number of weighings
    public int weigh(Person person) {
        weighings++;
        return person.getWeight();
    }
    
    // This method adds 1 unit of weight to a Person object
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    
    // This method returns the total number of weighings performed by the HealthStation
    public int weighings() {
        return weighings;
    }
}
