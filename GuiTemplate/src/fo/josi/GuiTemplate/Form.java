package fo.josi.GuiTemplate;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form {
    private JFrame frame;
    private JTextField textField;
    private JTextArea textArea;
    private JButton button;

    public Form() {
        frame = new JFrame();
        frame.setSize(720, 480);
        frame.setLayout(null);

        button = new JButton();
        textField = new JTextField();
        textArea = new JTextArea();
    }

    public void Show() {
        AddButton("Trýst her");
        AddTextField();
        AddTextArea();
        frame.setVisible(true);
    }

    private void AddTextField() {
        textField.setBounds(10, 10, 600, 25);
        frame.add(textField);
    }

    private void AddButton(String caption) {
        button.setText(caption);
        button.setBounds(610, 10, 100, 25);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText  = textField.getText();
                Log("Tekstur: " + inputText);
                //String datepart = inputText.substring(0,2);
            }
        });
        frame.add(button);
    }

    private void AddTextArea() {
        textArea.setBounds(10, 45, 600, 400);
        frame.add(textArea);
    }

    private void Log(String text) {
        textArea.append((text + "\n"));
    }
}
