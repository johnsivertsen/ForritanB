package fo.tsk.josi.windownavigationdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

public class PanelMain extends ViewBase {
    private JButton button1;
    private ActionListener button1Click;

    public PanelMain() {
        setSize(new Dimension(300, 400));
        setLayout(null);

        button1 = new JButton("Far til Admin");
        button1.setBounds(20, 20, 150, 50);
        button1.addActionListener(e -> {
            getMain().NavigateTo("Admin");
        });
        add(button1);
    }


}
