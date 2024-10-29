/* Method Overloading
Definition: Method overloading occurs when multiple methods in the same class have the same name but different parameter lists
(different type, number, or both).

Key Points:

Compile-Time Polymorphism: Overloading is an example of compile-time polymorphism because the method that will be executed
 is determined at compile time based on the method signature.

Usage: It allows methods to handle different types or numbers of inputs, providing flexibility and readability. For example:*/


class MathUtils {
    int add(int a, int b) { // Method Overloading
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
