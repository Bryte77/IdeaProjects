import java.util.Scanner;

public class Oldest_and_youngest_age {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Enter the first age: ");
        num1 = input.nextInt();
        System.out.println("Enter the second age: ");
        num2 = input.nextInt();
        System.out.println("Enter the third age: ");
        num3 = input.nextInt();
        if (num1 > num2 && num2 > num3) {
            System.out.println("The oldest age is " + num1);
            System.out.println("The youngest age is " + num3);
        }else if(num2 > num1 && num1 >num3) {
            System.out.println(" The oldest age is " + num2);
            System.out.println(" The youngest age is " + num3);
        }else if(num3 >num1 && num1 > num2) {
            System.out.println("The oldest age is " + num3);
            System.out.println(" The youngest age is " + num2);
        } else if (num1 > num3 && num3 >num2) {
            System.out.println("The oldest age is " + num1);
            System.out.println("The oldest sge is " + num2);
        } else if (num2 >num3 && num3 > num1) {
            System.out.println("The oldest age is " + num2);
            System.out.println("The youngest age is " + num1);
        } else if (num3 > num2 && num2 >num1) {
            System.out.println("The oldest age is " + num3);
            System.out.println("The youngest age is " + num1);
        }
    }

}

