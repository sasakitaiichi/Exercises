import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        int lessThan10 = number % 10;//除10取余数
        number /= 10;//除10去掉个位数
        int tens = number % 10;//同上
        number /= 10;
        int hundreds = number % 10;
        number /= 10;
        int sum = hundreds + tens + lessThan10;
        System.out.println("The sum of the digits is " + sum);
    }
}
