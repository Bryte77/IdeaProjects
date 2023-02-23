import java.util.Scanner;

public class Bonuses {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
        double salary,net_bonus_amount;
        double bonus = 0.05;
        int years;
        System.out.println("Enter your salary ");
        salary = input.nextDouble();
        System.out.println("Enter the of years of service ");
        years = input.nextInt();
        if (years >= 5) {
            net_bonus_amount = salary * bonus;
            System.out.println("Your net bonus amount is " + net_bonus_amount);
        }else{
            System.out.println("You're not qualified for the bonus");
        }
    }
}
