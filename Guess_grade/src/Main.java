import javax.swing.*;

public class Main {
    public static void main(String[] args) {
      String course = JOptionPane.showInputDialog(null,"Enter the course name");
      String marks = JOptionPane.showInputDialog(null,"Enter the marks ");
      MarkRep markRep = new MarkRep(Double.parseDouble(marks),course);

      JOptionPane.showMessageDialog(null,"please the remark of the student");
      JOptionPane.showMessageDialog(null,  "please the remark of th student is"+"please the course of the student is" + markRep.getCourse()
              + "The mark of the student" + markRep.getMarks());
    }
}