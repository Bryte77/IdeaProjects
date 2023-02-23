import java.util.Scanner;

public class Square_or_not {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        float length, breadth ;
        System.out.println("Enter the length:");
        length = input.nextFloat();
        System.out.println("Enter the breath:");
        breadth = input.nextFloat();
        if (length == breadth ){
            System.out.println("It's a square");
        }else{
            System.out.println("It's not a square");
        }
    }
}



