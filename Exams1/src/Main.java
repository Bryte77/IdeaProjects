import javax.swing.*;

public class Main extends Tax_calculator {
    public Main(double basic_salary, double tax_relief) {
        super(basic_salary, tax_relief);
    }

    public static void main(String[] args) {
    double basic_salary = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter basic salary: "));
    double tax_relief = Double.parseDouble(JOptionPane.showInputDialog(null," Enter the tax relief: "));
    Main s = new Main(basic_salary,tax_relief);
    JOptionPane.showMessageDialog(null,basic_salary +"\n" + tax_relief + "\n" +s.deductions() + "\n" + s.Calc_Tax() + "\n" + s.Taxeable_income());
    }
}