import javax.swing.*;

public class Main extends Parent{
    Main(double basicSalary, double taxRelief) {
        super(basicSalary, taxRelief);
    }

    public static void main(String[] args) {
        String bs = JOptionPane.showInputDialog(null,"Enter Basic Salary");
        String tr = JOptionPane.showInputDialog(null,"Enter Tax relief");

        Main obj = new Main(Double.parseDouble(bs), Double.parseDouble(tr));

        JOptionPane.showMessageDialog(null, "take-away salary "+ obj.calculateSalary() +" \n deductions "+ obj.deductions()+ "\n tax is: "+ obj.deductions());

    }


    }
