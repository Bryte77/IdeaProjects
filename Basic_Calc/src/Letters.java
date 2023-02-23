import java.util.Scanner;

public class Letters {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.println("Enter the letter: ");
        ch = input.next().charAt(0);
        if (ch>= 'A' && ch<= 'Z') {
            System.out.println("The letter " + ch + " is an uppercase letter");
        } else if (ch>= 'a' && ch<= 'z') {
            System.out.println("The letter " + ch + " is a lower case letter");
        }else{
            System.out.println("It is not an alphabet");

        }
    }
}
