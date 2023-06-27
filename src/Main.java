import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat();

        System.out.print("Period (Years): ");
        int period = scanner.nextInt();

        double monthlyInterestRate = annualInterestRate / 100 / 12;
        double mortgage = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, period))
                / (Math.pow(1 + monthlyInterestRate, period) -1);

        String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormat);
    }
}
