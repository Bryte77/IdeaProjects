import java.util.Scanner;

public class Grade {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
        int marks;
        System.out.println("Enter the marks of the student");
        marks = input.nextInt();
        if (marks >= 80) {
            System.out.println('A');
        }else{
            if (marks >= 60) {
                System.out.println( 'B');
            }else{
                if (marks >= 50) {
                    System.out.println('C');
                }else{
                    if (marks >= 45) {
                        System.out.println('D');
                    }else{
                        if (marks >= 25) {
                            System.out.println('E');
                        }else{
                            System.out.println('F');
                        }
                    }
                }
            }
        }
    }
}
