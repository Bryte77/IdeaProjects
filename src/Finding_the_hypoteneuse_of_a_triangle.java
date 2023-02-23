import java.util.Scanner;

public class Finding_the_hypoteneuse_of_a_triangle {
    public static void main(String[] args) {

        double x,y,z;
        Scanner input =new Scanner(System.in);

        System.out.println("Enter side x: ");
        x=input.nextDouble();

        System.out.println("Enter side y: ");
        y=input.nextDouble();

       z = Math.sqrt( (x*x)+(y*y));

        System.out.println("The hypotenuse is:" + z);

      


    }
}
