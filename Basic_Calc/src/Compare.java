import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, num3, num4;

        System.out.println("Enter the first number: ");
        num1 = input.nextDouble();

        System.out.println("Enter the second number");
        num2 = input.nextDouble();

        System.out.println("Enter the third number");
        num3 = input.nextDouble();

        System.out.println("Enter the fourth number");
        num4 = input.nextDouble();

        if (num1 == num2 & num2 == num3 & num3 == num4) {
            System.out.println("same");
        } else {
            System.out.println("not the same");
        }
    }
}

