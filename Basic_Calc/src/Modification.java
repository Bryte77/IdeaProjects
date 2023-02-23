
import java.util.Scanner;

public class Modification {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number_of_classes_held, number_of_classes_attended, sum, total;
        char option;
        System.out.println("Enter the number of classes held: ");
        number_of_classes_held = input.nextInt();
        System.out.println("Enter the number of classes attended: ");
        number_of_classes_attended = input.nextInt();
        total = number_of_classes_attended / number_of_classes_held;
        sum = 100 * total;
        System.out.println("you attendance is " + sum + " %");
        if (sum > 75) {
            System.out.println("You are allowed to sit for exams ");
        } else {
            System.out.println("you are not allowed to sit for exams ");
        }
        System.out.println("Do you have a medical cause ,enter a (Y) for yes or (N) for no ");
        option = input.next().charAt(0);
        if (option == 'Y') {
            System.out.println("you are not fit to write the exams");
        } else {
            if (option == 'N') {
                System.out.println("You are fit to write the exams");
            }
        }
    }
}
