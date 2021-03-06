package fo.tsk.jsi.Jgt01Basics;

import javax.swing.*;
import java.awt.*;

public class ImageBoard extends JPanel {

    private Image bardejov;

    public ImageBoard() {

        initBoard();
    }

    private void initBoard() {

        loadImage();

        int w = bardejov.getWidth(this);
        int h =  bardejov.getHeight(this);
        setPreferredSize(new Dimension(w, h));
    }

    private void loadImage() {

        ImageIcon ii = new ImageIcon("src/resources/img.png");
        bardejov = ii.getImage();
    }

    @Override
    public void paintComponent(Graphics g) {

        g.drawImage(bardejov, 0, 0, null);
    }
}
