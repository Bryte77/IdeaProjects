import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        double num1,num2,result=0;
        String op;
        Scanner input = new Scanner(System.in);

        System.out.println("MY CALCULATOR");
        System.out.println("Enter the first number:");

        num1= input.nextDouble();
        System.out.println("Enter the operator:");
        op = input.next();

        System.out.println("Enter the second number:");
        num2= input.nextDouble();


        if(op.equals("+")){
            result=num1 + num2;

        } else if (op.equals("/")) {
            result=num1 / num2;

        } else if (op.equals("*")) {
            result = num1 * num2;

        } else if (op.equals("%")) {
            result=num1 % num2;
        }else {
            System.out.println("Invalid");
        }

        System.out.println(result);
    }
}
