import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Animals cow = new Animals("tail","nanny","Blue","billy","Meeh");
        // System.out.println(cow.getTail()+ " "+  cow.getName() + " " + cow.getFur()+ " " + cow.getType() + " " + cow.getCry());
        String tail,name,fur,type,cry;
        Animals sheep =new Animals(" "," ", " "," ", " ");
        tail = JOptionPane.showInputDialog(null, "enter tail");
        sheep.setTail(tail);

        name = JOptionPane.showInputDialog(null, "enter name");
        sheep.setName(name);

        fur = JOptionPane.showInputDialog(null, "enter fur");
        sheep.setFur(fur);

        type = JOptionPane.showInputDialog(null, "enter type");
        sheep.setType(type);

        cry = JOptionPane.showInputDialog(null, "enter the cry");
        sheep.setCry(cry);

        JOptionPane.showMessageDialog(null,sheep.getTail() + "is" + sheep.getName() );
        JOptionPane.showMessageDialog(null,sheep.getName());
        JOptionPane.showMessageDialog(null,sheep.getFur());
        JOptionPane.showMessageDialog(null,sheep.getType());
        JOptionPane.showMessageDialog( null,sheep.getCry());
    }
}