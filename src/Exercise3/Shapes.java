package Exercise3;
// Class created for calculating the area of rectangles and squares
public class Shapes {
    private int length;
    private int breadth;

public Shapes(int length, int breadth) {
    this.length = length;
    this.breadth = breadth;
}
public int getLength() {
    return length;
}
public void setLength(int length) {
    this.length = length;
}
public int getBreadth() {
    return breadth;
}
public void setBreadth(int breadth) {
    this.breadth = breadth;
}
public String calculateArea(int length, int breadth) {
    double Area = length * breadth;
    System.out.println("Area = " + Area);
    return null;
}
public void calculatePerimeter(int length, int breadth) {
    double Perimeter = length * breadth;
    System.out.println("Perimeter = " + Perimeter);
}
public void calculateDiameter(int length, int breadth) {
    double Diameter = Math.pow(length, breadth);
    System.out.println("Diameter = " + Diameter);
}
}
