import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int principal = 0;
        float annualInterestRate = 0;
        int period = 0;

        while (true) {
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if (principal>= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Principal must be between 1.000 and 1.000.000");
        }

        while (true) {
            System.out.print("Annual Interest Rate (>1% & 30%): ");
            annualInterestRate = scanner.nextFloat();
            if (annualInterestRate >= 1 && annualInterestRate <= 30)
                break;
            System.out.println("Annual Interest Rate must be between 1% and 30%");
        }

        while (true) {
            System.out.print("Period (Years): ");
            period = scanner.nextInt();
            if (period >= 1 && period <= 30)
                break;
            System.out.println("Period must be between 1 and 30 years");
        }

        double monthlyInterestRate = annualInterestRate / 100 / 12;
        double mortgage = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, period))
                / (Math.pow(1 + monthlyInterestRate, period) -1);

        String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormat);
    }

}
