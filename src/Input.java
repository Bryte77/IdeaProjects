import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = input.nextLine();
        System.out.println("What is your age? ");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("What is favourite food");
        String food = input.nextLine();

        System.out.println("Bonjour" + " "  +name);
        System.out.println("You are" + " " + age+ "years old");
        System.out.println("You ike " + " " + food);
    }
}
