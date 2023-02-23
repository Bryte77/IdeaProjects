import javax.swing.*;

public class Main3 {



        public static void main(String[] args) {
            Salary3 s = new Salary3();
            String basic2 = JOptionPane.showInputDialog(null, "Please enter the basic salary");
           s.setBasic_salary(Double.parseDouble(basic2));
            String tax1 = JOptionPane.showInputDialog(null, "Please enter the tax relief");
           s.setTax_relief(Double.parseDouble(tax1));


            JOptionPane.showMessageDialog(null,basic2);
            JOptionPane.showMessageDialog(null,tax1);
           // s.basic_salary =5000;
          // s.tax_relief =600;
            //s.display();
           // System.out.printf("------" + s.basic_salary);
        }

    }


