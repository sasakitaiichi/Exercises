import java.util.Scanner;

import static java.lang.Math.tan;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of a side of hexagon in inch:");
        double side = input.nextDouble();
        int allside = 6;
        double pie = 3.14159;
        double area = (6 * (side * side)) / (4 * tan( pie / 6 ));
        System.out.println( "area is " + area);

    }
}
