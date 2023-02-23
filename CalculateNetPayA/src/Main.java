import javax.swing.*;

public class Main {
    public static void main(String[] args) {

     String basic =   JOptionPane.showInputDialog(null,"Please enter the basic salary");
        String basic1  =   JOptionPane.showInputDialog(null,"Please enter the tax relief");
        Salary s = new Salary();
       // s.basic_salary = 500.00;
        s.basic_salary = Double.parseDouble(basic);
        //s.tax_relief = 200.00;
        s.tax_relief = Double.parseDouble(basic1);
        s.display();
    }
}