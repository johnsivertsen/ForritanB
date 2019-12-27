package fo.josi;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        String input = JOptionPane.showInputDialog("How old are you?");
        System.out.println("Hello " + name);
    }
}
