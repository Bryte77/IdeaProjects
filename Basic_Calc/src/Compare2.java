import javax.swing.*;

public class Compare2 {
    public static void main(String[] args) {

        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number"));

        if (num1 % 2 == 0){
            JOptionPane.showMessageDialog(null,"\nit's even");
        }else{
            JOptionPane.showMessageDialog(null,"It's odd");
        }
    }
}
