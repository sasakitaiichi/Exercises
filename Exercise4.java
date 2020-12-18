import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final  double POUNDS_FOR_KILOGRAMS = 0.454;
        System.out.println("Enter a number in pounds:");
        double pounds = input.nextDouble();
        double kilograms = pounds * POUNDS_FOR_KILOGRAMS;
        System.out.println(pounds + "pounds is" + kilograms + "kilograms");


    }
}
