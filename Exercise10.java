import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the monthly saving amount:");
        final double MONTHLY_INTEREST_RATE = 0.00417;
        System.out.print("Enter the monthly saving amount: ");
        double savingAmount = input.nextDouble();
        double total = 100 * (1 + MONTHLY_INTEREST_RATE);
        total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
        total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
        total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
        total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
        total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
        System.out.println("After the sixth month, the account value is " + total);

    }
}
