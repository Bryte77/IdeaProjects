import java.util.Scanner;

public class Greatest_number {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Enter the first number: ");
        num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        num2 = input.nextInt();
        System.out.println("Enter the third number" );
        num3 = input.nextInt();
        if (num1 >num2 && num2 >num3) {
            System.out.println("The greatest number is " + num1);
        }else{
            if (num2 > num1 && num1 > num3) {
                System.out.println("The greatest number is " + num2);
            }else{
                System.out.println("The greatest number is " + num3);
            }
        }
    }

}
