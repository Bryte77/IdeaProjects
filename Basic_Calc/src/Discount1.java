import java.util.Scanner;

public class Discount1 {

    public static void main (String[]  args){
        Scanner input = new Scanner (System.in);

        int quantity,sum1,sum2;
        double total;
        System.out.println("DISCOUNT");
        System.out.println("Enter the quantity you want to purchase");
        quantity =input.nextInt();
        if (quantity > 1000){
            sum1=quantity * 100;
            System.out.println("sum of the quantity " + sum1);
            total = 0.1 * sum1;
            total = sum1 - total;
            System.out.println("10% discount has been applied and your total is " + total);
        }else{

            sum2 = quantity * 100;
            System.out.println("you are not eligible for the discount and your total is " + sum2);
        }
    }
}

