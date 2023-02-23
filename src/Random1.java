import java.util.Random;

public class Random1 {
    public static void main(String[] args) {

        Random input=new Random();
       int x = input.nextInt(6);
       double y = input.nextDouble();
        boolean z = input.nextBoolean();

        System.out.println(x);
    }


}
