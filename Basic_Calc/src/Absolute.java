import java.util.Scanner;

public class Absolute {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,absolute;
        System.out.println("Enter a number:");
        num = input.nextInt();
        if (num<0) {
            absolute = num - (num * 2);
            System.out.println(absolute);
        }else{
            System.out.println(num);
        }
    }
}
