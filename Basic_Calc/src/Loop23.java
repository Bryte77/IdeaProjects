import java.util.Scanner;

public class Loop23 {





        public static void main(String[] args) {

            Scanner s = new Scanner(System.in);
            int intake;
            int sum=0;
            int pos=0;
            int neg=0;
            double avg;
            do{
                System.out.println("Please enter the integer");
                intake=s.nextInt();
                sum=sum+intake;
                avg = (float) sum/(pos+neg);
                if(intake > 0){
                    pos++;
                }else if(intake <0){
                    neg++;
                }

            }while(intake!= 0);

            System.out.println("the number of positives values"+pos);
            System.out.println("the number of negatives values"+neg);
            //System.out.println("the average of values"+((float)sum/(pos+neg)));
            System.out.println(" the average of values " + avg);
        }

    }



