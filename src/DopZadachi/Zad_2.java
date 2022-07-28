package DopZadachi;

import javax.swing.*;

public class Zad_2 {
    public static void main(String[] args) {
        String name;
        String password;
        boolean ttt = true;
        name = JOptionPane.showInputDialog("Enter your name");
        while (ttt) {
        password = JOptionPane.showInputDialog("Enter your password");
        int i = password.length();

            if (i < 8) {
                JOptionPane.showMessageDialog(null, "Enter password from 8 to 15 symbol");
            } else if (i > 15){
                JOptionPane.showMessageDialog(null, "Enter password from 8 to 15 symbol");
            } else {
                JOptionPane.showMessageDialog(null, name + ", your password " + "\"" + password + "\"");
                ttt = false;
            }
        }
    }
}
