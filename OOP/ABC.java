public class JavaApplication50 {
    // The main method is the entry point of the program
    public static void main(String[] args) {
        // Create an instance of ClassC
        ClassC c = new ClassC();
        
        // Call method a() from ClassA
        c.a();
        // Call method b() from ClassB
        c.b();
        // Call method c() from ClassC
        c.c();
    }
}

// ClassA is a superclass that provides a method a()
class ClassA {
    // Method a() prints "A" to the console
    public void a() {
        System.out.println("A");
    }
}

// ClassB extends ClassA and provides an additional method b()
class ClassB extends ClassA {
    // Method b() prints "B" to the console
    public void b() {
        System.out.println("B");
    }
}

// ClassC extends ClassB and provides an additional method c()
class ClassC extends ClassB {
    // Method c() prints "C" to the console
    public void c() {
        System.out.println("C");
    }
}
