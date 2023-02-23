import java.util.Scanner;

public class Leap_year {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
        int year;
        System.out.println("Enter the year");
        year = input.nextInt();
        if (400 % year ==0){
            System.out.println(year + "  is a leap year");
        }else{
            System.out.println(year + " is not a leap year");
        }
    }
}
