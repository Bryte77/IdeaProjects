import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //  System.out.println("Hello world!");
        String name,gender,complexion,stature;
        int age,height;

        Human A1= new Human (" "," "," "," "," ");
        name = JOptionPane.showInputDialog(null,"What is your name");
        A1.setName(name);

        complexion = JOptionPane.showInputDialog(null,"What is your complexion");
        A1.setComplexion(complexion);

        gender = JOptionPane.showInputDialog(null,"State your gender");
        A1.setGender(gender);

        stature = JOptionPane.showInputDialog(null,"What is your stature");
        A1.setStature(stature);

        // home_town = JOptionPane.showInputDialog(null,"What is your stature");
        // A1.getHome_town(home_town);
        JOptionPane.showMessageDialog(null,A1.getName());
        JOptionPane.showMessageDialog(null,A1.getComplexion());
        JOptionPane.showMessageDialog(null,A1.getGender());
        JOptionPane.showMessageDialog(null,A1.getStature());
    }
}