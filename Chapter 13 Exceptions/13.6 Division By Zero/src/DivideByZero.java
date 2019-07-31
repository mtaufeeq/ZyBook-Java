import java.util.Scanner;

public class DivideByZero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter 2 numbers: ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            if (num2 == 0)
                throw new ArithmeticException("Exception: Division by zero");

            double div = (double) num1 / (double) num2;

            if (div < 0)
                throw new Exception("Exception: Division is negative");

            System.out.println("a/b = " + div);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}