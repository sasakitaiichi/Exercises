import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter balance and interest rate:");
        double balance = input.nextDouble();
        double interese_rate = input.nextDouble();
        double interest = balance * (interese_rate / 1200);
        System.out.println("The interest is" + interest);


    }
}
