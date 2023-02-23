import javax.swing.*;

public class GuessGrade {
    public static void main(String[] args) {
        double mark = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter number"));
        String course = JOptionPane.showInputDialog(null,"Enter course");
        Markrep m = new Markrep(mark,course);
        JOptionPane.showMessageDialog(null,"Your course is " + course+"\n Your mark is "+
                mark+"\n Your grade is "+m.remark());
    }
}
