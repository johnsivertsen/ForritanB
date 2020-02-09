package fo.tsk.jsi.Jgt01Basics;

import javax.swing.*;
import java.awt.*;

public class Application extends JFrame {
    public Application() {

        initUI();
    }

    private void initUI() {

        //add(new Board());
        //add(new DonutBoard());
        add(new ImageBoard());

        //setSize(250, 200);
        pack();

        setTitle("Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            Application ex = new Application();
            ex.setVisible(true);
        });
    }
}
