import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter a number ");
        num =input.nextInt();

        if(num % 2 != 0) {
            System.out.println("the number is a prime numnber");
        }else if (num % 2 == 0){
            System.out.println("It's  an even number");
        }
    }
}
