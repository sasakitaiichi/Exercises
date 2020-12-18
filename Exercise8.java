import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of water in kilograms  the initialTemperature the finalTemperature:");
        double kilograms = input.nextDouble();
        double initialTemperature = input.nextDouble();
        double finalTemperature = input.nextDouble();
        double energy = kilograms * (finalTemperature - initialTemperature) * 4184;
        System.out.println("The energy needed is " + energy);
    }
}
