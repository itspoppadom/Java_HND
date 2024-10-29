package Exercise3;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Shapes s1 = new Shapes(4,6);
        System.out.println(s1);
        s1.setBreadth(5);
        s1.setLength(8);
        System.out.printf("The area is :%s%n", s1.calculateArea(5, 8));

    }
}
