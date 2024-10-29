/* Method Overriding
Definition: Method overriding occurs when a subclass provides a specific implementation of a method that is already defined in its superclass.

Key Points:

Runtime Polymorphism: Overriding is an example of runtime polymorphism because the method to be executed is
determined at runtime based on the object being referenced.

Usage: It allows a subclass to provide a specific implementation of a method that is already defined in its superclass.
This is particularly useful in achieving dynamic behavior. For example:*/

class Animal {

    void makeSound() { //Method Overriding
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}
