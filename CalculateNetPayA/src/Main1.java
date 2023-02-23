import javax.swing.*;

public class Main1 {

        public static void main(String[] args) {

            String basic = JOptionPane.showInputDialog(null, "Please enter the basic salary");
            String tax = JOptionPane.showInputDialog(null, "Please enter the tax relief");
            double basic2 = Double.parseDouble(basic);
           Salary1 s = new Salary1(basic2,Double.parseDouble(tax));

            s.display();
        }

}
