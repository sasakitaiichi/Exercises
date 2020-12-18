import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter a degree in Celsius: ");
        double Celsius = Input.nextDouble();
        double Fahrenheit = (9.0 / 5) * Celsius + 32;
        System.out.println(Celsius + " Celsius is " + Fahrenheit + " Fahrenheit");
    }
}
