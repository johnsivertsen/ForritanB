package fo.tsk.josi.windownavigationdemo;

import javax.swing.*;

public class Main extends JFrame {
    private PanelMain panelMain;
    private PanelAdmin panelAdmin;

    public static void main(String[] args) {
        Main main = new Main();
        main.panelMain = new PanelMain();
        main.panelAdmin = new PanelAdmin();
        main.NavigateTo("Main");
        main.setSize(300, 400);
        //main.setResizable(false);
        //main.pack();
        main.setLocationRelativeTo(null);
        main.setDefaultCloseOperation(EXIT_ON_CLOSE);
        main.setVisible(true);
    }

    public void NavigateTo(String panelId) {
        this.remove(panelMain);
        this.remove(panelAdmin);
        if (panelId == "Main") {
            this.add(panelMain);
        } else if (panelId == "Admin") {
            this.add(panelAdmin);
        }
        this.repaint();
    }
}
