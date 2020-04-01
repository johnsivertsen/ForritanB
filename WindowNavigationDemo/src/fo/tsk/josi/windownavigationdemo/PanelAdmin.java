package fo.tsk.josi.windownavigationdemo;

import javax.swing.*;
import java.awt.*;

public class PanelAdmin extends ViewBase {
    private JButton button1;
    private JLabel label1;

    public PanelAdmin() {
        setSize(new Dimension(300, 400));
        setLayout(null);

        button1 = new JButton("Far til Main");
        button1.setBounds(20, 120, 150, 50);
        button1.addActionListener(e -> {
            getMain().NavigateTo("Main");
        });
        add(button1);

        label1 = new JLabel();
        label1.setText("Hetta er Admin");
        label1.setBounds(20, 150, 150, 50);
        add(label1);
    }
}
