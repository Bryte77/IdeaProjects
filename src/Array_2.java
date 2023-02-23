public class Array_2 {
    public static void main(String[] args) {
        String[] cars = new String[3];

        cars[0] = "camaro";
        cars[1] = "corvette";
        cars[2] = "Tesla";

        System.out.println(cars[1]);

        // for loop in array
        for(int i = 0; i< cars.length;i++){
            System.out.println(cars[i]);
        }

    }
}
