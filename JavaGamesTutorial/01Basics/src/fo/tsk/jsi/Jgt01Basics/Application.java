package fo.tsk.jsi.Jgt01Basics;

import javax.swing.*;
import java.awt.*;

public class Application extends JFrame {
    public Application() {

        initUI();
    }

    private void initUI() {

        add(new SpaceShipBoard());

        setSize(400, 300);
        //pack();

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
