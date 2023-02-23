import java.util.Scanner;

public class Integer_type {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
        int num ;
        System.out.println("Enter a number: ");
        num = input. nextInt();
        if (num >= 0) {
            System.out.println(num + " is positive");
        }else{
            System.out.println(num + " is negative" );
        }
    }

}