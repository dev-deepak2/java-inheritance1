// Heres the example code

// Base class
class Animal {
    // Field and method of the parent class
    String name;

    public void eat() {
        System.out.println("I can eat");
    }
}

// Derived class
class Dog extends Animal {
    // New method in subclass
    public void display() {
        System.out.println("My name is " + name);
    }

    // Overriding the eat() method
    @Override
    public void eat() {
        System.out.println("I eat dog food");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create an object of the subclass
        Dog labrador = new Dog();

        // Access field of superclass
        labrador.name = "Rohu";
        labrador.display();

        // Call method of superclass using object of subclass
        labrador.eat();
    }
}
