import java.util.Scanner;

public class Absolute2 {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
        float num, absolute;
        System.out.println("Enter a number: ");
        num = input.nextFloat();
        if (num == 0) {
            System.out.println("Zero");
        } else if (num > 0) {
            System.out.println("positive");
        } else if (num < 1) {
            System.out.println("small");
        } else if (num > 1000000) {
            System.out.println("Large");
        } else if (num < 0){
            System.out.println("Negative");
            absolute = num - (num *2);
            if (absolute < 1) {
                System.out.println("small");
            } else if ( absolute > 1000000) {
                System.out.println("Large");

            }
        }
    }
}
