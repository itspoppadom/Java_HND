package Exercise2;

public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;

    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public double getArea(int radius) {
        double area = Math.PI * radius * radius;
        return area;
    }
    public double getPerimeter(int radius) {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;

    }


}
