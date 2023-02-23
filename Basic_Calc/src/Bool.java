public class Bool {
    public static void main (String[]args){
        int x = 2;
        int y = 5;
        int z = 0;
        if (x == 2) {
            System.out.println("True");
        }else {
            System.out.println("False");
        }
        if (x !=5 ) {
            System.out.println("True");
        }else {
            System.out.println("False");
        }
        if(x != 5 && y >= 5){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        if (2 != 0|| x==2) {
            System.out.println("True");
        }else {
            System.out.println("False");
        }
        if (!(y < 10)){
            System.out.println("False");
        } else{
            System.out.println("True");
        }
    }
}
