import java.util.Scanner;

public class Switch_Statement {
    public static void main(String[] args) {



        ;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a day of the week:");
        String day = input.nextLine();

        switch (day) {

            //System.out.println();
            case "Sunday":
                System.out.println("It is Sunday");
                break;

            case "monday":
                System.out.println("It is monday");
                break;

            case "tuesday":
                System.out.println("It is tuesday");
                break;

            case "wednesday":
                System.out.println("It is wednesday");
                break;

            case "thursday":
                System.out.println("It is thursday");
                break;

            case "friday":
                System.out.println("It is friday");
                break;

            case "saturday":
                System.out.println("It is saturday");
                break;

            default:
                System.out.println("It is not a day");
        }
    }
}
