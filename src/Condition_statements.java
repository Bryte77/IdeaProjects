import java.util.Scanner;

public class Condition_statements {
    public static void main(String[] args) {

        //while loop
        Scanner input = new Scanner(System.in);
        String name = "";
//
//        while (name.isBlank()){
//            System.out.println("Enter your name: ");
//            name = input.next();
//        }
//        System.out.println("Hello" + " " + name);
//    }
        //Do while loop
        do {


            System.out.println("Enter your name: ");
            name = input.next();
        } while (name.isBlank());


        System.out.println("Hello" + " " + name);
    }
}