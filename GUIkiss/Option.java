
package GUIkiss;

import javax.swing.*;

public class Option {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "What is your name?");
        int choice = JOptionPane.showConfirmDialog(null, "Are you love me " + name + "?");
        if (choice == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Oww Yee ! I love you too.");
        } else {
            JOptionPane.showMessageDialog(null, "Go to hell :)");
        }
    }
}
