package Exercise2;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(7);
        System.out.println("The radius is : " + c1.getRadius());
        System.out.println("The area of the circle is" + c1.getArea(7));
        System.out.println("The perimeter of the circle is" + c1.getPerimeter(7));
        c1.setRadius(9);
        System.out.println("The new radius is: " + c1.getRadius());
    }
}
