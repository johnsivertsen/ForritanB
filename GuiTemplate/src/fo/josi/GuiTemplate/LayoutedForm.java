package fo.josi.GuiTemplate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class LayoutedForm implements IForm {
    private JFrame frame;
    private JTextField textField;
    private JTextArea textArea;

    private ActionListener button1Press;
    private ActionListener button2Press;
    private ActionListener button3Press;

    private JPanel panelNorth;
    private JScrollPane scrollPane;

    public LayoutedForm() {
        frame = new JFrame();
        frame.setSize(620, 480);
        LayoutManager l = new BorderLayout();
        frame.setLayout(l);

        panelNorth = new JPanel();
        panelNorth.setLayout(new FlowLayout());
        frame.add(panelNorth, BorderLayout.NORTH);

        textField = new JTextField();
        textArea = new JTextArea();
    }

    public void show() {

        button1Press = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText  = textField.getText();
                Log("Knapp 1: " + inputText);
            }
        };

        button2Press = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText  = textField.getText();
                Log("Knapp 2: " + inputText);
            }
        };

        button3Press = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText  = textField.getText();
                Log("Knapp 3: " + inputText);
            }
        };

        AddTextField();
        AddButton("Næsti tími", button1Press);
        AddButton("Et", button2Press);
        AddButton("Gang", button3Press);
        AddTextArea();
        frame.setVisible(true);
    }

    private void AddTextField() {
        Dimension d = new Dimension();
        d.width = 300;
        d.height = 25;
        textField.setPreferredSize(d);
        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                Log("keyTyped triggered");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                Log("keyPressed triggered");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                Log("keyReleased triggered");
            }
        });
        panelNorth.add(textField);
    }

    private void AddButton(String caption, ActionListener actionListener) {
        JButton button = new JButton();
        button.setText(caption);
        button.addActionListener(actionListener);
        panelNorth.add(button);
    }

    private void AddTextArea() {
        Font font = new Font(Font.MONOSPACED, Font.PLAIN, 12);
        textArea.setFont(font);
        textArea.setForeground(Color.LIGHT_GRAY);
        textArea.setBackground(Color.DARK_GRAY);
        textArea.setCaretColor(Color.LIGHT_GRAY);

        scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );
        frame.add(scrollPane, BorderLayout.CENTER);
    }

    private void Log(String text) {
        textArea.append((text + "\n"));
    }
}
