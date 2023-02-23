import javax.swing.JOptionPane;

public class JOption {

    public static void main(String[] args) {
    String name = JOptionPane.showInputDialog(null,"Enter your name");
        int age = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your age"));

        double height = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter your height" +
                ""));

        JOptionPane.showMessageDialog(null,"Your name is " + name);
    JOptionPane.showMessageDialog(null,"You are  " + age + " old");
        JOptionPane.showMessageDialog(null,"You are  " +height + " cm tall");

    }
}
