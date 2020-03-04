package fo.tsk.jsi.Jgt01Basics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimationBoard extends JPanel
        implements ActionListener {

    private final int B_WIDTH = 350;
    private final int B_HEIGHT = 350;
    private final int INITIAL_X = 0;
    private final int INITIAL_Y = 175;
    private final int DELAY = 15;

    private Image star;
    private Timer timer;
    private int x, y;

    public AnimationBoard() {
        initBoard();
    }

    private void loadImage() {

        ImageIcon ii = new ImageIcon("src/resources/star.png");
        star = ii.getImage();
    }

    private void initBoard() {

        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

        loadImage();

        x = INITIAL_X;
        y = INITIAL_Y;

        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        drawStar(g);
    }

    private void drawStar(Graphics g) {

        g.drawImage(star, x, y, this);
        Toolkit.getDefaultToolkit().sync();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        x += 1;
        Double d = x*10*Math.PI/180;
        y = (int) (INITIAL_Y + Math.sin(d.intValue())*50);

        if (y > B_HEIGHT || x > B_WIDTH) {

            y = INITIAL_Y;
            x = INITIAL_X;
        }

        repaint();
    }
}
