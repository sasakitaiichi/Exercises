import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        final double PI = 3.14159265359;
        System.out.println("Enter radius and length  ");
        double radius = Input.nextDouble();
        double length = Input.nextDouble();
        double area = radius * radius * PI;
        double volume = area * length;
        System.out.println("The area is" + area);
        System.out.println("The volume is" + volume);

    }
}
